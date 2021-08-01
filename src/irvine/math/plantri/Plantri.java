package irvine.math.plantri;

/* plantri.c :  generate imbedded planar graphs

  This program generates many different classes of graph imbedded on
  a sphere.  Exact specifications and instructions for use can be found
  in the separate manual plantri-guide.txt.

  The latest edition of plantri is available from the plantri page
  http://cs.anu.edu.au/~bdm/plantri .

  Authors:  Gunnar Brinkmann   gunnar@mathematik.uni-bielefeld.de
            Brendan McKay      bdm@cs.anu.edu.au

---------

   Output formats:

      The output for each graph consists of the number of vertices,
      then for each vertex a list of all its neighbours in clockwise
      order.  These neighbour lists are separated by a "separator",
      and terminated by a "terminator".

                             planar_code          ascii format
                              (default)            (with -a)

      file type               binary               text
      number of vertices      one byte          decimal + blank
      vertex names          bytes 1,2,3...        letters 'a','b',...
      separators              ZERO byte           comma ','
      terminator              ZERO byte           newline '\n'

      For example, the planar dual of the cube appears like this:

      planar_code:
         6 4 3 2 5 0 3 6 5 1 0 1 4 6 2 0 5 6 3 1 0 4 1 2 6 0 4 5 2 3 0
         (One number per byte, no newlines).

      ascii format:
         6 dcbe,cfea,adfb,efca,dabf,debc
         (Including the space after "6".  Followed by newline.)

      edge_code:
         See the manual.  At the moment there is a limit of 256 on the
         number of undirected edges.  This could be increased.

      For planar_code, the standard header ">>planar_code<<"
      (without null or newline) is written at the mStart of the
      output unless the -h switch is given.  Similarly for edge_code
      and the header ">>edge_code<<".

      Using -g or -s, the graph6 or sparse6 formats can be selected instead.
      These are ASCII formats for general undirected graphs, and do not
      encode the imbedding.  graph6 does not represent loops or edge
      multiplicities either.  They are described in plantri-guide.txt.

---------

Size limits:

The space used by plantri is O(n^2).  Apart from that, the only
practical limits on MAX_VERTICES (the maximum permitted number of vertices)
is determined by the limits imposed by the output syntax.

The following table gives the largest legal MAX_VERTICES value.

 Switches:    none    -d    -a    -ad    -g    -gd   -s    -sd      -u
 Output:      planar_code     ascii        graph6     sparse6      none
             primal  dual  primal dual  primal dual  primal dual
 MAX_VERTICES limit:  255    129     99     51   255   129    255   129    1023

 Switch -E and -Ed give edge_code output.  These have no limit on the
 number of vertices but (currently) a limit of 256 on the number of
 undirected edges.

The limits for ascii code could be raised to 114 and 59 easily.
For connectivity < 3, there is also a limit on n of the number of
bits in a long int (usually 32 or 64).

Change History:

        5-Jun-1996 : initial release of version 1.0
        7-Jun-1996 : fixed writing of planar_code header
                     small changes to plug-in facility
                     -- making 1.0.1
        9-Jun-1996 : included PLUGIN_INIT facility
                     -- making 1.0.2
       13-Jul-1996 : added -g switch
                     -- making 1.0.3
       31-Jul-1997 : added BIGTODOUBLE macro
                     -- making 1.0.4
        5-Aug-1997 : relaxed and documented MAX_VERTICES limit
                     -- making 1.0.5
       20-Sep-1998 : improved performance about 25%
                     replaced -A by -g and -g by -G
                     added 1-connected and 2-connected (-c and -x)
                     added 3-connected polytopes (-p)
                     added -s for sparse6 output
                     many small changes
                     -- making 2.0
        1-Sep-1999 : massive changes, including:
                     added minimum degree 4 case (-m4 and -c4)
                     added eulerian (dual bipartite) case (-b and -bc4)
                     added polygon triangulations (-P)
                     made some statistics optional (-v)
                     -- making 3.0
        2-Jul-2000 : fixed an error causing problems for minimum
                     degree 5 on 26 or more vertices.  Many thanks
                     to Thom Sulanke for finding it.  (Two changes in
                     scansimple().)
                     -- making 3.1
        5-Jul-2000 : removed some useless code from scansimple()

       11-Apr-2001 : added code for -c1 and -c2.
                     added -m5 native support (min5 plugin now obsolete)
                     added -q for quadrangulations
                     improved polytope generation
                     sparse6 output now represents loops only once
                     revised output format for -v
                     -- making 4.0

       20-Jul-2001 : extended makeDual() to set mFaceSize[] (note that
                     makeDual() is not actually used, but may be
                     useful for plug-ins)

       30-Aug-2001 : avoided all possible reads from elements outside arrays
                     (no known problem occured for distributed editions)

        5-Oct-2001 : corrected -m5 splitting (but it was probably not wrong)

       27-Oct-2001 : removed quadrangulations warning (now proved!)

       21-Nov-2001 : make quadrangulations from pseudo-double wheels
                     added -qc2

       23-Nov-2001 : added -qc4

        2-Dec-2001 : added -qc2m2

        8-Mar-2002 : added FAST_FILTER_* hooks
                     improved switch checking
                     added HELPMESSAGE option

        3-Oct-2004 : added PRE_FILTER_DISK

       27-Jul-2005 : added "void" prototypes, make CPUTIME more robust
                     -- making 4.1

        3-Aug-2005 : added -V

       13-Mar-2007 : some warnings removed, added dummy function to
                     avoid warnings of unused functions

       28-Jul-2007 : added -E for edge_code output

        2-Aug-2007 : added -bp for bipartite graphs
                   : added general planar graphs (-p) of 2 and 3 vertices

       19-Feb-2008 : fixed -pc1x and -pc2x

       21-Feb-2008 : slightly improved -p for minimal edge counts
                   : -p rejects some impossible edge counts with error msg

        2-May-2009 : fix incorrect connectivity computation in -p and -pb,
                       only known problems were with -c1x, -c2x and statistics
                       reported by -v
                     -- making 4.4

        2-Sep-2011 : also apply FAST_FILTER_* to starting graphs  (all uses
                       need checking against code as more than one filter
                       might need defining)
                     -- making 4.5

**************************************************************************/

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.MutableInteger;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;

/**
 * Java port of <code>plantri</code>.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine (Java port)
 */
public final class Plantri {

  static final int MAX_VERTICES = 64; // vertices
  /** Maximum number of edges supported. */
  public static final int MAX_EDGES = 6 * MAX_VERTICES - 12; // edges
  static final int MAX_FACES = 2 * MAX_VERTICES - 4; // faces
  static final int NUM_EDGES = 24 + 70 * MAX_VERTICES;

  static void checkRange(final int var, final String name, final int lo, final int hi) {
    if (var < lo || var > hi) {
      throw new IllegalArgumentException("The value " + var + " of " + name + " must be in [" + lo + "," + hi + "]");
    }
  }

  int mMaxNV;          /* order of output graphs */
  int mRes;
  int mMod;        /* mRes/mMod from command line (default 0/1) */
  int mSplitLevel;
  int mSplitCount;     /* used for mRes/mMod splitting */
  private int mMinConnec;      // Lower bound on minimum connectivity.
  private int mMinPolyConnec;  // Lower bound on minimum connectivity for polytopes.  Defaults to same as mMinConnec.
  private int mXConnec;        // Value of connectivity appropriate for -x. The same as either mMinConnec or mMinPolyConnec.

  final int[] mEdgeBound = new int[2];   // Edge count min,max for polytopes
  int mMaxFaceSize;    // Maximum face size for polytopes

  int mPolygonSize;    // Polygon size for -P. -1 means -P is absent, 0 means size is unrestricted

  private int mMinDegree;     // Lower bound on minimum degree. -1 means nothing specified
  private int mMinPolyDeg;    // Lower bound on minimum degree for polytopes. -1 will cause it to be reset to the same as mMinDegree

  //private static boolean sASwitch;        /* presence of command-line switches */
  private boolean mBipartiteSwitch;
  //private static boolean sGSwitch;
  //private static boolean sSSwitch;
  //private static boolean sBigESwitch;
  //private static boolean sHSwitch;
  //private static boolean sDSwitch;
  boolean mBigGSwitch;
  boolean mOuterPlanarSwitch;
  boolean mQuadrangulationSwitch;
  boolean mTSwitch;
  boolean mPolytopeSwitch;
  boolean mCountSwitch;
  boolean mVerbose;
  //private static boolean sBigVSwitch = false;
  boolean mExactSwitch;

  //  private static int zeroswitch;     /* Undocumented option -0 */
//  private static int oneswitch;      /* Undocumented option -1, implies -0 */
  boolean mTwoSwitch;      //  Undocumented option -2


  final EdgeFactory mEdgeFactory = new EdgeFactory();
  private final PlantriGraphState mState = new PlantriGraphState(mEdgeFactory, MAX_VERTICES, NUM_EDGES);
  private final Edge[] mEdges = mState.mEdges;
  private final int[] mDegree = mState.mDegree;
  private final Edge[] mFirstEdge = mState.mFirstEdge;

  //private static final Edge[] IN_MAX_FACE = new Edge[Plantri.MAX_VERTICES * Plantri.MAX_VERTICES - 3 * Plantri.MAX_VERTICES / 2];   /* Used for polytope generation - lists edges whose left face is maximum size */

  private final Numbering mNumbering = new Numbering(MAX_EDGES, mEdgeFactory);
  // Holds numberings produced by canon() or canonEdge()
  private final Numbering mSavedNumbering = new Numbering(MAX_EDGES, mEdgeFactory);

  //  //#define PCODE ">>planar_code<<"
//  //#define PCODELEN (sizeof(PCODE)-1)    /* "-1" to avoid the null */
//  //#define ECODE ">>edge_code<<"
//  //#define ECODELEN (sizeof(ECODE)-1)    /* "-1" to avoid the null */
//  //#define G6CODE ">>graph6<<"
//  //#define G6CODELEN (sizeof(G6CODE)-1)    /* "-1" to avoid the null */
//  //#define S6CODE ">>sparse6<<"
//  //#define S6CODELEN (sizeof(S6CODE)-1)    /* "-1" to avoid the null */

  // The vertices are numbered 0..mState.mNumVertices-1 if mMissingVertex<0, and
  // 0..mMissingVertex-1,mMissingVertex..mState.mNumVertices otherwise.  This is
  // only used in the code for polygon triangulations.
  //private int mMissingVertex = -1;

  final long[] mNOut = new long[6];      /* counts of output graphs, per connectivity */
  final long[] mNOutOp = new long[6];   /* counts of output graphs, per connectivity, OP */
  final long[] mNOutE = new long[MAX_EDGES / 2 + 1];  /* .. per undirected edge number */
  final long[] mNOutEOp = new long[MAX_EDGES / 2 + 1];  /* .. per undirected edge number, OP */
  final long[] mNOutP = new long[MAX_VERTICES + 1];  /* .. per polygon size */
  final long[] mNOutPOp = new long[MAX_VERTICES + 1];  /* .. per polygon size, OP */
  //static long sNOutV;        /* Deletions due to -V */
  final Marks mVertexMarks = new Marks(Plantri.MAX_VERTICES);

  PlantriGraphState getState() {
    return mState;
  }

  public long[] getEdgeCounts() {
    return Arrays.copyOf(mNOutE, mNOutE.length);
  }

//#define BOOLSWITCH(name,var)  \
//    else if (arg[j]==name) {CHECKSWITCH(name); var = true;}
//#define INTSWITCH(name,var)  \
//    else if (arg[j]==name) {CHECKSWITCH(name); var = getswitchvalue(arg,&j);}
//
//#define SECRET_SWITCHES "012"
//
///* Find the maximum degree */
//static int maxdegree() {
//    int maxd,i;
//
//    maxd = 0;
//    for (i = 0; i < mState.mNumVertices; ++i)
//        if (degree[i] > maxd) maxd = degree[i];
//
//    return maxd;
//}
//
///* Display the group stored in the usual place */
///*
//static void show_group(File *f, int nbTot, int nbOp)
//
//{
//    Edge[] *nb,**nblim;
//    int i;
//
//    fprintf(f,"mState.mNumVertices=%d mState.mNumEdges=%d nbTot=%d nbOp=%d\n",mState.mNumVertices,mState.mNumEdges,nbTot,nbOp);
//
//    if (nbTot == 1) return;
//
//    nblim = (Edge**)numbering[nbTot];
//    for (nb = (Edge**)numbering[0]; nb < nblim; nb += MAX_EDGES)
//    {
//        for (i = 0; i < mState.mNumEdges; ++i)
//            fprintf(f," %x-%x",nb[i].mStart,nb[i].mEnd);
//        fprintf(f,"\n");
//    }
//}
//*/

/* Routines for extending and reducing a triangulation.
   General principle:  extendx(e); reducex(e)  will extend by one
   vertex of degree x (x=3,4,5) then reduce it to the original graph.
   The final graph is exactly the same as the original
   (including pointer values) except that possibly the values of
   mFirstEdge[] might be different.
*/


  /* Count the non_facial triangles.
     Algorithm: we look for such triangles a-b-c-a, where a<b<c.
     For each b, mark the neighbours a < b.  Then, for each neighbour
     c > b, count the marked neighbours not consecutive to b.
  */
//  private static int nonFacialTriangles() {
//    int nt = 0;
//    for (int b = 1; b < mState.mNumVertices - 1; ++b) {
//      VERTEX.resetMarksVertex();
//      final Edge eLast = mFirstEdge[b];
//      Edge e = eLast;
//      do {
//        if (e.mEnd < b) {
//          VERTEX.markVertex(e.mEnd);
//        }
//        e = e.mNext;
//      } while (e != eLast);
//      do {
//        if (e.mEnd > b && mDegree[e.mEnd] >= 4) {
//          Edge eclast = e.mInverse;
//          Edge ec = eclast.mNext.mNext;
//          eclast = eclast.mPrev;
//          for (; ec != eclast; ec = ec.mNext) {
//            if (VERTEX.isMarkedVertex(ec.mEnd)) {
//              ++nt;
//            }
//          }
//        }
//        e = e.mNext;
//      } while (e != eLast);
//    }
//    return nt;
//  }

  void setExactConnectivity(final int connec) {
    mXConnec = connec;
  }

  void setMinConnectivity(final int connec) {
    mMinConnec = connec;
  }

  int getMinConnectivity() {
    return mMinConnec;
  }

  int getMinPolyConnectivity() {
    return mMinPolyConnec;
  }

  void setMinDegree(final int degree) {
    mMinDegree = degree;
  }

  int getMinDegree() {
    return mMinDegree;
  }

  int getMinPolyDegree() {
    return mMinPolyDeg;
  }

  void setMinPolyDegree(final int degree) {
    mMinPolyDeg = degree;
  }


  /* Test if there is a non-facial-triangle in a triangulation.
     Algorithm: we look for such triangles a-b-c-a, where a<b<c.
     For each b, mark the neighbours a < b.  Then, for each neighbour
     c > b, count the marked neighbours not consecutive to b.
  */
//  private static boolean hasNonFacialTriangle() {
//    for (int b = 1; b < mState.mNumVertices - 1; ++b) {
//      VERTEX.resetMarksVertex();
//      final Edge eLast = mFirstEdge[b];
//      Edge e = eLast;
//      do {
//        if (e.mEnd < b) {
//          VERTEX.markVertex(e.mEnd);
//        }
//        e = e.mNext;
//      } while (e != eLast);
//      do {
//        if (e.mEnd > b && mDegree[e.mEnd] >= 4) {
//          Edge eclast = e.mInverse;
//          Edge ec = eclast.mNext.mNext;
//          eclast = eclast.mPrev;
//          for (; ec != eclast; ec = ec.mNext) {
//            if (VERTEX.isMarkedVertex(ec.mEnd)) {
//              return true;
//            }
//          }
//        }
//        e = e.mNext;
//      } while (e != eLast);
//    }
//
//    return false;
//  }


//static int numbermarked()
//{
//  int list[MAX_VERTICES], i, mIndex, number, dummy, top, buffer;
//  Edge[] run;
//
//  for (top=0;(top<mState.mNumVertices) && isMarkedVertex(top);top++);
//  if (top==mState.mNumVertices) {fprintf(stderr,"SHIT\n"); exit(1); }
//
//  markVertex(top);
//  list[0]=top;
//  number=1;
//  mIndex=0;
//
//  while (mIndex<number)
//    { dummy=list[mIndex];
//    run=mFirstEdge[dummy];
//    for (i=0;i<degree[dummy];i++, run=run.mNext)
//      { buffer=run.mEnd;
//      if (!isMarkedVertex(buffer))
//      { markVertex(buffer); list[number]=buffer; number++; }
//      }
//    mIndex++;
//    }
//  return number;
//}
//
//static int hastwocut()
//{
//  int i,j;
//
//  for (i=0;i<mState.mNumVertices-1;i++)
//    for (j=i+1;j<mState.mNumVertices;j++)
//      { resetMarksVertex();
//      markVertex(i); markVertex(j);
//      if (numbermarked()<(mState.mNumVertices-2)) return 1;
//      }
//  return 0;
//}
//
//static int hascutvertex()
//{int i;
//
// if (mState.mNumVertices>2) { for (i=0;i<mState.mNumVertices;i++) if (degree[i]==1) return 1; }
//
// for (i=0;i<mState.mNumVertices;i++)
//   {resetMarksVertex();
//   markVertex(i);
//   if (numbermarked()<(mState.mNumVertices-1)) return 1; }
//
//   return 0;
//}
//
//static int connectivity()
///* Connectivity - very slow, testing only.
//   Returns 3 for connectivity >= 3. */
//{
//
//  if (hascutvertex()) return 1;
//  if (hastwocut()) return 2;
//  return 3;
//}
//
//
//static int numedgeorbits(int nbTot, int nbOp)
//
///* return number of orbits of directed edges, under the
//   orientation-preserving automorphism group (assumed computed) */
//{
//    Edge[] *nb0,**nblim,**nb;
//    int i,j;
//
//    if (nbTot == 1)
//        return mState.mNumEdges;
//    else
//    {
//        nb0 = (Edge**) numbering[0];
//        if (nbOp == 0) nblim = (Edge**) numbering[nbTot];
//        else           nblim = (Edge**) numbering[nbOp];
//
//        resetMarks();
//
//        j = 0;
//        for (i = 0; i < mState.mNumEdges; ++i, ++nb0)
//            if (!isMarkedLo(*nb0))
//            {
//                ++j;
//                for (nb = nb0; nb < nblim; nb += MAX_EDGES) markLo(*nb);
//            }
//        return j;
//    }
//}
//
//
//static int numfaceorbits(int nbTot, int nbOp)
//
///* return number of orbits of faces, under the full group
//   (assumed computed).  This is supposed to work even if the
//   graph is only 1-connected. */
//{
//    Edge[] *nb0,**nblim,**nb,**nbOplim;
//    Edge[] e,*eLast,*ee;
//    int i,count;
//
//    resetMarks();
//    count = 0;
//
//    if (nbTot == 1)
//    {
//        for (i = 0; i < mState.mNumVertices; ++i)
//        {
//            e = eLast = mFirstEdge[i];
//            do
//            {
//                if (!isMarkedLo(e))
//                {
//                    ++count;
//                    ee = e;
//                    do
//                    {
//                        markLo(ee);
//                        ee = ee.mInverse.mPrev;
//                    } while (ee != e);
//                }
//                e = e.mNext;
//            } while (e != eLast);
//        }
//    }
//    else
//    {
//        nb0 = (Edge**) numbering[0];
//        nblim = (Edge**) numbering[nbTot];
//        nbOplim = (Edge**)numbering[nbOp==0?nbTot:nbOp];
//
//        for (i = 0; i < mState.mNumEdges; ++i) nb0[i].mIndex = i;
//
//        for (i = 0; i < mState.mNumVertices; ++i)
//        {
//            e = eLast = mFirstEdge[i];
//            do
//            {
//                if (!isMarkedLo(e))
//                {
//                    ++count;
//                    ee = e;
//                    do
//                    {
//                        for (nb = nb0+ee.mIndex; nb < nbOplim; nb += MAX_EDGES)
//                            markLo(*nb);
//                        for ( ; nb < nblim; nb += MAX_EDGES)
//                            markLo((*nb).mInverse);
//                        ee = ee.mInverse.mPrev;
//                    } while (ee != e);
//                }
//                e = e.mNext;
//            } while (e != eLast);
//        }
//    }
//
//    return count;
//}
//
//
//static int numopfaceorbits(int nbTot, int nbOp)
//
///* return number of orbits of faces, under the orientation-preserving
//   group (assumed computed).  This is supposed to work even if the
//   graph is only 1-connected. */
//{
//    Edge[] *nb0,**nb,**nbOplim;
//    Edge[] e,*eLast,*ee;
//    int i,count;
//
//    resetMarks();
//    count = 0;
//
//    if (nbTot == 1)
//    {
//        for (i = 0; i < mState.mNumVertices; ++i)
//        {
//            e = eLast = mFirstEdge[i];
//            do
//            {
//                if (!isMarkedLo(e))
//                {
//                    ++count;
//                    ee = e;
//                    do
//                    {
//                        markLo(ee);
//                        ee = ee.mInverse.mPrev;
//                    } while (ee != e);
//                }
//                e = e.mNext;
//            } while (e != eLast);
//        }
//    }
//    else
//    {
//        nb0 = (Edge**) numbering[0];
//        nbOplim = (Edge**)numbering[nbOp==0?nbTot:nbOp];
//
//        for (i = 0; i < mState.mNumEdges; ++i) nb0[i].mIndex = i;
//
//        for (i = 0; i < mState.mNumVertices; ++i)
//        {
//            e = eLast = mFirstEdge[i];
//            do
//            {
//                if (!isMarkedLo(e))
//                {
//                    ++count;
//                    ee = e;
//                    do
//                    {
//                        for (nb = nb0+ee.mIndex; nb < nbOplim; nb += MAX_EDGES)
//                            markLo(*nb);
//                        ee = ee.mInverse.mPrev;
//                    } while (ee != e);
//                }
//                e = e.mNext;
//            } while (e != eLast);
//        }
//    }
//
//    return count;
//}
//
//
//static int numorbits(int nbTot, int nbOp)
//
///* return number of orbits of vertices, under the full group
//   (assumed computed). */
//
//{
//    Edge[] *nb0,**nblim,**nb;
//    int vindex[MAX_VERTICES];
//    int i,count;
//
//    if (nbTot == 1) return mState.mNumVertices;
//
//    nb0 = (Edge**) numbering[0];
//    nblim = (Edge**) numbering[nbTot];
//
//    for (i = 0; i < mState.mNumEdges; ++i) vindex[nb0[i].mStart] = i;
//
//    resetMarksVertex();
//
//    count = 0;
//    for (i = 0; i < mState.mNumVertices; ++i)
//        if (!isMarkedVertex(i))
//        {
//            ++count;
//            for (nb = nb0+vindex[i]; nb < nblim; nb += MAX_EDGES)
//                markVertex((*nb).mStart);
//        }
//
//    return count;
//}
//
//
//static int numoporbits(int nbTot, int nbOp)
//
///* return number of orbits of vertices, under the orientation-preserving
//   group (assumed computed). */
//
//{
//    Edge[] *nb0,**nb,**nbOplim;
//    int vindex[MAX_VERTICES];
//    int i,count;
//
//    if (nbTot == 1) return mState.mNumVertices;
//
//    nb0 = (Edge**) numbering[0];
//    nbOplim = (Edge**)numbering[nbOp==0?nbTot:nbOp];
//
//    for (i = 0; i < mState.mNumEdges; ++i) vindex[nb0[i].mStart] = i;
//
//    resetMarksVertex();
//
//    count = 0;
//    for (i = 0; i < mState.mNumVertices; ++i)
//        if (!isMarkedVertex(i))
//        {
//            ++count;
//            for (nb = nb0+vindex[i]; nb < nbOplim; nb += MAX_EDGES)
//                markVertex((*nb).mStart);
//        }
//
//    return count;
//}
//
///* return number of orbits of directed edges in the face to
//   the left of edge e, under the orientation-preserving
//   automorphism group (assumed computed) */
//
//static int numorbitsonface(int nbTot, int nbOp, Edge[] e)
//
//{
//    Edge[] *nb0,**nblim,**nb;
//    Edge[] e1;
//    int i,j;
//
//    resetMarks();
//
//    j = 0;
//    e1 = e;
//    do
//    {
//        markLo(e1);
//        ++j;
//        e1 = e1.mInverse.mNext;
//    } while (e1 != e);
//
//    if (nbTot == 1)
//        return j;
//    else
//    {
//        nb0 = (Edge**) numbering[0];
//        if (nbOp == 0) nblim = (Edge**) numbering[nbTot];
//        else           nblim = (Edge**) numbering[nbOp];
//
//        j = 0;
//        for (i = 0; i < mState.mNumEdges; ++i, ++nb0)
//            if (isMarkedLo(*nb0))
//            {
//                ++j;
//                for (nb = nb0; nb < nblim; nb += MAX_EDGES) unmark(*nb);
//            }
//        return j;
//    }
//}


  /* initialize stars and create initial K4, for ordinary triangulations */
  void initializeTriang() {
    Triang.init(mState);
    mSimpleScanner.mDeg3.extend(mEdges[0]);
  }

  // An edge in the clockwise orientation of each face.  Only valid when computed.
  private final Edge[] mFaceStart = PlantriGraphState.initEdgeArray(mEdgeFactory, MAX_FACES);
  private final int[] mFaceSize = new int[MAX_FACES];

  /**
   * Store in the <code>mRightFace</code> field of each edge the number of the face on
   * the right hand side of that edge.  Faces are numbered 0,1,....  Also
   * store in <code>mFaceStart[i]</code> an example of an edge in the clockwise orientation
   * of the face boundary, and the size of the face in <code>mFaceSize[i]</code>, for each i.
   * @return the number of faces.
   */
  public int makeDual() {
    mEdgeFactory.resetMarks(mEdges);
    final int nvlim = mState.mNumVertices; // + (mMissingVertex >= 0 ? 1 : 0);
    int nf = 0;
    for (int i = 0; i < nvlim; ++i) {
//      if (i == mMissingVertex) {
//        continue;
//      }
      final Edge ex = mFirstEdge[i];
      Edge e = ex;
      do {
        if (!mEdgeFactory.isMarkedLo(e)) {
          mFaceStart[nf] = e;
          Edge ef = e;
          int sz = 0;
          do {
            ef.mRightFace = nf;
            mEdgeFactory.markLo(ef);
            ef = ef.mInverse.mPrev;
            ++sz;
          } while (ef != e);
          mFaceSize[nf] = sz;
          ++nf;
        }
        e = e.mNext;
      } while (e != ex);
    }
    return nf;
  }

  /**
   * Construct the dual graph corresponding to the current state.
   * @return dual graph
   */
  public Graph makeDualGraph() {
    final int nf = makeDual();
    final Graph g = GraphFactory.create(nf);
    for (int k = 0; k < nf; ++k) {
      Edge e = mFaceStart[k];
      do {
        g.addEdge(e.mRightFace, e.mInverse.mRightFace);
        e = e.mInverse.mPrev;
      } while (e != mFaceStart[k]);
    }
    return g;
  }

///* Computes a code by numbering the edges and
//   then listing them in code. Code consists of a header (of varying length
//   -- see below) and a sequence of entries coding edge numbers and separators
//   of length mState.mNumEdges+mState.mNumVertices-1. In this program char will always provide enough
//   room to number the edges.
//
//   We will first describe how the default code works:
//   All entries are char. The first char encodes the
//   length of the code that follows (so it is not including the 1 byte for
//   the header). The numbers of the edges are 0 to 254
//   and the byte 255 is always used as a separator between 2 lists of edges.
//   The first segment from entry 2 (so the first non-header-entry) until the
//   first separator contains
//   the edges around vertex 1 in clockwise order. The second segment between
//   the first separator and the second contains the edges around vertex 2 in
//   clockwise order, etc. Every edgenumber occurs exactly twice.
//
//   In case of a given directed starting edge in sCodeEdge, this edge is
//   numbered 0 and starts at the vertex corresponding to the first list.
//
//   In plantri it can't happen (at the moment) that 254 is not enough to
//   encode the edges, but it can happen that 255 is not sufficient to encode
//   the length of the following code. In this case the first byte is 0 --
//   meaning: interpret the second byte as information about sizes of
//   the entries. The first 4 bits encode the number of bytes used to
//   encode the codesize and the second 4 (those with lower value) encode
//   the number of bytes used to encode the edge numbers. In plantri it will
//   never be necessary to use more than 1 byte for the edgenumbers and 2
//   for the codesize. So in case the first byte is 0, the second will
//   always be (2<<4)+1. The separator is always one byte with value 255.
//
//   A sequence of bytes will always be interpreted in a big-endian way. So
//   the first byte is the most significant one. In order to be able to
//   recognize separators in cases where more than 1 byte is used to encode
//   edges, we never use numbers for the edges where the most significant
//   8 bits are 1. So if n bytes are used for the edges, the largest number
//   used is (1<<n)-1-(1<<(n-1)).
//*/
//
//static void compute_edgecode(char code[], int[] length, int[] headerlength)
//
//{
//    Edge[] run;
//    int i,j, startvertex;
//    int edgenumber, limitnv;
//
//    resetMarks();
//
//    if (mMissingVertex>=0) limitnv=mState.mNumVertices+1; else limitnv=mState.mNumVertices;
//
//    i=mState.mNumVertices+mState.mNumEdges-1;
//
//    if (i<256) { *code=i; code++; *length=i+1; *headerlength=1;}
//    else
//      { *code=0; code++;
//        *code=(2<<4)+1; code++;
//        *code=i>>8; code++;
//        *code=i&255; code++;
//        *headerlength=4;
//        *length=i+4;
//      }
//
//    if (sCodeEdge==null) run=mFirstEdge[0];
//    else { run=sCodeEdge; }
//    startvertex=run.mStart;
//    //mark(run);
//    mark(run.mInverse);
//    //run.mIndex=
//    run.mInverse.mIndex=*code=0;
//    code++; run=run.mNext;
//
//    edgenumber = 1;
//
//    for (j=1; j<degree[startvertex]; ++j, run=run.mNext)
//      {
//        if (isMarked(run)) { *code = run.mIndex; code++; }
//        else { //mark(run);
//               mark(run.mInverse);
//               //run.mIndex=
//               run.mInverse.mIndex= *code =edgenumber; code++;
//               edgenumber++;
//             }
//      }
//    *code=255; code++;
//
//    for (i=0;i<limitnv;i++)
//      if ((i!=startvertex) && (i!=mMissingVertex))
//        {
//          for (j=0, run=mFirstEdge[i]; j<degree[i]; ++j, run=run.mNext)
//            {
//              if (isMarked(run)) { *code = run.mIndex; code++; }
//              else { //mark(run);
//                mark(run.mInverse);
//                //run.mIndex=
//                run.mInverse.mIndex=edgenumber;
//                *code=edgenumber; code++;
//                edgenumber++;
//              }
//            }
//          *code=255;  code++;
//        }
//    return;
//}
//
//
//static void compute_dual_edgecode(char code[], int[] length, int[] headerlength)
//
///* See compute_edgecode. It directly computes the code of the dual.
//   In case sCodeEdge is given, the first list of edges corresponds
//   to the vertex representing the outer face.
//*/
//
//{
//    Edge[] run, *mStart;
//    int i,j ;
//    int edgenumber, limitnv;
//
//    resetMarks();
//
//    if (mMissingVertex>=0) limitnv=mState.mNumVertices+1; else limitnv=mState.mNumVertices;
//
//    i=mState.mNumEdges+(mState.mNumEdges/2)-mState.mNumVertices+1;
//
//    if (i<256) { *code=i; code++; *length=i+1; *headerlength=1;}
//    else
//      { *code=0; code++;
//        *code=(2<<4)+1; code++;
//        *code=i>>8; code++;
//        *code=i&255; code++;
//        *headerlength=4;
//        *length=i+4;
//      }
//
//    if (sCodeEdge==null) mStart=mFirstEdge[0];
//    else { mStart=sCodeEdge; }
//    run=mStart;
//    edgenumber=0;
//    do
//      {
//        if (isMarked(run)) { *code=run.mIndex; code++; }
//        else /* so the other side has not yet been visited */
//          {
//            markLo(run.mInverse);
//          /* numbered but left hand face not yet listed. In case of bridges it can even
//             happen for the first face that the other side is already marked high.*/
//            //run.mIndex is never used in the future
//            run.mInverse.mIndex=*code=edgenumber; code++;
//            edgenumber++;
//          }
//        markHi(run); /* is numbered and face on the left has already been listed */
//        run=run.mPrev.mInverse;
//      } while (run!=mStart);
//    *code=255; code++;
//
//    /* that was to make sure that in the case of disc triangulations the right mStart
//       is taken -- now the rest */
//
//
//    for (i=0;i<limitnv;i++)
//      if (i!=mMissingVertex)
//      for (j=0, mStart=mFirstEdge[i]; j<degree[i]; ++j, mStart=mStart.mNext)
//        if (!isMarkedHi(mStart))/* a new face to be coded */
//            {  run=mStart;
//            do
//              {
//                if (isMarked(run)) { *code=run.mIndex; code++;}
//                else /* so the other side has not yet been visited */
//                  {
//                  markLo(run.mInverse);
//                  run.mInverse.mIndex=*code=edgenumber; code++;
//                  edgenumber++;
//                  }
//                markHi(run);
//                run=run.mPrev.mInverse;
//              } while (run!=mStart);
//            *code=255; code++;
//            }
//    return;
//}
//
//
//static void mirror_of_edgecode(char newcode[], char oldcode[],
//                        int preserve, int totallength, int headerlength)
//{
//  /* copies oldcode to newcode by reversing the rotational order inside
//     the lists. In case "preserve" is not 0, it is made sure that the
//     face on the left hand side of edge 1 starting at the vertex corresponding
//     to the first list is the same afterwards when interpreting the output
//     in clockwise order both times
//
//     In case of "preserve" the routine relies on the first entry of oldcode
//     except the vertexnumber being 1. This is guaranteed by compute_edgecode.
//
//*/
//
//  int i, number[MAX_EDGES/2];
//  char *run,*mStart,*mEnd, *last;
//
//  last=newcode+totallength;
//
//  for (i=0;i<headerlength;i++) newcode[i]=oldcode[i];
//
//  if (!preserve)
//    { newcode+=headerlength;
//      mStart=mEnd=oldcode+headerlength-1;
//      while(newcode<last)
//        {
//          for (run=mEnd+1; *run!=255; ++run);
//          mEnd=run;
//          for (run--; run!=mStart; --run, newcode++) *newcode=*run;
//          *newcode=255; newcode++;
//          mStart=mEnd;
//        }
//      return;
//    }
//
//  /* else -- do preserve the face */
//
//  for (i=0; i<mState.mNumEdges/2; ++i) number[i]=i;
//  if (oldcode[headerlength]!=0)
//    { fprintf(stderr,"Problem in mirror_of_edgecode -- read function description.\n");
//      exit(1); }
//  for (run=oldcode+headerlength;*run!=255;run++);
//  mEnd=run;
//  run--;
//  number[0]=*run; number[*run]=0;
//  newcode+=headerlength;
//  for ( ; run!=(oldcode+headerlength-1); --run) { *newcode=number[*run]; newcode++; }
//  *newcode=255; newcode++;
//  mStart=mEnd;
//
//  while(newcode<last)
//    {
//      for (run=mEnd+1; *run!=255; ++run);
//      mEnd=run;
//      for ( run--; run!=mStart; --run, newcode++) *newcode=number[*run];
//      *newcode=255; newcode++;
//      mStart=mEnd;
//    }
//  return;
//
//}
//static void compute_code(char code[])
//
///* computes a code by numbering the vertices in a breadth first manner and
//   then listing them in code. Code is a sequence of numbers of length mState.mNumEdges+mState.mNumVertices+1.
//   The first entry is the number of vertices.
//   Then the numbers of the vertices adjacent to the vertex numbered 1 are
//   given -- ended by a 0, and listed in clockwise orientation.
//   Then those adjacent to 2, ended by a 0, etc. . In case of no
//   double edges, the identification of the corresponding "half edges" leaving
//   each vertex is unique. Nevertheless also for this case the following rules
//   apply (not in the definition of the code, but in this routine):
//
//   In case of double edges, the first time a new vertex
//   b occurs in the list, say it is in the list of vertex a, must be matched
//   with the first occurence of vertex a in the list of b. In this routine
//   it will always be the first position in the list of b.
//
//   This spanning tree
//   gives a unique matching for the other "half edges" -- provided the fact
//   that the ordering comes from an embedding on the sphere.
//
//   In case of a given starting edge in sCodeEdge, the mStart of this
//   edge is numbered 1 and the mEnd 2.
//*/
//{
//    Edge[] run;
//    int vertex;
//    Edge[] temp;
//    Edge[] startEdge[MAX_VERTICES+1];
//    int number[MAX_VERTICES+1], i;
//    int last_number, actual_number;
//    Edge[] givenEdge;
//
//    for (i = 0; i < mState.mNumVertices; ++i) number[i] = 0;
//
//    *code=mState.mNumVertices; code++;
//    if (sCodeEdge==null) givenEdge=mFirstEdge[0];
//    else { givenEdge=sCodeEdge; number[mState.mNumVertices]=0; }
//    number[givenEdge.mStart] = 1;
//    if (givenEdge.mStart != givenEdge.mEnd)
//      {
//        number[givenEdge.mEnd] = 2;
//        last_number = 2;
//        startEdge[1] = givenEdge.mInverse;
//      }
//    else  last_number = 1;
//
//    actual_number = 1;
//    temp = givenEdge;
//
//    while (last_number < mState.mNumVertices)
//    {   *code=number[temp.mEnd]; code++;
//        for (run = temp.mNext; run != temp; run = run.mNext)
//          { vertex = run.mEnd;
//            if (!number[vertex])
//              { startEdge[last_number] = run.mInverse;
//                last_number++; number[vertex] = last_number;
//                *code = last_number; }
//            else *code = number[vertex];
//            code++;
//          }
//        *code = 0;  code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//
//    while (actual_number <= mState.mNumVertices)
//    {          *code=number[temp.mEnd]; code++;
//        for (run = temp.mNext; run != temp; run = run.mNext)
//          {
//            *code = number[run.mEnd]; code++;
//          }
//        *code = 0;
//        code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//}
//
//
//static void compute_code_mirror(char code[])
//
///* In the case of no double edges -- that is when the identifications are
//   clear -- there is no problem in just returning the inverse order of
//   the previously computed code. Nevertheless in the case where edge
//   identifications must be made via the spanning tree described in the code,
//   this is not that easy, so we can as well just compute mirror code just
//   like the normal code computed before.
//
//   In case sCodeEdge is not null, its mStart is numbered 1 and its
//   mEnd is numbered 0.
//*/
//{
//    Edge[] run;
//    int vertex;
//    Edge[] temp;
//    Edge[] startEdge[MAX_VERTICES+1];
//    int number[MAX_VERTICES+1], i;
//    int last_number, actual_number;
//    Edge[] givenEdge;
//
//    for (i = 0; i < mState.mNumVertices; ++i) number[i] = 0;
//
//    *code=mState.mNumVertices; code++;
//    if (sCodeEdge==null) givenEdge=mFirstEdge[0];
//    else { givenEdge=sCodeEdge.mInverse; number[mState.mNumVertices]=0; }
//    number[givenEdge.mStart] = 1;
//    if (givenEdge.mStart != givenEdge.mEnd)
//      {
//        number[givenEdge.mEnd] = 2;
//        last_number = 2;
//        startEdge[1] = givenEdge.mInverse;
//      }
//    else  last_number = 1;
//
//    actual_number = 1;
//    temp = givenEdge;
//
//    while (last_number < mState.mNumVertices)
//    {   *code=number[temp.mEnd]; code++;
//        for (run = temp.mPrev; run != temp; run = run.mPrev)
//          { vertex = run.mEnd;
//            if (!number[vertex])
//              { startEdge[last_number] = run.mInverse;
//                last_number++; number[vertex] = last_number;
//                *code = last_number; }
//            else *code = number[vertex];
//            code++;
//          }
//        *code = 0;  code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//
//    while (actual_number <= mState.mNumVertices)
//    {          *code=number[temp.mEnd]; code++;
//        for (run = temp.mPrev; run != temp; run = run.mPrev)
//          {
//            *code = number[run.mEnd]; code++;
//          }
//        *code = 0;
//        code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//}
//
//
//static void compute_dual_code(char code[])
//
///* works like compute_code -- only for the dual */
//
//{
//    Edge[] run, *run2;
//    Edge[] temp;
//    Edge[] startEdge[MAX_FACES+1];
//    int number[MAX_FACES+1], i;
//    int last_number, actual_number;
//    int nf;
//    Edge[] givenEdge;
//
//    nf=2+(mState.mNumEdges/2)-mState.mNumVertices;
//    *code=nf; code++;
//    resetMarks(); /* The face on the right has already been numbered if
//                   and only if it is marked. */
//    for (i = 0; i < nf; ++i) number[i] = 0;
//
//    if (sCodeEdge==null) givenEdge=mFirstEdge[0];
//    else givenEdge=sCodeEdge.mInverse;
//
//    run=givenEdge;
//    do { markLo(run); run.mRightFace=1; run=run.mInverse.mPrev;
//       } while (run!=givenEdge);
//    if (!isMarked(givenEdge.mInverse)) /* no loop in the dual at this point[] /
//      { run2=run=givenEdge.mInverse;
//        do { markLo(run2); run2.mRightFace=2; run2=run2.mInverse.mPrev;
//           } while (run2!=run);
//        last_number = 2;
//        startEdge[1] = givenEdge; /* the startEdge has the face it belongs
//                                     to on the LEFT */
//      }
//    else  last_number = 1;
//
//    actual_number = 1;
//    temp = givenEdge.mInverse;
//    while (last_number < nf)
//    {
//        *code= temp.mRightFace; code++;
//        for (run = temp.mPrev.mInverse; run != temp; run = run.mPrev.mInverse)
//          /* run also has the face it runs around on the left */
//          { if (!isMarked(run))
//            { startEdge[last_number] = run.mInverse;
//              last_number++;
//              run2=run;
//              do
//                { markLo(run2);
//                  run2.mRightFace=last_number;
//                  run2=run2.mInverse.mPrev;
//                } while (run2!=run);
//              *code = last_number;
//            }
//            else *code=run.mRightFace;
//            code++;
//          }
//        *code = 0;  code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//
//    while (actual_number <= nf)
//    {          *code=temp.mRightFace; code++;
//        for (run = temp.mPrev.mInverse; run != temp; run = run.mPrev.mInverse)
//          {
//            *code = run.mRightFace; code++;
//          }
//        *code = 0;
//        code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//}
//
//
//static void compute_dual_code_mirror(char code[])
//
///* works like compute_code_mirror -- only for the dual */
//
//{
//    Edge[] run, *run2;
//    Edge[] temp;
//    Edge[] startEdge[MAX_FACES+1];
//    int number[MAX_FACES+1], i;
//    int last_number, actual_number;
//    int nf;
//    Edge[] givenEdge;
//
//    nf=2+(mState.mNumEdges/2)-mState.mNumVertices;
//    *code=nf; code++;
//    resetMarks(); /* The face on the right has already been numbered
//                   if and only if it is marked. */
//    for (i = 0; i < nf; ++i) number[i] = 0;
//
//    if (sCodeEdge==null) givenEdge=mFirstEdge[0];
//    else givenEdge=sCodeEdge.mInverse;
//
//    run=givenEdge;
//    do { markLo(run); run.mRightFace=1; run=run.mInverse.mPrev;
//       } while (run!=givenEdge);
//    if (!isMarked(givenEdge.mInverse)) /* no loop in the dual at this point[] /
//      { run2=run=givenEdge.mInverse;
//        do { markLo(run2); run2.mRightFace=2; run2=run2.mInverse.mPrev;
//           } while (run2!=run);
//        last_number = 2;
//        startEdge[1] = givenEdge; /* the startEdge has the face it
//                                     belongs to on the LEFT */
//      }
//    else  last_number = 1;
//
//    actual_number = 1;
//    temp = givenEdge.mInverse;
//
//    while (last_number < nf)
//    {
//        *code= temp.mRightFace; code++;
//        for (run = temp.mInverse.mNext; run != temp; run = run.mInverse.mNext)
//          /* run also has the face it runs around on the left */
//          { if (!isMarked(run))
//            { startEdge[last_number] = run.mInverse;
//              last_number++;
//              run2=run;
//              do
//                { markLo(run2); run2.mRightFace=last_number;
//                  run2=run2.mInverse.mPrev;
//                } while (run2!=run);
//              *code = last_number;
//            }
//          else *code=run.mRightFace;
//          code++;
//          }
//        *code = 0;  code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//
//    while (actual_number <= nf)
//    {          *code=temp.mRightFace; code++;
//        for (run = temp.mInverse.mNext; run != temp; run = run.mInverse.mNext)
//          {
//            *code = run.mRightFace; code++;
//          }
//        *code = 0;
//        code++;
//        temp = startEdge[actual_number];  actual_number++;
//    }
//}
//static void write_alpha(File *f, int doflip)
//
///* Write in alphabetic format.  Always write in mNext direction,
//   and if doflip != 0 also write in mPrev direction. */
//{
//    int i, j, mStart;
//    char code[MAX_VERTICES+MAX_EDGES+4];
//    char precode[MAX_VERTICES+MAX_EDGES+1];
//    size_t length;
//
//    length=mState.mNumVertices+mState.mNumEdges;
//    compute_code(precode);
//
//    if (mState.mNumVertices >= 10)
//    {
//        code[0] = '0' + mState.mNumVertices/10;
//        code[1] = '0' + mState.mNumVertices%10;
//        code[2] = ' ';
//        length += 3;
//        mStart=3;
//    }
//    else
//    {
//        code[0] = '0' + mState.mNumVertices;
//        code[1] = ' ';
//        length += 2;
//        mStart=2;
//    }
//
//    for (i = 1, j=mStart; j < length; ++i, ++j)
//        if (precode[i]==0) code[j]=',';
//        else code[j]=precode[i]-1+'a';
//
//    code[j-1]='\n';
//    if (fwrite(code,sizeof(char),length,f) != length)
//    {
//        fprintf(stderr,">E %s: fwrite() failed\n",cmdname);
//        perror(">E ");
//        exit(1);
//    }
//    if (doflip)
//      { compute_code_mirror(precode);
//        for (i = 1, j=mStart; j < length; ++i, ++j)
//            if (precode[i]==0) code[j]=',';
//            else code[j]=precode[i]-1+'a';
//        code[j-1]='\n';
//        if (fwrite(code,sizeof(char),length,f) != length)
//          {
//            fprintf(stderr,">E %s: fwrite() failed\n",cmdname);
//            perror(">E ");
//            exit(1);
//          }
//      }
//}
//static void write_code_as_sparse6(File *f, char code[])
//
///* Write a graph represented in planar_code to a file in sparse6 format.
//   The imbedding is lost but the vertex numbering is the same.  This
//   does not use any global variables and works to 255 vertices. */
//
//{
//    char *pin,*pout;
//    char s6[20+2*MAX_EDGES+2*MAX_FACES];
//    int n,nb,i,j,lastj,x,k,r,rr,topbit;
//    int loopcount;
//
//    pin = code;
//    n = *pin++;
//    pout = s6;
//    *pout++ = ':';
//
//    if (n <= 62)
//        *pout++ = 63 + n;
//    else
//    {
//        *pout++ = 63 + 63;
//        *pout++ = 63 + 0;
//        *pout++ = 63 + (n >> 6);
//        *pout++ = 63 + (n & 0x3F);
//    }
//
//    for (i = n-1, nb = 0; i != 0 ; i >>= 1, ++nb) {}
//    topbit = 1 << (nb-1);
//    k = 6;
//    x = 0;
//
//    lastj = 0;
//    for (j = 0; j < n; ++j)
//    {
//        loopcount = 0;   /* The input code shows loops once from each mEnd,
//                            but we want each loop just once in sparse6. */
//        while ((i = *pin++) != 0)
//        {
//            --i;
//            if (i < j || (i == j && ((++loopcount)&1)))
//            {
//                if (j == lastj)
//                {
//                    x <<= 1;
//                    if (--k == 0)
//                    {
//                        *pout++ = 63 + x;
//                        k = 6;
//                        x = 0;
//                    }
//                }
//                else
//                {
//                    x = (x << 1) | 1;
//                    if (--k == 0)
//                    {
//                        *pout++ = 63 + x;
//                        k = 6;
//                        x = 0;
//                    }
//                    if (j > lastj+1)
//                    {
//                        for (r = 0, rr = j; r < nb; ++r, rr <<= 1)
//                        {
//                            if (rr & topbit) x = (x << 1) | 1;
//                            else             x <<= 1;
//                            if (--k == 0)
//                            {
//                                *pout++ = 63 + x;
//                                k = 6;
//                                x = 0;
//                            }
//                        }
//                        x <<= 1;
//                        if (--k == 0)
//                        {
//                            *pout++ = 63 + x;
//                            k = 6;
//                            x = 0;
//                        }
//                    }
//                    lastj = j;
//                }
//                for (r = 0, rr = i; r < nb; ++r, rr <<= 1)
//                {
//                    if (rr & topbit) x = (x << 1) | 1;
//                    else             x <<= 1;
//                    if (--k == 0)
//                    {
//                        *pout++ = 63 + x;
//                        k = 6;
//                        x = 0;
//                    }
//                }
//            }
//        }
//    }
//
//    if (k != 6) *pout++ = 63 + ((x << k) | ((1 << k) - 1));
//
//    *pout++ = '\n';
//    k = pout - s6;
//
//    if (fwrite(s6,sizeof(char),(size_t)k,f) != k)
//    {
//        fprintf(stderr,">E %s: fwrite() failed\n",cmdname);
//        perror(">E ");
//        exit(1);
//    }
//}
//
//
//static void write_sparse6(File *f, int doflip)
//
///* Write in sparse6 format.  doflip is ignored. */
//{
//    char code[MAX_VERTICES+MAX_EDGES+1];
//
//    compute_code(code);
//    write_code_as_sparse6(f,code);
//}
//
//
//static void write_dual_sparse6(File *f, int doflip)
//
///* Write dual cubic graph in sparse6 format.  doflip is ignored. */
//{
//    char code[MAX_FACES+MAX_EDGES+1];
//
//    compute_dual_code(code);
//    write_code_as_sparse6(f,code);
//}
//
//
//static void write_code_as_graph6(File *f, char code[])
//
///* Write a graph represented in planar_code to a file in graph6 format.
//   The imbedding is lost, loops are lost, and multiple edges are changed
//   to one edge.  The vertex numbering is the same.  This does not use any
//   global variables and works to 255 vertices. */
//
//{
//    char g6[20+MAX_FACES*(MAX_FACES-1)/12];
//    char *pin,*pout;
//    int n,nlen,bodylen,i,j,org;
//    static char g6bit[] = {32,16,8,4,2,1};
//
//    pin = code;
//    n = *pin++;
//
//    if (n <= 62)
//    {
//        g6[0] = 63 + n;
//        nlen = 1;
//    }
//    else
//    {
//        g6[0] = 63 + 63;
//        g6[1] = 63 + 0;
//        g6[2] = 63 + (n >> 6);
//        g6[3] = 63 + (n & 0x3F);
//        nlen = 4;
//    }
//
//    pout = g6 + nlen;
//    bodylen = ((n * (n-1)) / 2 + 5) / 6;
//    for (i = 0; i < bodylen; ++i) pout[i] = 0;
//    pout[bodylen] = '\n';
//
//    for (i = 0, org = -1; i < n; org += i, ++i)
//    {
//        while ((j = *pin++) != 0)
//        {
//            if (j <= i)
//            {
//                j += org;
//                pout[j/6] |= g6bit[j%6];
//            }
//        }
//    }
//
//    for (i = 0; i < bodylen; ++i) pout[i] += 63;
//
//    j = nlen + bodylen + 1;
//    if (fwrite(g6,sizeof(char),(size_t)j,f) != j)
//    {
//        fprintf(stderr,">E %s: fwrite() failed\n",cmdname);
//        perror(">E ");
//        exit(1);
//    }
//}
//
//
///* Write in graph6 format.  doflip is ignored. */
//static void write_graph6(File *f, int doflip)
//
//{
//    char code[MAX_VERTICES+MAX_EDGES+1];
//
//    compute_code(code);
//    write_code_as_graph6(f,code);
//}
//
//
///* Write dual cubic graph in graph6 format.  doflip is ignored. */
//static void write_dual_graph6(File *f, int doflip)
//
//{
//    char code[MAX_FACES+MAX_EDGES+1];
//
//    compute_dual_code(code);
//    write_code_as_graph6(f,code);
//}
//
///* Checks these properties:
//   1. Degrees are correct.
//   2. Faces are triangles (if triang)
//   3. mStart and mEnd fields are correct.
//   4. mMin fields are ok.
//   5. vertex numbers are in range.
//*/
//
//
//static void check_it(int code, int triang)
//
//{
//    int i,j;
//    Edge[] e;
//
//    for (i = 0; i < mState.mNumVertices; ++i)
//    {
//        /*
//        if (degree[i] < 3)
//        {
//            fprintf(stderr,">E degree error, code=%d\n",code);
//            exit(1);
//        }
//        */
//
//        e = mFirstEdge[i];
//        for (j = 0; j < degree[i]; ++j) e = e.mNext;
//        if (e != mFirstEdge[i])
//        {
//            fprintf(stderr,">E mNext error, code=%d\n",code);
//            exit(1);
//        }
//
//        e = mFirstEdge[i];
//        for (j = 0; j < degree[i]; ++j) e = e.mPrev;
//        if (e != mFirstEdge[i])
//        {
//            fprintf(stderr,">E mPrev error, code=%d\n",code);
//            exit(1);
//        }
//
//        e = mFirstEdge[i];
//        for (j = 0; j < degree[i]; ++j)
//        {
//            e = e.mNext;
//            if (e.mStart != i)
//            {
//                fprintf(stderr,">E mStart error, code=%d\n",code);
//                exit(1);
//            }
//            if (e.mEnd < 0 || e.mEnd >= mState.mNumVertices)
//            {
//                fprintf(stderr,">E mEnd label error, code=%d\n",code);
//                exit(1);
//            }
//            if (e.mEnd != e.mInverse.mStart)
//            {
//                fprintf(stderr,">E mInverse label error, code=%d\n",code);
//                exit(1);
//            }
//            if (e.mInverse.mEnd != i)
//            {
//                fprintf(stderr,">E mEnd error, code=%d\n",code);
//                exit(1);
//            }
//            if (triang)
//                if (e.mInverse.mNext == e
//                    || e.mInverse.mNext.mInverse.mNext == e
//                    || e.mInverse.mNext.mInverse.mNext.mInverse.mNext != e)
//            {
//                fprintf(stderr,">E face error, code=%d\n",code);
//                exit(1);
//            }
//
//            if (e.mMin != e && e.mMin != e.mInverse)
//            {
//                fprintf(stderr,">E mMin error 1, code=%d\n",code);
//                exit(1);
//            }
//
//            if (e.mInverse.mMin != e.mMin)
//            {
//                fprintf(stderr,">E mMin error 2, code=%d\n",code);
//                exit(1);
//            }
//        }
//    }
//}

  /* This is called when a complete output graph is formed.  The main
     purpose is to write the graph and to collect some stats. */
  void gotOne(final int nbTot, final int nbOp, final int connec) {
    if (mExactSwitch && connec != mXConnec) {
      return;
    }

    final boolean doflip = mOuterPlanarSwitch && (nbOp == nbTot || nbOp == 0);
    final int wt = doflip ? 2 : 1;

//    if (sBigVSwitch) {
//      if (nbTot == 1 || (mOuterPlanarSwitch && nbOp == 1)) {
//        sNOutV += wt;
//        return;
//      }
//    }
    if (mProcessor != null && !mProcessor.accept(this, mState)) {
      return; // user supplied filter rejects this graph
    }

    ++mNOut[connec];
    if (mOuterPlanarSwitch) {
      mNOutOp[connec] += wt;
    }

    if (mPolytopeSwitch) {
      if (mOuterPlanarSwitch) {
        mNOutEOp[mState.mNumEdges / 2] += wt;
      }
      ++mNOutE[mState.mNumEdges / 2];
    }

    if (mPolygonSize == 0) {
      final int outsideFaceSize = mSimpleScanner.getOutsideFaceSize();
      if (mOuterPlanarSwitch) {
        mNOutPOp[outsideFaceSize] += wt;
      }
      ++mNOutP[outsideFaceSize];
    }


//    if (!mCountSwitch) {
//      gotone_nbOp = nbOp;
//      gotone_nbTot = nbTot;
//      if (sDSwitch) ( * write_dual_graph)(outfile, doflip);
//      else( * write_graph)(outfile, doflip);
//    }
  }

  private PlantriGraphProcessor mProcessor = null;

  /**
   * Set a processor.
   * @param processor graph processor
   */
  public void setGraphProcessor(final PlantriGraphProcessor processor) {
    mProcessor = processor;
  }

//
///* Sort an array of edges according to address.
//   Good for short arrays only. */
//static void sortedges(Edge[] *ed, int ned)
//
//{
//    int i,j;
//    Edge[] edi;
//
//    for (i = 1; i < ned; ++i)
//    {
//        edi = ed[i];
//        for (j = i; ed[j-1] > edi; )
//        {
//            ed[j] = ed[j-1];
//            if (--j <= 0) break;
//        }
//        ed[j] = edi;
//    }
//}
//
///* Test if the set ed[0..ned-1] is minimal under the group given by
//   old_numbering.  These are assumed to be undirected edges matching
//   their mMin fields.  If it is, *xnbTot and *xnbOp are counts for the
//   stabiliser.  In the case that the stabiliser is not trivial, it is
//   placed in new_numbering.
//   (This represents the group, but not a canonical labelling.) */
//
//static int isminset(Edge[] *ed, int ned, int nbTot, int nbOp,
//         Edge[] old_numbering[][MAX_EDGES], Edge[] new_numbering[][MAX_EDGES],
//         int[] xnbTot, int[] xnbOp)
//
//{
//    Edge[] *nb,**nbnew;
//    Edge[] image[MAX_EDGES];
//    int i,j,jnew;
//    int instabiliser[2*MAX_EDGES];
//
//    *xnbTot = 1;
//    if (nbOp > 0) *xnbOp = 1; else *xnbOp = 0;
//
//    instabiliser[0] = true;
//
//    nb = (Edge**)old_numbering[0];
//    for (i = 0; i < mState.mNumEdges; ++i) nb[i].mIndex = i;
//
//    for (j = 1; j < nbTot; ++j)
//    {
//        nb = (Edge**)old_numbering[j];
//        for (i = 0; i < ned; ++i) image[i] = nb[ed[i].mIndex].mMin;
//
//        sortedges(image,ned);
//        for (i = 0; i < ned; ++i) if (image[i] != ed[i]) break;
//        if (i == ned)
//        {
//            if (j < nbOp) ++*xnbOp;
//            ++*xnbTot;
//            instabiliser[j] = true;
//        }
//        else if (image[i] < ed[i])
//            return false;
//        else
//            instabiliser[j] = false;
//    }
//
//    if (*xnbTot > 1)
//    {
//        jnew = 0;
//        for (j = 0; j < nbTot; ++j)
//            if (instabiliser[j])
//            {
//                nb = (Edge**)old_numbering[j];
//                nbnew = (Edge**)new_numbering[jnew++];
//                for (i = 0; i < mState.mNumEdges; ++i) nbnew[i] = nb[i];
//            }
//    }
//
//    return true;
//}
//
///***************************************************************/
//
///*
//static void delete_edge(Edge[] e)
//
///-* deletes edge e. Assumes that none of the endpoints of e has valency 1.
//   It assumes that e has a triangle ON THE LEFT. The values of mLeftFaceSize
//   are updated according to this assumption.
//   Currently unused, so commented out. *-/
//{
//int newFaceSize;
//Edge[] run, *mEnd;
//
//    mFirstEdge[e.mStart] = e.mNext;
//    mFirstEdge[e.mEnd] = e.mInverse.mNext;
//
//    e.mPrev.mNext=e.mNext;
//    e.mNext.mPrev=e.mPrev;
//    (degree[e.mStart])--;
//
//    e=e.mInverse;
//
//    e.mPrev.mNext=e.mNext;
//    e.mNext.mPrev=e.mPrev;
//    (degree[e.mStart])--;
//
//    mState.mNumEdges -= 2;
//
//    mEnd=run=e.mPrev.mInverse;
//         /-* now the face on the right of e when entering this function
//            is on the left of run *-/
//    newFaceSize=run.mLeftFaceSize+1;
//
//    do { run.mLeftFaceSize=newFaceSize; run=run.mPrev.mInverse;
//       } while (run != mEnd);
//}
//*/
//


  /* Copy from old[0..numOld-1] to newEdge[0..numNew-1] each edge e with
     these two properties:
     1. Both ends of e have degree >= mMinPolyDeg+1.
     2. e is contained in a 3-face.
     It is legal that old and newEdge and &numOld and numnew are the same.

     17Aug2005: Changed "new" to "newEdge" to avoid Codewarrior bug.
  */
  int prunePolyEdgelist(final Edge[] old, final int numOld, final Edge[] newEdge) {
    int counter = 0;
    for (int i = 0; i < numOld; ++i) {
      final Edge e = old[i];
      if (mDegree[e.mStart] > getMinPolyDegree() && mDegree[e.mEnd] > getMinPolyDegree()
        && (e.mLeftFaceSize == 3 || e.mInverse.mLeftFaceSize == 3)) {
        newEdge[counter++] = e;
      }
    }
    return counter;
  }

///* Finds all those loops so that after switching on one side of it there is
//   a triangle consisting only of loops and on the other there is a double edge.
//   The edges are given in mMin form.
//
//   It is assumed that the map handed to this routine does not contain
//   vertices of valency smaller than "minimumdegree" and the routine only
//   returns edges that can be switched without producing some.
//
//   Additionally, if mTSwitch==0 (no -t) it is checked that the double
//   edges inside the one of the triangles do not contain a loop on
//   one side, since this would give a double edge in the dual.
//
//   Or to be exact: They do not contain a loop that is neighbouring both the
//   double edges.
//
//   Note that "other" double edges can occur in the dual in case minimumdegree<3.
//*/
//
//static void find_special_loopmakers(Edge[] loops[], int num_loops,
//                        Edge[] special_loop_makers[], int[] num_spec_loops)
//
//{
//    int i;
//    Edge[] run, *test;
//
//    *num_spec_loops=0;
//
//    if (num_loops < 2) return;
//
//    resetMarks();
//    resetMarksVertex();
//
//    for (i=0; i<num_loops; ++i)
//      { run=loops[i];
//        markLo(run); markLo(run.mInverse);
//        if (isMarkedVertex(run.mStart)) /* already another loop started
//                                                       at the same vertex */
//          /* To determine a switcher, a pair of loops is necessary.
//             The switcher is always detected by the second loop of the
//             pair that is visited */
//          {
//            if (isMarked(run.mPrev.mPrev) && (degree[run.mPrev.mEnd]>mMinDegree)
//                && (run.mPrev.mStart != run.mPrev.mEnd))
//            { test=run.mPrev.mInverse;
//              /* the first edge at the top inside the double edge */
//              if (mTSwitch || (test.mNext.mNext.mInverse != test.mPrev.mPrev))
//                /* the last test is a bit weird in case degree<4 of the test.mStart
//                   but the result is correct */
//                { special_loop_makers[*num_spec_loops]=run.mPrev.mMin;
//                  (*num_spec_loops)++; }
//            }
//            if (isMarked(run.mNext.mNext) && (degree[run.mNext.mEnd]>mMinDegree)
//                && (run.mNext.mStart != run.mNext.mEnd))
//            { test=run.mNext.mInverse;
//               if (mTSwitch || (test.mNext.mNext.mInverse != test.mPrev.mPrev))
//              { special_loop_makers[*num_spec_loops]=run.mNext.mMin;
//                (*num_spec_loops)++; }
//            }
//            run=run.mInverse;
//            if (isMarked(run.mPrev.mPrev) && (degree[run.mPrev.mEnd]>mMinDegree)
//                && (run.mPrev.mStart != run.mPrev.mEnd))
//            { test=run.mPrev.mInverse;
//              if (mTSwitch || (test.mNext.mNext.mInverse != test.mPrev.mPrev))
//                { special_loop_makers[*num_spec_loops]=run.mPrev.mMin;
//                (*num_spec_loops)++; }
//            }
//            if (isMarked(run.mNext.mNext) && (degree[run.mNext.mEnd]>mMinDegree)
//                && (run.mNext.mStart != run.mNext.mEnd))
//            { test=run.mNext.mInverse;
//               if (mTSwitch || (test.mNext.mNext.mInverse != test.mPrev.mPrev))
//                 { special_loop_makers[*num_spec_loops]=run.mNext.mMin;
//                 (*num_spec_loops)++; }
//            }
//          }
//        else markVertex(run.mStart);
//      }
//}
//
//
//
///* This routine uses mState.mNumVertices>3!!
//
//   Computes the lists of edges that can be switched to give a loop.
//   For every pair of inverse edges, ONE (the smaller one) is written
//   to list. The total number of edges is written to *number_pos_loops.
//
//   For the computation of the switchers it is useful to know where the
//   double edges are.  The list doubleedges[] must be supplied as a
//   list of all edges contained in multiple edges (one direction
//   only). "num_doubleedges" is its number;
//
//   Some reasoning about degrees in this functions uses the fact that
//   so far no loops are present in the graph.
//
//   An edge being contained in a double edge cannot be switched to give a
//   loop.
//*/
//
//static void find_loopmakers(Edge[] doubleedges[], int num_doubleedges,
//                Edge[] possible_loops[], int[] number_pos_loops)
//
//{
//    int i,counter=0;
//    Edge[] run,*buffer;
//
//
//    resetMarks();
//
//    if ((num_doubleedges<2) ||
//        ((mMinDegree>=3) && (num_doubleedges<4))) { *number_pos_loops=0; return; }
//
//    for (i=0; i<num_doubleedges; ++i)
//    {   run=doubleedges[i];
//        markLo(run);
//        markLo(run.mInverse);
//    }
//
///* Now all the edges contained in doubleedges are marked and we can
//   mStart testing. We will first look for edges connecting two sets of
//   double edges. */
//
//    if (num_doubleedges>=4)
//    for (i=0; i<num_doubleedges; ++i)
//    {   /* there must be a neighbouring doubleedge */
//        run= doubleedges[i];
//        if (isMarkedLo(run.mNext) && (!isMarkedHi(run.mInverse.mPrev))
//                    && (run.mStart == run.mInverse.mPrev.mPrev.mEnd))
//        {   buffer=run.mInverse.mPrev;
//            markHi(buffer);
//            markHi(buffer.mInverse);
//            possible_loops[counter]=buffer.mMin;
//            counter++;
//        }
//        run= run.mInverse;
//        if (isMarkedLo(run.mNext) && (!isMarkedHi(run.mInverse.mPrev))
//                    && (run.mStart == run.mInverse.mPrev.mPrev.mEnd))
//        {   buffer=run.mInverse.mPrev;
//            markHi(buffer);  markHi(buffer.mInverse);
//        possible_loops[counter]=buffer.mMin;
//        counter++;
//        }
//    }
//
///* We will now look for switchers that make degree one vertices. They can
//   be easily found: they are exactly the edges adjacent to degree 2 vertices.
//   Note that for n>3 there can never be 2 degree 2 vertices neighbouring each other.
//*/
//
//    if (mMinDegree==1)
//      for (i=0;i<mState.mNumVertices;i++)
//        {
//        if (degree[i]==2)
//          {
//            possible_loops[counter]=(mFirstEdge[i]).mMin; counter++;
//            possible_loops[counter]=(mFirstEdge[i]).mNext.mMin; counter++;
//          }
//        }
//
//    *number_pos_loops=counter;
//}


  /* Reduce edge[0..nEdges-1] (as undirected edges) according to the group. */
  int pruneEdgeList(final Edge[] edge, final int nEdges, final int nbTot) {
    if (nbTot == 1) {
      return nEdges;
    }

    mNumbering.resetToIdentity(mState.mNumEdges);
    mEdgeFactory.resetMarks(mEdges);

    int newNum = 0;
    for (int k = 0; k < nEdges; ++k) {
      final int index = edge[k].mIndex;
      if (!mEdgeFactory.isMarkedLo(mNumbering.get(0, index))) {
        edge[newNum++] = edge[k];
        mNumbering.minMarkLo(0, nbTot, index);
      }
    }
    return newNum;
  }

//
///* loop[0..nloops-1] is a list of all the loops.  A "special" loop is
//   one with one face bounded by non-loops and the other face bounded
//   by loops.  loop[nloops-1] is known to be special.  If loop[nloops-1]
//   does not have the lowest vertex degree of all special loops, return
//   with *nstarts=0.  Otherwise, list in mStart[0..*nstarts-1] all the
//   special loops with lowest vertex degree, and in startInv[0..*nstarts-1]
//   their inverses.  The orientations in mStart[] have a loop in the mNext
//   direction.
//*/
//
//static void find_start_loops(Edge[] loop[], int nloops, Edge[] mStart[],
//                 Edge[] startInv[], int[] nstarts)
//
//{
//    int i,nst,minDeg;
//    Edge[] e;
//
//    e = loop[nloops-1];
//    if (e.mNext.mStart == e.mNext.mEnd)
//    {
//        mStart[0] = e;
//        startInv[0] = e.mInverse;
//    }
//    else
//    {
//        mStart[0] = e.mInverse;
//        startInv[0] = e;
//    }
//
//    nst = 1;
//    minDeg = degree[mStart[0].mEnd];
//
//    for (i = nloops-1; --i >= 0;)
//    {
//        e = loop[i];
//        if ((e.mNext.mStart == e.mNext.mEnd)
//                         + (e.mPrev.mStart == e.mPrev.mEnd) == 1)
//        {
//            if (degree[e.mEnd] < minDeg)
//            {
//                *nstarts = 0;
//                return;
//            }
//            else if (degree[e.mEnd] == minDeg)
//            {
//                if (e.mNext.mStart == e.mNext.mEnd)
//                {
//                    mStart[nst] = e;
//                    startInv[nst++] = e.mInverse;
//                }
//                else
//                {
//                    startInv[nst] = e;
//                    mStart[nst++] = e.mInverse;
//                }
//            }
//        }
//    }
//
//    *nstarts = nst;
//}
//
//
///* The recursive procedure for adding special loops.
//   As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
//   and nbTot/nbOp are the values returned by canon() for that graph.
//   loops[0..nloops-1] are all the loops, of which there is at least one.
//   The loops are all in mMin form. */
//static void scanspecialloops(Edge[] loop[], int nloops, int nbTot, int nbOp)
//
//{
//    int i;
//    int xnbTot,xnbOp,nloopmakers,nGood;
//    Edge[] loopmaker[MAX_EDGES],*good[(MAX_EDGES+1)/2],*goodInv[(MAX_EDGES+1)/2];
//
//    gotOne(nbTot,nbOp,1);
//
//    find_special_loopmakers(loop,nloops,loopmaker,&nloopmakers);
//    if (nloopmakers == 0) return;
//
//    if (nbTot > 1) pruneEdgeList(loopmaker,&nloopmakers,nbTot);
//
//    for (i = 0; i < nloopmakers; ++i)
//    {
//        switchEdge(loopmaker[i]);
//
//        loop[nloops] = loopmaker[i];
//        find_start_loops(loop,nloops+1,good,goodInv,&nGood);
//        if (nGood > 0)
//        {
//            if (canonEdgeOriented(good,nGood,1,goodInv,nGood,1,
//                                        degree,numbering,&xnbTot,&xnbOp))
//                scanspecialloops(loop,nloops+1,xnbTot,xnbOp);
//        }
//
//        switchEdgeBack(loopmaker[i]);
//    }
//}
//
//
//static void scanordloops(int nbTot, int nbOp, int numDoubles)
//
///* The code for adding ordinary loops using a grey code.
//   As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
//   and nbTot/nbOp are the values returned by canon() for that graph.
//   numDoubles is the number of undirected edges with a parallel mate.
//   There are no loops when this is called. */
//{
//    int i,j;
//    int xnbTot,xnbOp,nloopmakers,nloops;
//    Edge[] loopmaker[2*MAX_VERTICES],*loop[2*MAX_VERTICES],**nb0,**nb1,*e1;
//    int isloop[2*MAX_VERTICES],partner[2*MAX_VERTICES],numpseudo,pj;
//    long x,xlim,w;
//
///*  Meaning of isloop[i]:
// *  0 = not a loop, possibly available for switching
// *  1 = a pseudo-loop: not a loop but unavailable for switching
// *  2 = a real loop, available for unswitching
// *  numpseudo = number of pseudo-loops at the moment.
// */
//
//    gotOne(nbTot,nbOp,2 + (numDoubles==0));
//
//    // fprintf(stderr,"Check this part of the code -- changed by me:\n");
//    if ((numDoubles<2) ||
//        ((mMinDegree>=3) && (numDoubles<4))) return;
//
//    // was: if (numDoubles < 4) return;
//
//#ifdef PRE_FILTER_ORDLOOP
//    if (!(PRE_FILTER_ORDLOOP)) return;
//#endif
//
//    find_loopmakers(DOUBLES,numDoubles,loopmaker,&nloopmakers);
//    if (nloopmakers == 0) return;
//
//    for (i = 0; i < nloopmakers; ++i) isloop[i] = 0;
//    numpseudo = 0;
//
//
//    if (nbTot == 1)    /* Case of trivial group */
//    {
//        for (i = 0; i < nloopmakers; ++i) loopmaker[i].mIndex = i;
//        for (i = 0; i < nloopmakers; ++i)
//        {
//            if (degree[loopmaker[i].mStart] == 2)
//                partner[i] = loopmaker[i].mNext.mMin.mIndex;
//            else if (degree[loopmaker[i].mEnd] == 2)
//                partner[i] = loopmaker[i].mInverse.mNext.mMin.mIndex;
//            else
//                partner[i] = -1;
//        }
//
//        xlim = 1 << nloopmakers;
//        for (x = 1; x < xlim; ++x)
//        {
//            for (j = 0, w = x; (w & 1) == 0; ++j, w >>= 1) {}
//            // if (isloop[j]) switchEdgeBack(loopmaker[j]);
//            // else           switchEdge(loopmaker[j]);
//            // isloop[j] = !isloop[j];
//            if (isloop[j] == 0)
//                if (degree[loopmaker[j].mStart] == 1
//                              || degree[loopmaker[j].mEnd] == 1)
//                {
//                    isloop[j] = 1;
//                    ++numpseudo;
//                }
//                else
//                {
//                    switchEdge(loopmaker[j]);
//                    isloop[j] = 2;
//                }
//            else if (isloop[j] == 1)
//            {
//                --numpseudo;
//                isloop[j] = 0;
//            }
//            else  /* isloop[j] = 2 */
//            {
//                switchEdgeBack(loopmaker[j]);
//                isloop[j] = 0;
//                pj = partner[j];
//                if (pj >= 0 && isloop[pj] == 1)
//                {
//                    e1 = loopmaker[pj];
//                    if (degree[e1.mStart] > 1 && degree[e1.mEnd] > 1)
//                    {
//                        switchEdge(e1);
//                        isloop[pj] = 2;
//                        --numpseudo;
//                    }
//                }
//            }
//
//            if (numpseudo > 0) continue;
//            for (j = 0; j < mState.mNumVertices; ++j) if (degree[j] < mMinDegree) break;
//            if (j < mState.mNumVertices) continue;
//
//            for (i = nloops = 0; i < nloopmakers; ++i)
//                if (isloop[i]) loop[nloops++] = loopmaker[i];
//
//            if (mTSwitch)
//                scanspecialloops(loop,nloops,1,1);
//            else
//            {
//                for (j = 0; j < nloops; ++j)
//                {
//                   if (loop[j].mNext.mNext.mNext.mInverse == loop[j]
//                         || loop[j].mPrev.mPrev.mPrev.mInverse == loop[j])
//                       break;
//                }
//                if (j == nloops) scanspecialloops(loop,nloops,1,1);
//            }
//        }
//        if (isloop[nloopmakers-1] == 2)
//            switchEdgeBack(loopmaker[nloopmakers-1]);
//    }
//    else   /* Case of non-trivial group */
//    {
//        nb0 = (Edge**)numbering[0];
//        nb1 = (Edge**)mSavedNumbering.get(0);
//        for (i = 0; i < nbTot; ++i, nb0 += MAX_EDGES, nb1 += MAX_EDGES)
//            for (j = 0; j < mState.mNumEdges; ++j) nb1[j] = nb0[j];
//
//        sortedges(loopmaker,nloopmakers);
//        for (i = 0; i < nloopmakers; ++i) loopmaker[i].mIndex = i;
//        for (i = 0; i < nloopmakers; ++i)
//        {
//            if (degree[loopmaker[i].mStart] == 2)
//                partner[i] = loopmaker[i].mNext.mMin.mIndex;
//            else if (degree[loopmaker[i].mEnd] == 2)
//                partner[i] = loopmaker[i].mInverse.mNext.mMin.mIndex;
//            else
//                partner[i] = -1;
//        }
//
//        xlim = 1 << nloopmakers;
//        for (x = 1; x < xlim; ++x)
//        {
//            for (j = 0, w = x; (w & 1) == 0; ++j, w >>= 1) {}
//            // if (isloop[j]) switchEdgeBack(loopmaker[j]);
//            // else           switchEdge(loopmaker[j]);
//            // isloop[j] = !isloop[j];
//            if (isloop[j] == 0)
//                if (degree[loopmaker[j].mStart] == 1
//                       || degree[loopmaker[j].mEnd] == 1)
//                {
//                    isloop[j] = 1;
//                    ++numpseudo;
//                }
//                else
//                {
//                    switchEdge(loopmaker[j]);
//                    isloop[j] = 2;
//                }
//            else if (isloop[j] == 1)
//            {
//                --numpseudo;
//                isloop[j] = 0;
//            }
//            else  /* isloop[j] = 2 */
//            {
//                switchEdgeBack(loopmaker[j]);
//                isloop[j] = 0;
//                pj = partner[j];
//                if (pj >= 0 && isloop[pj] == 1)
//                {
//                    e1 = loopmaker[pj];
//                    if (degree[e1.mStart] > 1 && degree[e1.mEnd] > 1)
//                    {
//                        switchEdge(e1);
//                        isloop[pj] = 2;
//                        --numpseudo;
//                    }
//                }
//            }
//
//            if (numpseudo > 0) continue;
//
//            for (i = nloops = 0; i < nloopmakers; ++i)
//                if (isloop[i] == 2) loop[nloops++] = loopmaker[i];
//            if (isminset(loop,nloops,nbTot,nbOp,
//                         mSavedNumbering,numbering,&xnbTot,&xnbOp))
//            {
//                for (j = 0; j < mState.mNumVertices; ++j) if (degree[j] < mMinDegree) break;
//                if (j < mState.mNumVertices) continue;
//
//                if (mTSwitch)
//                    scanspecialloops(loop,nloops,xnbTot,xnbOp);
//                else
//                {
//                    for (j = 0; j < nloops; ++j)
//                    {
//                        if (loop[j].mNext.mNext.mNext.mInverse == loop[j]
//                              || loop[j].mPrev.mPrev.mPrev.mInverse == loop[j])
//                            break;
//                    }
//                    if (j == nloops) scanspecialloops(loop,nloops,xnbTot,xnbOp);
//                }
//            }
//        }
//        if (isloop[nloopmakers-1] == 2) switchEdgeBack(loopmaker[nloopmakers-1]);
//    }
//}


  /* edge[0..count-1] is a list of edges.  Put minimal[i] = 1 if
     edge[i] is the first appearance of its orbit, and  minimal[i] = 0
     if not.  Orbits on undirected edges are considered. */
  void markEdgeOrbits(final Edge[] edge, final int count, final int[] minimal, final int nbTot) {
    if (nbTot == 1) {
      Arrays.fill(minimal, 0, count, 1);
    } else {
      mNumbering.resetToIdentity(mState.mNumEdges);
      mEdgeFactory.resetMarks(mEdges);
      for (int k = 0; k < count; ++k) {
        if (!mEdgeFactory.isMarkedLo(mNumbering.get(0, edge[k].mIndex).mMin)) {
          minimal[k] = 1;
          mNumbering.minMarkLo(0, nbTot, edge[k].mIndex);
        } else {
          minimal[k] = 0;
        }
      }
    }
  }

  /* This routine begins the scan for general connected planar graphs formed
     by removing edges from triangulations.  The current graph is such a
     triangulation, and the group is known (parameters nbTot,nbOp).
  */
  void startPolyScan(final int nbTot, final int nbOp, final boolean needGroup) {
    final Edge[] feasible = new Edge[MAX_EDGES / 2];

    // In the -m5 case, the group must be saved and restored.
    if (mMinDegree == 5 && nbTot > 1) {
      for (int i = 0; i < nbTot; ++i) {
        System.arraycopy(mNumbering.get(i), 0, mSavedNumbering.get(i), 0, mState.mNumEdges);
      }
    }

    int nfeas = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      final Edge ex = mFirstEdge[i];
      Edge e = ex;
      do {
        if (e == e.mMin && mDegree[e.mStart] > getMinPolyDegree() && mDegree[e.mEnd] > getMinPolyDegree()) {
          feasible[nfeas++] = e;
        }
        e.mLeftFaceSize = 3;
        e = e.mNext;
      } while (e != ex);
    }

    nfeas = prunePolyEdgelist(feasible, nfeas, feasible);

    if (mMinPolyConnec == 3) {
      new PolytopeC3Scanner(this, mNumbering, mVertexMarks, mEdgeBound, mMaxFaceSize, needGroup).scan(nbTot, nbOp, feasible, nfeas, 3, 0, 0);
    } else {
      new PolytopeScanner(this, mNumbering, mVertexMarks, mEdgeBound, mMaxFaceSize).scan(nbTot, nbOp, feasible, nfeas, 3, 0, 0, 3);
    }

    if (mMinDegree == 5 && nbTot > 1) {
      for (int i = 0; i < nbTot; ++i) {
        System.arraycopy(mSavedNumbering.get(i), 0, mNumbering.get(i), 0, mState.mNumEdges);
      }
    }
  }

  void findEdgeAndMarkPath(final Edge start, final Edge target) {
    Edge run = start;
    while (run != target) {
      run = run.mNext;
      mVertexMarks.markVertex(run.mEnd);
    }
  }

  /* nf means that there are vertices inside both parts of the
       triangulation separated by the cycle.

       Assumes that there are no nf-4-cycles in the graph. This means that
       at ANY vertex of the cycle there is an edge pointing into EACH of the
       two components.

       Assumes further that the valency of all vertices involved is at least 5.

       Returns true, if edge e is on an nf-5cycle, false otherwise
    */
  boolean onNf5Cycle(Edge e) {
    if (mDegree[e.mNext.mEnd] == 5 || mDegree[e.mPrev.mEnd] == 5) {
      return true;
    }

    mVertexMarks.resetMarksVertex();
    Edge last = e.mPrev.mPrev;
    Edge run = e.mNext.mNext;
    Edge dummy = run.mInverse;
    Edge last1 = dummy.mPrev.mPrev;
    Edge run1 = dummy.mNext.mNext;
    mVertexMarks.markVertex(run1.mEnd);
    run1 = run1.mNext;
    mVertexMarks.markVertex(run1.mEnd);
    findEdgeAndMarkPath(run1, last1);
    run = run.mNext;
    dummy = run.mInverse;
    last1 = dummy.mPrev.mPrev;
    run1 = dummy.mNext.mNext;
    mVertexMarks.markVertex(run1.mEnd);
    run1 = run1.mNext;
    mVertexMarks.markVertex(run1.mEnd);
    findEdgeAndMarkPath(run1, last1);
    while (run != last) {
      run = run.mNext;
      dummy = run.mInverse;
      last1 = dummy.mPrev.mPrev;
      run1 = dummy.mNext.mNext;
      mVertexMarks.markVertex(run1.mEnd);
      run1 = run1.mNext;
      mVertexMarks.markVertex(run1.mEnd);
      findEdgeAndMarkPath(run1, last1);
    }

    e = e.mInverse;

    last = e.mPrev.mPrev;
    run = e.mNext.mNext;
    dummy = run.mInverse;
    return fiveCycle(run, dummy.mNext.mNext, last, dummy.mPrev.mPrev);
  }

  boolean fiveCycle(Edge run, Edge run1, final Edge last, Edge last1) {
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return true;
    }
    run1 = run1.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return true;
    }
    if (checkIfPathMarked(run1, last1)) {
      return true;
    }
    run = run.mNext;
    Edge dummy = run.mInverse;
    last1 = dummy.mPrev.mPrev;
    run1 = dummy.mNext.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return true;
    }
    run1 = run1.mNext;
    if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
      return true;
    }
    if (checkIfPathMarked(run1, last1)) {
      return true;
    }
    while (run != last) {
      run = run.mNext;
      dummy = run.mInverse;
      last1 = dummy.mPrev.mPrev;
      run1 = dummy.mNext.mNext;
      if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
        return true;
      }
      run1 = run1.mNext;
      if (mVertexMarks.isMarkedVertex(run1.mEnd)) {
        return true;
      }
      if (checkIfPathMarked(run1, last1)) {
        return true;
      }
    }
    return false;
  }

  boolean checkIfPathMarked(final Edge start, final Edge target) {
    Edge run = start;
    while (run != target) {
      run = run.mNext;
      if (mVertexMarks.isMarkedVertex(run.mEnd)) {
        return true;
      }
    }
    return false;
  }

  /* Test if e is the central edge of a bangle, 5-connected case. */
  boolean isIn5Bangle(final Edge e) {
    mVertexMarks.resetMarksVertex();
    int k = mDegree[e.mPrev.mEnd] - 4;
    for (Edge e1 = e.mPrev.mInverse.mNext.mNext; --k >= 0; e1 = e1.mNext) {
      mVertexMarks.markVertex(e1.mEnd);
    }
    k = mDegree[e.mNext.mEnd] - 4;
    for (Edge e1 = e.mNext.mInverse.mPrev.mPrev; --k >= 0; e1 = e1.mPrev) {
      int l = mDegree[e1.mEnd] - 3;
      for (Edge e2 = e1.mInverse.mNext.mNext; --l >= 0; e2 = e2.mNext) {
        if (mVertexMarks.isMarkedVertex(e2.mEnd)) {
          return true;
        }
      }
    }
    return false;
  }

  /* Set bang[0..nbang-1] to the central edges (min) of all bangles. 5-connected case. */
  int all5Bangles(final Edge[] bang) {
    int numBangles = 0;
    for (int k = 0; k < mState.mNumVertices; ++k) {
      final Edge eLast = mFirstEdge[k];
      Edge e = eLast;
      do {
        if (e == e.mMin && isIn5Bangle(e)) {
          bang[numBangles++] = e;
        }
        e = e.mNext;
      } while (e != eLast);
    }
    return numBangles;
  }

  /* Difference to "threeConn": On the left hand side of e there must be a
   quadrangle instead of a triangle.

   tests whether the graph obtained by deleting EDGE e is still 3-connected.
   The edge e may have been deleted or not, but the values in e must be
   as before it was (possibly) deleted. The map must have been 3-connected
   before -- so especially there weren't any vertices of degree 2.
   degree[] is not assumed correct for the end vertices of e.

   On the left hand side of e there must be a quadrangle.
   (e.mLeftFaceSize==4) and it is assumed that it is checked before
   that the end vertices adjacent to e have degree at least 3 after the
   deletion.

   The way it works: If there is a 2-cut, e.mStart and e.mEnd cannot
   be contained, but they must be in different components after
   removing e, so both faces neighbouring e must contain a
   cut-vertex. Because on the left hand side there is a quadrangle this
   means that v=e.mPrev.mEnd or w=e.mInverse.mNext.mEnd MUST be
   contained.  It is checked whether v or w is contained in a face that
   shares yet another vertex with the face formerly on the right hand
   side of e (the new face obtained by deleting e).

   Note that this face cannot be the one v shares with e.mStart or
   w shares with e.mEnd because that would have meant that a 2-cut
   already existed in the graph.

   Returns 1 if it is 3-connected after deleting e, 0 else.  */


  /* Copy from old[0..numold-1] to newe[0..*numnew-1] each edge e with
 *    these two properties:
 *       1. Both ends of e have degree >= mMinPolyDeg+1.
 *          2. e is contained in a 4-face.
 *            It is legal that old and newe and &numold and numnew are the same.
 */

  /*
  #define ORTESTB(e)
 {col = degendb(e); if (col > maxcol)
    {if (orokb(e)) {++degree[v1]; ++degree[v2]; return 2;}}
    else if (col==maxcol&&orokb(e)) goodOr[ngOr++]=e;}

  private static void INVTESTB(final Edge e) {
    col = degendb(e); if (col > maxcol)
    {if (invokb(e)) {++degree[v1]; ++degree[v2]; return 2;}}
    else if (col==maxcol&&invokb(e)) goodInv[ngInv++]=e;
  }
  */

  /* This routine begins the scan for general connected bipartite planar graphs
   * formed by removing edges from quadrangulations.  The current graph is
   * a quadrangulation, and the group is known (parameters nbTot,nbOp).
   * conn is the connectivity (2 or 3, must be correct).
   */
  void startBipScan(final int nbTot, final int nbOp, final int conn) {
    final Edge[] feasible = new Edge[MAX_EDGES / 2];
    int nfeas = 0;

    for (int k = 0; k < mState.mNumVertices; ++k) {
      final Edge ex = mFirstEdge[k];
      Edge e = ex;
      do {
        if (e == e.mMin && mDegree[e.mStart] > getMinPolyDegree() && mDegree[e.mEnd] > getMinPolyDegree()) {
          feasible[nfeas++] = e;
        }
        e.mLeftFaceSize = 4;
        e = e.mNext;
      } while (e != ex);
    }

    final BipScanner scanner = new BipScanner(this, mNumbering, mVertexMarks, mEdgeBound, mMaxFaceSize);
    nfeas = scanner.pruneBipEdgelist(feasible, nfeas, feasible);
    scanner.scan(nbTot, nbOp, feasible, nfeas, 4, 0, 0, conn);
  }

  final EdgeSwitcher mSwitcher = new EdgeSwitcher(mState);

  ///* Find integer value for switch.
//   arg is a pointer to a command-line argument.
//   pj is an mIndex into arg, which is updated.
//   The value of the switch is the function return value.
//   For example, if arg="-xyz1432q" and *pj=3 (pointing at "z"),
//       the value 1432 is returned and *pj=7 (pointing at "2").
//   An absent value is equivalent to 0.
//*/
//
// /*
//static int
//getswitchvalue(char *arg, int[] pj)
//
//{
//    int j,ans;
//
//    ans = 0;
//    for (j = *pj; arg[j+1] >= '0' && arg[j+1] <= '9'; ++j)
//        ans = ans * 10 + (arg[j+1] - '0');
//
//    *pj = j;
//    return ans;
//}
// */
//
//
///* Decode an integer-list argument for a switch.
//   arg is a pointer to a command-line argument.
//   *pj is the mIndex of the switch name
//     Following the switch name is a list of up to limit non-negative
//     integers separated by characters from the string *sep.  They are
//     found and put into list[0...] and the number of them into *count.
//     The character before each number is put into delim[0..].
//     The final value of *pj is the last digit of the last value.
//     Empty values are taken as 0.
//   For example, if arg = "az12:45-98q" and *pj=2 (at the 'z'), then
//   the result will be list[0]=12, list[1]=45, list[2]=98,
//                      delim[0]='z', delim[1]=':', delim[2]='-',
//   *count=3, and *pj=10 (at the 'q').
//*/
//  /*
//static void getswitchvaluelist(char *arg, int[] pj, int list[], char delim[],
//                   int limit, int[] count, char *sep)
//
//{
//    int j,val;
//    int go;
//
//    *count = 0;
//    j = *pj + 1;
//
//    go = true;
//    delim[0] = arg[*pj];
//
//    while (go)
//    {
//        if (*count >= limit)
//        {
//            fprintf(stderr,
//                    ">E %s: too many values for -%c\n",cmdname,arg[*pj]);
//            exit(1);
//        }
//
//        val = 0;
//        while (arg[j] >= '0' && arg[j] <= '9')
//        {
//            val = val * 10 + (arg[j] - '0');
//            ++j;
//        }
//        list[(*count)++] = val;
//
//        if (arg[j] != '\0' && strchr(sep,arg[j]))
//            delim[*count] = arg[j++];
//        else
//            go = false;
//    }
//
//    *pj = j - 1;
//}
//  */
//
//
///* If ok_switches[sw] is ZERO, write an error message and exit. */
///*
//static void check_switch(char sw, char *ok_switches)
//
//
//{
//    if (!OK_SWITCHES(sw))
//    {
//        fprintf(stderr,">E %s:  -%c is not permitted\n",cmdname,sw);
//        exit(1);
//    }
//}
//*/
//
//

  /* Set mSplitLevel and mSplitCount.  minLevel and maxLevel are bounds
     on its value.  It must be that both minLevel and maxLevel are at
     least equal to the largest starting order (mState.mNumVertices for external calls
     to scan() or similar routines), and at most equal to the
     smallest parent of a parent of an internal-output graph (call
     from scan() or similar to gotOne() or similar).  The size
     of internal-output graphs is mMaxNV-1 for planar triangulations
     and mMaxNV for other classes.

     hint is a desirable value, which can be anything as the actual
     value used is forced between minLevel and maxLevel.  For plugins,
     the value of split hint is used instead if it is >= 0.

     In case there is no way to use splitting within those limits,
     it is turned off by setting mSplitLevel=0.  In that case only
     subcase 0 should produce output.

     Splitting occurs at the first level where mState.mNumVertices >= mSplitLevel.
     If an operation can add k vertices, it must be that
     mSplitLevel <= mMaxNV - k.
  */
  void initializeSplitting(final int minLevel, final int hint, final int maxLevel) {
    int sl = mTwoSwitch ? hint + 1 : hint;
    if (sl > maxLevel) {
      sl = maxLevel;
    }

    if (sl < minLevel && sl > 0) {
      if (minLevel <= maxLevel) {
        sl = minLevel;
      } else {
        sl = 0;
      }
    }
    if (mMod == 1) {
      sl = 0;
    }
    setSplitLevel(sl);
    setSplitCount(mRes);
  }

  void setSplitLevel(final int splitLevel) {
    mSplitLevel = splitLevel;
  }

  //
///* Open the output file, and write a header if one is called for.
//   All the needed information is in global vars.  Also check if
//   maxn is too large for this format, and set the global procedure
//   variables write_graph() and write_dual_graph().
//*/
///*
//static void open_output_file()
//
//{
//    int nvf;
//
//    if (sASwitch + sGSwitch + sSSwitch + mCountSwitch + sBigESwitch >= 2)
//    {
//        fprintf(stderr,">E %s: -a, -g, -s, -u, -E are incompatible\n",cmdname);
//        exit(1);
//    }
//
//    if (!mCountSwitch)   //UPDATE for -E and reconconsider
//    {
//        nvf = sDSwitch ? 2*(mMaxNV-(mPolygonSize>=0))-4 : mMaxNV-(mPolygonSize>=0);
//        if ((sASwitch && nvf > 99) ||
//            (sGSwitch && nvf > 255) ||
//            (sSSwitch && nvf > 255) ||
//           (!sASwitch && !sGSwitch && !sSSwitch && nvf > 255))
//        {
//            fprintf(stderr,">E %s: n is too large for that output format\n",
//                cmdname);
//            exit(1);
//        }
//    }
//
//    if (outfilename == null)
//    {
//        outfilename = "stdout";
//        outfile = stdout;
//    }
//    else if ((outfile = fopen(outfilename,
//        zeroswitch || sASwitch || sGSwitch || sSSwitch ? "w" : "wb")) == null)
//    {
//        fprintf(stderr,
//          ">E %s: can't open %s for writing\n",cmdname,outfilename);
//        perror(">E ");
//        exit(1);
//    }
//
//    if (zeroswitch)  // implied by oneswitch
//        write_graph = write_dual_graph = write_digits;
//    else if (sASwitch)
//    {
//        write_graph = write_alpha;
//        write_dual_graph = write_dual_alpha;
//    }
//    else if (sGSwitch)
//    {
//        write_graph = write_graph6;
//        write_dual_graph = write_dual_graph6;
//    }
//    else if (sSSwitch)
//    {
//        write_graph = write_sparse6;
//        write_dual_graph = write_dual_sparse6;
//    }
//    else if (sBigESwitch)
//    {
//        write_graph = write_edgecode;
//        write_dual_graph = write_dual_edgecode;
//    }
//    else
//    {
//        write_graph = write_planar_code;
//        write_dual_graph = write_dual_planar_code;
//    }
//
//    if (!mCountSwitch && !sASwitch)
//    {
//        if ((!zeroswitch && !sHSwitch && !sGSwitch && !sSSwitch && !sBigESwitch &&
//             fwrite(PCODE,(size_t)1,PCODELEN,outfile) != PCODELEN)
//          || (!sHSwitch && sBigESwitch &&
//              fwrite(ECODE,(size_t)1,ECODELEN,outfile) != ECODELEN)
//          || (sHSwitch && sGSwitch &&
//              fwrite(G6CODE,(size_t)1,G6CODELEN,outfile) != G6CODELEN)
//          || (sHSwitch && sSSwitch &&
//              fwrite(S6CODE,(size_t)1,S6CODELEN,outfile) != S6CODELEN))
//        {
//            fprintf(stderr,">E %s: error writing header\n",cmdname);
//            perror(">E ");
//            exit(1);
//        }
//    }
//}
//*/
//

  /* Triangulations of a polygon.  This works by making a triangulation
     one size bigger, then deleting a vertex.  mMaxNV is set one size
     larger to achieve this, but put back before this procedure returns. */
  void polygonDispatch() {
    if (mMinConnec <= 0) {
      setMinConnectivity(3);
    }
    if (mMinDegree <= 0) {
      setMinDegree(3);
    }
    final int startingSize = 4;
    assert mMaxNV >= startingSize - 1 && mMaxNV < MAX_VERTICES;
    ++mMaxNV;
//    assert mMinConnec == 2 || mMinConnec == 3;
//    assert mMinDegree == 2 || mMinDegree == 3;
//    assert mPolygonSize <= 0 || (mPolygonSize > 2 && mPolygonSize < mMaxNV);

    if (mMinDegree < mMinConnec) {
      mMinDegree = mMinConnec;
    }

    Arrays.fill(mNOutP, 0);
    Arrays.fill(mNOutPOp, 0);

    final int hint = Math.min(mMaxNV <= 12 ? mMaxNV - 1 : mMaxNV - 2, 14);
    initializeSplitting(startingSize, hint, mMaxNV - 1);
    if (mSplitLevel == 0 && mRes > 0) {
      --mMaxNV;
      return;
    }

    setExactConnectivity(mMinConnec);
    initializeTriang();
    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
    mSimpleScanner.scan(nbTot.get(), nbOp.get());

    --mMaxNV;

    if (mVerbose && mPolygonSize == 0) {
      for (int i = 0; i <= MAX_VERTICES; ++i) {
        if (mNOutP[i] != 0) {
          System.out.printf(" With %2d-gon: ", i);
          if (mOuterPlanarSwitch) {
            System.out.println(mNOutPOp[i] + " (" + mNOutP[i] + " classes)");
          } else {
            System.out.println(mNOutP[i]);
          }
        }
      }
    }
  }

  /* Case of minimum degree >= 4, except for polygons and polytopes. */
  void min4Dispatch() {
    final Triangle[] nft = Triangle.create(MAX_VERTICES);

    if (mMinDegree <= 0) {
      setMinDegree(4);
    }
    if (mMinConnec <= 0) {
      setMinConnectivity(3);
    }
    final int startingSize = 6;

    checkRange(mMinConnec, "-c", 3, 4);
    checkRange(mMinDegree, "-m", 4, 4);

    if (mMinConnec == 4) {
      mExactSwitch = true;
    }

    setExactConnectivity(mMinConnec);
    final int hint = Math.min(mMaxNV <= 19 ? mMaxNV - 4 : mMaxNV - 5, 17);
    initializeSplitting(startingSize, hint, mMaxNV - 3);
    if (mSplitLevel == 0 && mRes > 0) {
      return;
    }

    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    Min4.init(mState);
    Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);

    final Min4Scanner scanner = new Min4Scanner(this, mNumbering, mMaxNV, mMinConnec, mPolytopeSwitch, mBigGSwitch);
    if (mExactSwitch || mMinConnec == 4) {
      scanner.scanMin4C(nbTot.get(), nbOp.get(), mSplitLevel == 6, null, nft, 0);
    } else {
      scanner.scanMin4(nbTot.get(), nbOp.get(), mSplitLevel == 6, null);
    }
  }

  /* Case of minimum degree == 5, except for polygons and polytopes. */
  private void min5Dispatch() {
    if (mMinDegree <= 0) {
      setMinDegree(5);
    }
    if (mMinConnec <= 0) {
      setMinConnectivity(3);
    }
    final int startingSize = 12;

    checkRange(mMaxNV, "n", startingSize, MAX_VERTICES);
    checkRange(mMinConnec, "-c", 3, 5);
    checkRange(mMinDegree, "-m", 5, 5);
    int hint = Math.min(mMaxNV - 5, 27);
    if (mMaxNV >= 35) {
      ++hint;
    }
    if (mMaxNV >= 38) {
      ++hint;
    }
    initializeSplitting(startingSize, hint, mMaxNV - 5);
    if (mSplitLevel == 0 && mRes > 0) {
      return;
    }

    setExactConnectivity(mMinConnec);
    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    Min5.init(mState);
    Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);

    final Edge[] prevA = new Edge[MAX_VERTICES];
    if (mMinConnec < 5) {
      final Edge[] bangle = new Edge[MAX_EDGES / 2];
      new Min5Scanner(this, mNumbering, mVertexMarks, mBigGSwitch).scanMin5(nbTot.get(), nbOp.get(), mSplitLevel == 12, prevA, 0, bangle, all5Bangles(bangle));
    } else {
      new Min5CScanner(this, mNumbering, mVertexMarks, mBigGSwitch).scanMin5c(nbTot.get(), nbOp.get(), mSplitLevel == 12, prevA, 0);
    }
  }

  private final SimpleScanner mSimpleScanner = new SimpleScanner(this, mNumbering, mVertexMarks, true);

  /* Polytopes.  Main options are -m4, -m5 and neither. */
  /* Polytopes are made by first making 3-connected triangulations,
     then deleting edges in a second phase.  minConn and mMinDegree
     are used in the first phase; minPolyConn and mMinPolyDeg in the
     second phase.  Since simple triangulations are 3-connected and
     have minimum degree at least 3, minConn and mMinDegree are at
     least 3.  However, minPolyConn and mMinPolyDeg can be anything
     from 1 to minConn and mMinDegree. */
  void polytopeDispatch() {
    final Edge[] prevA = new Edge[MAX_VERTICES];
    final Edge[] bangle = new Edge[MAX_EDGES / 2];
    if (mMinConnec <= 0) {
      setMinConnectivity(3);
    }
    mMinPolyConnec = mMinConnec;
    if (mMinConnec < 3) {
      setMinConnectivity(3);
    }
    if (mMinDegree <= 0) {
      setMinDegree(mMinConnec);
      setMinPolyDegree(mMinPolyConnec);
    } else {
      setMinPolyDegree(mMinDegree);
      setMinDegree(Math.max(mMinDegree, 3));
    }
    if (mMinConnec > mMinDegree) {
      setMinDegree(mMinConnec);
    }
    if (mMinPolyConnec > getMinPolyDegree()) {
      setMinPolyDegree(mMinPolyConnec);
    }
    final int startingSize = mMinDegree == 4 ? 6 : (mMinDegree == 5 ? 12 : 4);
    checkRange(mMaxNV, "n", 2, MAX_VERTICES);
    checkRange(mMinPolyConnec, "-c", 1, 3);
    checkRange(getMinPolyDegree(), "-m", 1, 5);
    final int maxundir = mMaxNV == 2 ? 1 : 3 * mMaxNV - 6;
    if (mEdgeBound[0] < 0) {
      mEdgeBound[0] = 0;
    }
    if (mEdgeBound[1] < 0) {
      mEdgeBound[1] = maxundir;
    }
    if (mEdgeBound[1] > maxundir) {
      mEdgeBound[1] = maxundir;
    }
    assert mEdgeBound[0] <= mEdgeBound[1];
    if (mMaxFaceSize <= 0) {
      mMaxFaceSize = MAX_EDGES;
    }
    //assert mMaxNV * getMinPolyDegree() <= 2 * mEdgeBound[1];
    checkRange(mMaxFaceSize, "-f", 3, MAX_EDGES);
    setExactConnectivity(mMinPolyConnec);
    if (mMaxNV >= 4 && (mEdgeBound[0] == maxundir || mMaxFaceSize == 3)) {
      mPolytopeSwitch = false;
      mEdgeBound[0] = -1;
      mEdgeBound[1] = -1;
      mMaxFaceSize = -1;
      if (mMinDegree == 4) {
        min4Dispatch();
      } else if (mMinDegree == 5) {
        min5Dispatch();
      } else {
        new SimpleDispatcher(this, mNumbering, mMaxNV).simpleDispatch();
      }
      return;
    }
    mEdgeBound[0] *= 2;
    mEdgeBound[1] *= 2;
    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    if (mMinDegree == 5) {
      final int hint = Math.min(mMaxNV - 5, 27);
      initializeSplitting(startingSize, hint, mMaxNV - 5);
      if (mSplitLevel == 0 && mRes > 0) {
        return;
      }
      Min5.init(mState);
      Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
      final int nBangles = all5Bangles(bangle);
      new Min5Scanner(this, mNumbering, mVertexMarks, true).scanMin5(nbTot.get(), nbOp.get(), mSplitLevel == 12, prevA, 0, bangle, nBangles);
    } else if (mMinDegree == 4) {
      final int hint = Math.min(mMaxNV <= 19 ? mMaxNV - 3 : mMaxNV - 4, 17);
      initializeSplitting(startingSize, hint, mMaxNV - 3);
      if (mSplitLevel == 0 && mRes > 0) {
        return;
      }
      Min4.init(mState);
      Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
      new Min4Scanner(this, mNumbering, mMaxNV, mMinConnec, mPolytopeSwitch, true).scanMin4(nbTot.get(), nbOp.get(), mSplitLevel == 6, null);
    } else if (mMaxNV >= 4) {
      final int hint = Math.min(mMaxNV <= 13 ? mMaxNV - 1 : mMaxNV - 2, 14);
      initializeSplitting(startingSize, hint, mMaxNV - 1);
      if (mSplitLevel == 0 && mRes > 0) {
        return;
      }
      initializeTriang();
      Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
      mSimpleScanner.scan(nbTot.get(), nbOp.get());
    } else {
      assert mMaxNV <= 3;
      if (getMinPolyDegree() == 1 && mMinPolyConnec == 1 && mEdgeBound[0] <= 2 * mMaxNV - 2 && mEdgeBound[1] >= 2 * mMaxNV - 2 && mMaxFaceSize >= 2 * mMaxNV - 2) {
        Star.makeStar(mMaxNV, mState);
        Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
        setExactConnectivity(mMinConnec);
        gotOne(nbTot.get(), nbOp.get(), 1);
      }
      if (mMaxNV == 3 && getMinPolyDegree() <= 2 && mMinPolyConnec <= 2 && mEdgeBound[0] <= 6 && mEdgeBound[1] >= 6) {
        Cycle.makeCycle(mMaxNV, mState);
        Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
        setExactConnectivity(mMinConnec);
        gotOne(nbTot.get(), nbOp.get(), 2);
      }
    }
  }

  /* General bipartite graphs.  Main options are -m# -c# for #=1,2,3.  */
  private void bipartiteDispatch() {
    final Edge[] p1Edges = new Edge[MAX_VERTICES];
    // Bipartite graphs are made by first making quadrangulations,
    //   then deleting edges in a second phase.  minConn and mMinDegree
    //   are used in the first phase; minPolyConn and mMinPolyDeg in the
    //   second phase.
    if (mMinConnec <= 0) {
      setMinConnectivity(3);
    }
    mMinPolyConnec = mMinConnec;
    if (mMinConnec < 3) {
      setMinConnectivity(2);
    }
    if (mMinDegree <= 0) {
      setMinDegree(mMinConnec);
      setMinPolyDegree(mMinPolyConnec);
    } else {
      setMinPolyDegree(mMinDegree);
      setMinDegree(Math.max(mMinDegree, 2));
    }
    if (mMinConnec > mMinDegree) {
      setMinDegree(mMinConnec);
    }
    if (mMinPolyConnec > mMinPolyDeg) {
      setMinPolyDegree(mMinPolyConnec);
    }
    final int startingSize = mMinDegree == 2 ? 4 : 8;
    //checkRange(mMaxNV, "n", mMinPolyDeg == 1 ? 2 : startingSize, MAX_VERTICES);
    //checkRange(mMinPolyConnec, "-c", 1, 3);
    //checkRange(mMinPolyDeg, "-m", 1, 3);
    final int maxundir = mMaxNV == 2 ? 1 : 2 * mMaxNV - 4;
    if (mEdgeBound[0] < 0) {
      mEdgeBound[0] = 0;
    }
    if (mEdgeBound[1] < 0) {
      mEdgeBound[1] = maxundir;
    }
    if (mEdgeBound[1] > 2 * mMaxNV - 4) {
      mEdgeBound[1] = maxundir;
    }
    if (mMaxFaceSize <= 0) {
      mMaxFaceSize = MAX_EDGES;
    }
    mMaxFaceSize &= ~1;  // Must be even
    assert mEdgeBound[0] <= maxundir;
    assert mEdgeBound[0] <= mEdgeBound[1];
    checkRange(mMaxFaceSize, "-f", 4, MAX_EDGES);
    setExactConnectivity(mMinPolyConnec);
    if (mMaxNV >= startingSize && (mEdgeBound[0] == maxundir || mMaxFaceSize == 4)) {
      mPolytopeSwitch = mBipartiteSwitch = false;
      mEdgeBound[0] = -1;
      mEdgeBound[1] = -1;
      mMaxFaceSize = -1;
      new QuadrangulationDispatcher(this, mNumbering, mMaxNV).quadrangulationDispatch();
      return;
    }
    mEdgeBound[0] *= 2;
    mEdgeBound[1] *= 2;
//    if (sDSwitch) strcpy(outtypename,"eulerian graphs");
//    else         strcpy(outtypename,"bipartite graphs");
    final MutableInteger nbTot = new MutableInteger();
    final MutableInteger nbOp = new MutableInteger();
    if (mMinDegree == 2) {
      final int hint = Math.min(mMaxNV <= 16 ? mMaxNV - 5 : mMaxNV - 6, mMaxNV < 25 ? 17 : 18);
      initializeSplitting(startingSize, hint, mMaxNV - 1);
      if (mSplitLevel == 0 && mRes > 0) {
        return;
      }
      if (mMaxNV >= 4) {
        Quadrangulations.init(mState);
        new QuadrangulationAllScanner(this, mNumbering, true).mQuadrP0.extend(mFirstEdge[1]);   // make square
        setExactConnectivity(mMinConnec);
        Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
        new QuadrangulationAllScanner(this, mNumbering, true).scanQuadrangulationsAll(nbTot.get(), nbOp.get());
      }
      if (getMinPolyDegree() == 1 && mEdgeBound[0] <= 2 * mMaxNV - 2
        && mEdgeBound[1] >= 2 * mMaxNV - 2
        && mMaxFaceSize >= 2 * mMaxNV - 2
        && mRes == 0) {
        Star.makeStar(mMaxNV, mState);
        Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
        setExactConnectivity(mMinConnec);
        gotOne(nbTot.get(), nbOp.get(), 1);
      }
    } else {
      final int hint = Math.min(mMaxNV <= 23 ? mMaxNV - 5 : mMaxNV - 6, mMaxNV < 30 ? 23 : 24);
      initializeSplitting(startingSize, hint, mMaxNV - 2);
      if (mSplitLevel == 0 && mRes > 0) {
        return;
      }
      Min3Quadrangulations.init(mState);
      setExactConnectivity(mMinConnec);
      Canon.canon(this, mFirstEdge, mDegree, mNumbering, nbTot, nbOp);
      final QuadrangulationScanner scanner;
      if (mMinConnec == 3) {
        scanner = new QuadrangulationScanner(this, mNumbering, true);
      } else {
        scanner = new QuadrangulationMin3Scanner(this, mNumbering, true);
      }
      scanner.scan(nbTot.get(), nbOp.get(), mFirstEdge[0], mSplitLevel == 8, p1Edges, 0);
    }
  }

  /**
   * Turn on bipartite generation.
   * @param bipartite true for bipartite generation
   */
  public void setBipartite(final boolean bipartite) {
    mBipartiteSwitch = bipartite;
  }

  /**
   * Set verbose status.
   * @param verbose true for verbose
   */
  public void setVerbose(final boolean verbose) {
    mVerbose = verbose;
  }

  /**
   * Set the maximum size of a face.
   * @param size maximum face size
   */
  public void setMaxFaceSize(final int size) {
    mMaxFaceSize = size;
  }

  /**
   * Set the residue class and modulo value.
   * @param res residue class
   * @param mod modulo
   */
  public void setResMod(final int res, final int mod) {
    mRes = res;
    mMod = mod;
  }

  void setSplitCount(final int count) {
    mSplitCount = count;
  }

  private static final Edge[] EMPTY_EDGES = new Edge[0];

  Edge[] hasNoUsefulSplit(final boolean doSplit) {
    if (doSplit) {
      if (mSplitCount-- != 0) {
        return null;
      }
      setSplitCount(mMod - 1);
      return Arrays.copyOf(mFirstEdge, mState.mNumVertices);
    }
    return EMPTY_EDGES;
  }

  /**
   * Turn on polygon generation.
   * @param polygonSize size of polygons, 0 for all, -1 to disable.
   */
  public void setPolygonSize(final int polygonSize) {
    mPolygonSize = polygonSize;
  }

  private long dispatch() {
    if (mMinConnec < 0 && (mTSwitch || mExactSwitch)) {
      throw new IllegalArgumentException("-t and -x can only be used in conjunction with -c");
    }
    Arrays.fill(mNOutE, 0);
    Arrays.fill(mNOutEOp, 0);
    mBigGSwitch = mOuterPlanarSwitch;
    if (mPolytopeSwitch && mBipartiteSwitch) {
      bipartiteDispatch();
    } else if (mBipartiteSwitch) {
      new EulerianDispatcher(this, mNumbering, mMaxNV).dispatch(mMinConnec, mExactSwitch, mBigGSwitch);
    } else if (mPolytopeSwitch) {
      polytopeDispatch();
    } else if (mPolygonSize >= 0) {
      polygonDispatch();
    } else if (mQuadrangulationSwitch) {
      new QuadrangulationDispatcher(this, mNumbering, mMaxNV).quadrangulationDispatch();
    } else if (mMinConnec >= 5 || mMinDegree >= 5) {
      min5Dispatch();
    } else if (mMinConnec >= 4 || mMinDegree >= 4) {
      min4Dispatch();
    } else {
      new SimpleDispatcher(this, mNumbering, mMaxNV).simpleDispatch();
    }
    return mOuterPlanarSwitch ? LongUtils.sum(mNOutOp).longValueExact() : LongUtils.sum(mNOut).longValueExact();
  }

  /**
   * Programmatic entry point.
   * @param n number of vertices
   * @param minDegree minimum degree
   * @param minConnectivity minimum connectivity
   * @param polygonSize minimum polygon size (0 for all, -1 to disable)
   * @param orientationPreserving should orientation be preserved
   * @param planar restrict to planar
   * @param quadrangulations restrict to quadrangulations
   * @param exactDegree restrict to exact degree
   * @return number of graphs
   */
  public long count(final int n, final int minDegree, final int minConnectivity, final int polygonSize, final boolean orientationPreserving, final boolean planar, final boolean quadrangulations, final boolean exactDegree) {
    final ArrayList<String> args = new ArrayList<>();
    args.add("-u");
    if (mBipartiteSwitch) {
      args.add("-b");
    }
    args.add("-m");
    args.add(String.valueOf(minDegree));
    args.add("-c");
    args.add(String.valueOf(minConnectivity));
    args.add(String.valueOf(n));
    if (mMod != 0) {
      args.add("--residue");
      args.add(mRes + "/" + mMod);
    }
    if (mMaxFaceSize != -1) {
      args.add("-f");
      args.add(String.valueOf(mMaxFaceSize));
    }
    setExactConnectivity(-1);
    mMinPolyConnec = -1;
    setMinPolyDegree(-1);
    mSplitLevel = 0;
    Arrays.fill(mEdgeBound, 0);
    PlantriCliHelper.decodeCommandLine(this, args.toArray(new String[0]));
    mOuterPlanarSwitch = orientationPreserving;
    mQuadrangulationSwitch = quadrangulations;
    mExactSwitch = exactDegree;
    mPolytopeSwitch = planar;
    setPolygonSize(polygonSize);
    Arrays.fill(mNOut, 0);
    Arrays.fill(mNOutOp, 0);
    return dispatch();
  }

  /**
   * Main entry point for plantri.
   * @param args see original plantri help
   */
  public static void main(final String[] args) {
    final Plantri plantri = new Plantri();
    PlantriCliHelper.decodeCommandLine(plantri, args);
    System.out.println(plantri.dispatch());
  }
}
