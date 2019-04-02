/* Original copyright notice:
 *
 * Copyright (C) 2005 Universiteit Gent
 * Copyright (C) 2001 Universit&auml;t Bielefeld
 * Copyright (C) 2001 Ecole des hautes &eacute;tudes commerciale,  Montr&eacute;al
 *
 * Original authors: Gunnar Brinkmann, Gilles Caporossi
 * Adapted to GrInvIn by: Gunnar Brinkmann, Nicolas Van Cleemput
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with this distribution. This license can also
 * be found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package irvine.oeis.a018;

import irvine.math.MutableInteger;
import irvine.math.plantri.Marks;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018190 Number of planar simply-connected polyhexes (or benzenoid hydrocarbons) with n hexagons.
 * @author Gunnar Brinkmann
 * @author Gilles Caporossi
 * @author Nicolas Van Cleemput
 * @author Sean A. Irvine
 */
public class A018190 implements Sequence {

  private static final int MAXNV = 30;              // the maximum number of vertices -- at most CHAR_MAX-1
  private static final int MAXE = 6 * MAXNV - 12;   // the maximum number of oriented edges
  //private static final int MAXF = 2 * MAXNV - 4;    // the maximum number of faces
  private static final int MAXAUTS = 12;          // the maximum number of automorphisms
  private static final int SPLITLEVEL = 16;       // which is the level (number of hexagons) where the option m shall split it into parts
  private static final int EMPTY = MAXNV + 1;
  private static final int UNNAMED = 0; // EMPTY
  private static final int OCCUPIED = 1;

  private enum GroupName {
    CS, C2V, C2H, D2H, C3H, D3H, C6H, D6H
  }

  /* The data type used for edges */
  private static final class Edge {
    private int mStart;    // vertex where the edge starts
    private int mEnd;      // vertex where the edge ends
    private Edge mPrev;    // previous edge in clockwise direction
    private Edge mNext;    // previous edge in clockwise direction
    private Edge mInverse; // the edge that is inverse to this one
    private int mDummy1;
    private int mDummy2;   /* ints for temporary use. Every function may use
                              them but may NEVER rely on them not having changed
                              after another function has been called */
    private int mFwdLbl;   // for the canonLabel function
    private int mBwdLbl;
  }

  /* The shortened data type used for edges in the triangular net */
  private static final class Edge2 {
    /* char pointer to where the edge starts. The real name in the
       net is never needed. This is the name of the vertex mapped
       here and 0 in case no vertex was already mapped here. It is used
       as an integer pointer with all edges around one vertex pointing
       to the same integer, so that modification of the value can be
       done faster */
    private MutableInteger mStart;
    private MutableInteger mEnd;
    private Edge2 mNext;     // previous edge in clockwise direction
    private Edge2 mNextNext; // = .mNext.mNext
    private Edge2 mInverse;  // the edge that is inverse to this one
  }

  /* What it is all about: This contains the graph to be constructed */
  private final Edge[] mMap = new Edge[MAXNV];
  /* map[i] is an arbitrary edge starting at vertex i.
     WHICH edge is chosen is arbitrary. No function can rely
     on this edge not changing after something "has been done
     to the graph" -- when returning, it might be another
     arbitrary edge. */


  private int mMaxNumVertices = 0;
  private int mNumVertices; /* The vertex number of the final graph -- that is: The face number of the
                the dual (mMaxNumVertices) and the temporary vertex number during the construction */

  private int mNumEdges; /* number of ORIENTED edges -- twice the number of unoriented edges */

  private int mC;
  private int mH; /* the number of mC-atoms and mH-atoms -- are computed every time a skeleton is given to next_step */
  //private int CHdifference; /* always equal to 2 times the number of hexagons -2 */
  //private int Cconstant; /* always equal to 5*mMaxNumVertices+1 */

  /* This is always an edge with the boundary on the left side
     (mPrev-direction). It may only be altered in delete-vertex and
     add-vertex. It is always the edge leaving the last vertex
     and having the outer face on the left. */
  private Edge mBoundaryEdge;

  /* Here the old boundary edges are stored in order to
     repair the boundary edge value after deletion of a vertex */
  private final Edge[] mBoundaryEdges = new Edge[MAXNV];


  //private long mNumberOfSkeletons = 0;
  //private long mTrivSkeletons = 0;
  //private long mNumberOfLabellings = 0;
  private long mCount = 0; /* The mCount how many structures are accepted (helicenes or benzenoids) */
  //private final long[][] formula = new long[4 * MAXNV + 3][2 * MAXNV + 5];
  /* formula[x][y] gives the number of structures with chemical formula C_x H_y */
  private final long[][][] mGroupFormula = new long[8][4 * MAXNV + 3][2 * MAXNV + 5];
  /* The chemical formulas sorted with respect to their groups */
  //private long catas = 0; /* the number of catacondensed structures */
  private GroupName mGroupName;

  //private char catacondensed; /* Is the structure catacondensed ? */
  /* the number of oriented edges in the dual of a catacondensed structure: 2*mMaxNumVertices-2 -- the same as Chdifference */

  private final int[] mDegree = new int[MAXNV]; /* The valency of the vertices */

  /* The number of boundary components of the vertex = the number of
     times it occurs in the boundary. For mDegree 6 it is 0, for
     mDegree 5 or 1 it is one, for 2,4 it is one or two and for 3
     it is one, two or three. The entry mComponents[i] gives the
     number of components of vertex i for 0<=i<=mNumVertices. For larger i it
     is undefined. */
  private final int[] mComponents = new int[MAXNV];

  private final Edge[][] mCanNumberings = new Edge[MAXAUTS][MAXE]; /* the canonical numberings */
  private int mNumberCanNumberings;
  private int mNumberCanNumbOrPres;
  /* The number of canonical numberings and orientation preserving canonical numberings */

  /* When a new vertex is added to the boundary, it is taken from this
     list. The list contains (pointers to) edges leaving a vertex with some
     pre-initialised edges and their inverse. mNewVertex[a][b] contains
     an edge starting at vertex a and being pre-initialised to form
     a star with b edges. mNewVertex[x][0] is not used. */
  private final Edge[][] mNewVertex = new Edge[MAXNV][6];

  /* mPossibleLabels[i][j] contains the number of labels
     for a vertex with mDegree i and j components.
     Fields corresponding to impossible combinations
     like mPossibleLabels[6][2] are not initialized,
     so they contain a random value. */
  private final char[][] mPossibleLabels = new char[7][4];

  /* The labels of the skeleton describing the helicene (1,2 or
     maximally 3) interpreted as: 1,2 or 3 boundary edges when
     occurring on the boundary for the first time after
     "mBoundaryEdge" */
  private final char[] mLabel = new char[MAXNV];


  //private final int[] variable_positions = new int[MAXNV]; /* list of vertices, where more than one mLabel is possible */
  /* How many possibilities are there ? This field is used differently in case of benzenoids
     and helicenes. For helicenes it gives the number of possibilities at the [i]-th variable
     position -- for benzenoids it gives the number at vertex [i] */
  private final int[] mNumberOfPossibilities = new int[MAXNV];
  //private int maxlevel; /* number of variable positions minus 1 */
  /* These variables are global in order not to pass them in the recursive call of construct_labels */

  private int mGlobalInit; /* a marker whether the canonLabel() routine is called for a new skeleton or the same one as before */
  //private int just_skeletons = 0; /* shall just skeletons be generated */
  private int mModulo = 0;
  //private int part;   /* shall the generation be split -- which part is to be generated */
  private int mModuloCounter = 0;
  //private int pl_code_out = 0;
  //private int bec_out; /* shall planar code or BEC be written to outfile (stdout) ? */
  //  private char logfilename[100];
  //private int just_count = 0; /* by default all isomers are really formed in the memory of the computer -- this can be switched off */
  private boolean mBenzenoids = false; /* shall just benzenoid structures be generated ? */
  private boolean mDetailed = false; /* shall additional data like the mGroupName and the formula be computed and
       displayed ? Option: d */
  //FILE *outfile; /* The file to write data to -- default: stdout */


  /* for the embedding in the net in case of benzenoids, the following variables are  used: */
  private final Edge2[] mEdgeNet = initEdge2(MAXNV); /* This is an edge in the net that has the outer face of the
         embedding on the right and is the first edge of 
         the vertex [number] when running around the boundary
         starting from mBoundaryEdge in clockwise direction. So
         the direction of the edge is against the running direction.*/

  private final int[][] mEmbedFromHere = new int[MAXNV + 1][2]; /* which vertices are embedded from here -- at most two
            they are listed in clockwise direction */


  /* How many edges must(may) be checked when the vertex is embedded.
     The checking starts at the second edge in .mNext direction
     after the reference edge for the embedding.
     This is sometimes more than just the number of boundary edges. */
  private final int[] mCheckEdges = new int[MAXNV + 1];

  /* An edge in the center of the net used for embedding the helicenes when testing for being benzenoid */
  private Edge2 mStartNet;

  /* How many edges are BETWEEN the first edge with boundary on the left
     leaving this vertex and the mNext one in clockwise direction ?
     This field is only valid for vertices with 2 boundary components. */
  private final int[] mJump = new int[MAXNV];
  //private final int[] jumpname = new int[MAXNV]; /* What is the name of the vertex at the mEnd of that edge ? */

  private final Marks mMarks = new Marks(30000);

  /* Writes a man-readable representation */
//  private void writemap() {
//    System.out.printf("\nNumber of vertices: %d   Number of edges: %d\n", mNumVertices, mNumEdges);
//    for (int i = 0; i < mNumVertices; ++i) {
//      System.out.printf("%d:", i);
//      Edge run = mMap[i];
//      System.out.printf(" %d", run.mEnd);
//      for (run = run.mNext; run != mMap[i]; run = run.mNext) {
//        System.out.printf(" %d", run.mEnd);
//      }
//      System.out.printf("      mDegree: %d mComponents: %d\n", mDegree[i], mComponents[i]);
//    }
//    System.out.println();
//  }

//  private void writeedge (final Edge edge) {
//    if (edge == null) {
//      System.out.println("SAI: NULL");
//      return;
//    }
//    System.out.println("SAI: " + edge.mStart + " " + edge.mEnd + " " + edge.mDummy1 + " " + edge.mDummy2 + " " + edge.mFwdLbl + " " + edge.mBwdLbl + " " + (edge.mPrev == null) + " " + (edge.mNext == null) + " " + (edge.mInverse == null));
////    fprintf(stderr,"Address: %d\n",edge);
////    fprintf(stderr,"%d.%d\n",edge.mStart, edge.mEnd);
////    fprintf(stderr,"mNext: %d mPrev: %d mInverse: %d\n",edge.mNext, edge.mPrev, edge.mInverse);
////    fprintf(stderr,"mDummy1: %d mDummy2: %d mFwdLbl: %d mBwdLbl: %d\n",
////      edge.mDummy1, edge.mDummy2, edge.mFwdLbl, edge.mBwdLbl);
//  }

//
//  void writemap_explicitly()
//
//  {
//
//    int i;
//    Edge *run;
//
//    fprintf(stderr,"\nNumber of vertices: %d\n",mNumVertices);
//    for (i=0; i<mNumVertices; ++i)
//    { fprintf(stderr,"%d -- mDegree: %d  mComponents: %d\n",i,mDegree[i], mComponents[i]);
//      run=mMap[i];
//      writeedge(run);
//      for (run=run.mNext; run!=mMap[i]; run=run.mNext) writeedge(run);
//    }
//    fprintf(stderr,"\n");
//  }
//
//  void writepositions(Edge *starts[], int how_much[][6])
//  {
//    int i,j;
//
//    fprintf(stderr,"\nPositions:\n");
//    for (i=0; starts[i]; ++i)
//    { fprintf(stderr,"%d.%d    ",starts[i].mStart, starts[i].mEnd);
//      for (j=0; how_much[i][j]; ++j) fprintf(stderr," %d",how_much[i][j]);
//      fprintf(stderr,"\n");
//    }
//  }
//
//#endif
//
//  void writecode(FILE *fil)
//
//  /* Writes the planarcode of mMap to fil */
//
//  {
//
//    static FILE *fil0=null;
//    static int first_write=1;
//    Edge *run;
//    int i;
//
//    if (fil0==null) fil0=fil;
//    else if (fil0 != fil)
//    { fprintf(stderr,"Sorry -- just prepared to write to one file per run.\n");
//      exit(1); }
//    if (first_write) { fprintf(fil0,">>planar_code<<"); first_write=0; }
//
//    putc(mNumVertices,fil0);
//    for (i=0; i<mNumVertices; ++i)
//    {
//      run=mMap[i]; putc(run.mEnd+1,fil0);
//      for (run=run.mNext; run!=mMap[i]; run=run.mNext) { putc(run.mEnd+1,fil0); }
//      putc(0,fil0);
//    }
//  }
//
//  void fill_in(FILE *fil, Edge *edge, int *number , int mPrev[], int mNext[], int how_many)
//
///* fills in the mNext field for edge and the mPrev field for edge.mInverse.mNext.
//   The code for the how_many valency 2 vertices in between is written to fil. */
//  {
//    int thisnumber, nextnumber;
//
//    thisnumber=edge.mDummy1;
//    nextnumber=edge.mInverse.mNext.mDummy1;
//
//    if (how_many)
//    {
//      (*number)++; mNext[thisnumber]=(*number);
//      putc(thisnumber,fil);
//      for (how_many--; how_many>0; how_many--)
//      { (*number)++; putc((*number),fil); putc(0,fil);
//        putc((*number)-1,fil);
//      }
//      putc(nextnumber,fil); putc(0,fil);
//      mPrev[nextnumber]=(*number);
//    }
//    else
//    { mNext[thisnumber]=nextnumber;
//      mPrev[nextnumber]=thisnumber;
//    }
//  }
//
//
//  void compute_bec(char bec[])
//  {
//    char bec_bak[4*MAXNV];
//    int pos,
//    found[MAXNV],
//      improved,
//      worse,
//      alt,
//      lbec,
//      se,
//      i;
//
//    Edge *ed;
//
//    for(pos = 0;pos < mNumVertices;pos++)
//      found[pos] = 0;
//
//    bec[0] = '\0';
//    bec_bak[0] = '\0';
//
//    lbec = 0;
//    ed = mBoundaryEdge;
//    do {
//      se = ed.mStart;
//      if(mLabel[se]) {
//        if(found[se]) {
//          bec[lbec] = 6 - mDegree[se] - mLabel[se] + 48;
//        } else
//          bec[lbec] = mLabel[se] + 48;
//        found[se] = 1;
//      } else {
//        if(mComponents[se] == 1)
//          bec[lbec] = 6 - mDegree[se] + 48;
//        else
//          bec[lbec] = 49;
//      }
//      lbec++;
//      bec[lbec] = '\0';
//      ed = ed.mInverse.mNext;
//    }while(ed != mBoundaryEdge);
//
//    for(i=lbec;i>=0;--i) bec[i+lbec] = bec[i];
//
//    /* now we have A boundary code but let's make it ordered properly..*/
//    improved = 1;
//    while(improved) {
//      improved = 0;
//      alt = 0;
//
//      while(alt < lbec && !improved) {
//        alt++;
//
//        if(bec[alt] >= bec[0]) {
//  /*
//  found an alternative possible mStart
//  try foreward
//  */
//          pos = alt;
//          worse = 0;
//          for(i=0;i<lbec && !improved && !worse;++i) {
//            if(bec[pos+i] > bec[i]) {
//              improved = 1;
//              for(i=0;i<lbec;++i)
//                bec[i] = bec[alt+i];
//              bec[lbec] = '\0';
//
//              for(i=lbec;i>=0;--i) bec[i+lbec] = bec[i];
//            }else
//            if(bec[pos+i] < bec[i])
//              worse = 1;
//          }
//          /* now try backward */
//          if(!improved) {
//            pos = alt + lbec;
//            worse = 0;
//            for(i=0;i<lbec && !improved && !worse;++i) {
//              if(bec[pos-i] > bec[i]) {
//
//                improved = 1;
//                strcpy(bec_bak,bec);
//                for(i=0;i<lbec;++i)
//                  bec[i] = bec_bak[pos-i];
//                bec[lbec] = '\0';
//
//                for(i=lbec;i>=0;--i) bec[i+lbec] = bec[i];
//              }else
//              if(bec[pos-i] < bec[i])
//                worse = 1;
//            }
//          }
//        }
//      }
//    }
//    /* now we found (hopefully) the bec code of the helicene */
//    bec[lbec] = '\0';
//    return;
//  }

//  void write_bec(FILE *fil)
//  {
//    char code[4*MAXNV];
//
//    compute_bec(code);
//    fprintf(fil,"%s\n",code);
//    return;
//  }
//
//
//  void write_helicene_pl(FILE *fil)
//
//  /* Writes the planarcode of the helicene to fil */
//
//  {
//
//    static FILE *fil0=null;
//    static int first_write=1;
//    Edge *run;
//    static Edge *where[4*MAXNV+2]; /* where[x] is a pointer to an edge with the helicene vertex
//          number x on the left hand side */
//    static int i,j, vertex, runvertex, valency, visited[MAXNV];
//    static int mPrev[4*MAXNV+2], mNext[4*MAXNV+2]; /* The vertex previous and mNext on the boundary
//            of the vertex [x] */
//    static int total_vertices, deg2_vertices, deg3_vertices;
//
//
//    if (fil0==null) fil0=fil;
//    else if (fil0 != fil)
//    { fprintf(stderr,"Sorry -- just prepared to write to one file per run.\n");
//      exit(1); }
//    if (first_write) { fprintf(fil0,">>planar_code<<"); first_write=0; }
//
//    total_vertices= 5*mNumVertices - (mNumEdges/2) +1; /* Note that mNumEdges is the number of directed edges */
//    deg3_vertices= 2*mNumVertices-2;
//    deg2_vertices= total_vertices-deg3_vertices;
//
//
///* in mDummy1 the name of the vertex on the left hand side of the edge is written;
//   mDummy2 is 1 if and only if on the left side there is the outer face. */
//
//    for (i=0; i<mNumVertices; ++i)
//    { visited[i]=0;
//      run=mMap[i];
//      for (j=0; j<mDegree[i]; ++j)
//      { run.mDummy1=run.mDummy2=0;
//        run=run.mNext; }
//    }
//
//    run=mBoundaryEdge;
//    do
//    { run.mDummy2=1; run=run.mInverse.mNext; }
//    while (run != mBoundaryEdge);
//
//
//
//    for (i=0, vertex=deg2_vertices; i<mNumVertices; ++i) /* the mDegree 2 vertices get the smallest numbers,
//              so these ones mStart at deg2_vertices+1*/
//    { run=mMap[i];
//      for (j=0; j<mDegree[i];++j)
//      { /* every vertex is on the left hand side of some edge -- so we only do lefts */
//        if (run.mDummy1==0) /* no vertex on the left side yet */
//        { vertex++; /* new vertex */
//          where[vertex]=run;
//          run.mDummy1=vertex;
//          if (run.mDummy2==0) /* On the left there is a triangle */
//          { run.mPrev.mInverse.mDummy1=vertex;
//            run.mInverse.mNext.mDummy1=vertex;
//          }
//        }
//        run=run.mNext;
//      }
//    }
//
//    runvertex=0;
//    putc(total_vertices,fil);
//    run=mBoundaryEdge;
//    do
//    { vertex=run.mEnd;
//      valency=mDegree[vertex];
//      switch(valency)
//      {
//        case 1: { fill_in(fil, run, &runvertex, mPrev, mNext, 4);
//          break; } /* occurs only once in the boundary */
//        case 2: { if (mComponents[vertex]==1) fill_in(fil, run, &runvertex, mPrev, mNext, 3);
//    else
//          {
//            switch(mLabel[vertex])
//            {
//              case 3: { if (!visited[vertex])
//                fill_in(fil, run, &runvertex, mPrev, mNext, 2);
//        else fill_in(fil, run, &runvertex, mPrev, mNext, 0);
//                break; }
//              case 2: { fill_in(fil, run, &runvertex, mPrev, mNext, 1); break; }
//              case 1: { if (visited[vertex])
//                fill_in(fil, run, &runvertex, mPrev, mNext, 2);
//        else fill_in(fil, run, &runvertex, mPrev, mNext, 0);
//                break; }
//            }
//            visited[vertex]=1;
//          }
//          break;
//        }
//        case 3: { if (mComponents[vertex]==1) fill_in(fil, run, &runvertex, mPrev, mNext, 2);
//    else
//          if (mComponents[vertex]==2)
//          {
//            switch(mLabel[vertex])
//            {
//              case 2: { if (visited[vertex])
//                fill_in(fil, run, &runvertex, mPrev, mNext, 0);
//        else fill_in(fil, run, &runvertex, mPrev, mNext, 1);
//                break; }
//              case 1: { if (visited[vertex])
//                fill_in(fil, run, &runvertex, mPrev, mNext, 1);
//        else fill_in(fil, run, &runvertex, mPrev, mNext, 0);
//                break; }
//            }
//          }
//          else /*mComponents==3 */ fill_in(fil, run, &runvertex, mPrev, mNext, 0);
//          visited[vertex]=1;
//          break;
//        }
//        case 4: { if (mComponents[vertex]==1) fill_in(fil, run, &runvertex, mPrev, mNext, 1);
//    else fill_in(fil, run, &runvertex, mPrev, mNext, 0);
//          break;
//        }
//        case 5: { fill_in(fil, run, &runvertex, mPrev, mNext, 0); break; }
//        default: { fprintf(stderr,"Valency %d on the boundary -- error.\n",valency);
//          exit(1); }
//      }
//      run=run.mInverse.mNext;
//    } while (run != mBoundaryEdge);
//
//
//    for (i=deg2_vertices+1; i<=total_vertices; ++i)
//    { run=where[i];
//      putc(run.mInverse.mDummy1,fil);
//      if (run.mDummy2)
//      { putc(mPrev[i],fil); putc(mNext[i],fil); }
//      else { putc(run.mPrev.mDummy1,fil); putc(run.mInverse.mNext.mInverse.mDummy1,fil); }
//      putc(0,fil);
//    }
//
//  }
//
//  void writecomponents()
//  {
//    int i;
//    fprintf(stderr,"\n Components:\n");
//    for (i=0; i<mNumVertices; ++i) fprintf(stderr,"%d:%d ",i,mComponents[i]);
//  }
//

  private final char[] mRefStart = new char[2 * MAXNV]; /* .mStart from the reference edge for that mLabel in list */
  private final char[] mBakVal = new char[2 * MAXNV];          /* 0 if first time encountered 6 - deg[v] otherwise*/
  private int mListLen = 0; /* how many elements in the list */

  private boolean canonLabel(final Edge[] starts, int orPres, final int total, final int init) {
    if (orPres == 0) {
      orPres = total; // All automorphisms are orientation preserving
    }

    if (init != 0) {
      // Make the structures for a new skeleton
      final boolean[] found = new boolean[mNumVertices]; // did we already see this one?
      // First turn to set up mRefStart[] and mBakVal[]
      Edge current = starts[0];
      mListLen = 0;
      do {
        final int cs = current.mStart;
        current.mFwdLbl = mListLen;
        if (mLabel[cs] != 0) {
          // Set up mBakVal[i] = 0 or 6 - mDegree[cs] to make easily the reduced BEC later
          if (found[cs]) {
            mBakVal[mListLen] = (char) (6 - mDegree[cs]);
          } else {
            mBakVal[mListLen] = 0;
          }
          // Edge from which we are referring in the list
          mRefStart[mListLen++] = (char) cs;
          found[cs] = true;
        }
        current = current.mInverse.mNext;
      } while (current != starts[0]);

      // Set up the mFwdLbl and mBwdLbl which shows the labels in each way
      current = starts[0];
      while (mLabel[current.mEnd] == 0) {
        current = current.mInverse.mNext;
      }
      current = current.mInverse;
      int curlst = current.mNext.mFwdLbl;
      final Edge firstEdge = current;
      do {
        if (mLabel[current.mStart] != 0) {
          current.mBwdLbl = current.mNext.mFwdLbl;
          curlst = current.mBwdLbl;
        } else {
          current.mBwdLbl = curlst;
        }
        current = current.mNext.mInverse;
      } while (current != firstEdge);
    }

    // Start the work in general case.
    int numbs = 1; // Count the orientation preserving/reversing automorphisms
    if (orPres > 1) {
      for (int i = 1; i < orPres; ++i) {
        boolean foundAutom = true;
        int ed = starts[i].mFwdLbl;
        for (int j = 0; j < mListLen; ++j) {
          if (ed + j >= mListLen) {
            ed -= mListLen;
          }
          // Make some short cuts
          final int rj = mRefStart[j];
          final int redj = mRefStart[ed + j];
          // Treat each case separately when comparing...
          if (mBakVal[j] == 0) {
            if (mBakVal[ed + j] == 0) {
              final int c = Integer.compare(mLabel[rj], mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            } else {
              final int c = Integer.compare(mLabel[rj], mBakVal[ed + j] - mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            }
          } else {
            if (mBakVal[ed + j] == 0) {
              final int c = Integer.compare(mBakVal[j] - mLabel[rj], mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            } else {
              final int c = Integer.compare(mBakVal[j] - mLabel[rj], mBakVal[ed + j] - mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            }
          }
        }
        if (foundAutom) {
          ++numbs;
        }
      }
    }

    // Orientation reversing edges
    int numbsMirror = 0;
    if (orPres < total) {
      for (int i = orPres; i < total; ++i) {
        boolean foundAutom = true;
        int ed = starts[i].mBwdLbl;
        for (int j = 0; j < mListLen; ++j) {
          if (ed - j < 0) {
            ed += mListLen;
          }
          // Short cuts
          final int rj = mRefStart[j];
          final int redj = mRefStart[ed - j];
          // Treat separately each case
          if (mBakVal[j] == 0) {
            if (mBakVal[ed - j] == 0) {
              final int c = Integer.compare(mLabel[rj], mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            } else {
              final int c = Integer.compare(mLabel[rj], mBakVal[ed - j] - mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            }
          } else {
            if (mBakVal[ed - j] == 0) {
              final int c = Integer.compare(mBakVal[j] - mLabel[rj], mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            } else {
              final int c = Integer.compare(mBakVal[j] - mLabel[rj], mBakVal[ed - j] - mLabel[redj]);
              if (c < 0) {
                return false;
              } else if (c > 0) {
                foundAutom = false;
                break;
              }
            }
          }
        }
        if (foundAutom) {
          ++numbsMirror;
        }
      }
    }

    if (numbs < numbsMirror) {
      final int t = numbs;
      numbs = numbsMirror;
      numbsMirror = t;
    }
    if (numbs == 1 && numbsMirror == 0) {
      mGroupName = GroupName.CS;
    } else if (numbs == 1 && numbsMirror == 1) {
      mGroupName = GroupName.C2V;
    } else if (numbs == 2 && numbsMirror == 0) {
      mGroupName = GroupName.C2H;
    } else if (numbs == 2 && numbsMirror == 2) {
      mGroupName = GroupName.D2H;
    } else if (numbs == 3 && numbsMirror == 0) {
      mGroupName = GroupName.C3H;
    } else if (numbs == 3 && numbsMirror == 3) {
      mGroupName = GroupName.D3H;
    } else if (numbs == 6 && numbsMirror == 0) {
      mGroupName = GroupName.C6H;
    } else if (numbs == 6 && numbsMirror == 6) {
      mGroupName = GroupName.D6H;
    } else {
      throw new RuntimeException("Problem -- didn't recognize mGroupName");
    }
    return true;
  }


  void writeUp() {
    ++mCount;
    if (mDetailed) {
      ++mGroupFormula[mGroupName.ordinal()][mC][mH];
      //if (catacondensed) catas++;
    }

//    if (just_count) return;
//
//    if (pl_code_out) write_helicene_pl(outfile);
//    else if (bec_out) write_bec(outfile);
  }


//  void construct_labels(int level)
//  {
//    char i;
//    char *labelp;
//
//    labelp=mLabel+variable_positions[level];
//    for (i=mNumberOfPossibilities[level]; i != 0 ;--i)
//    { *labelp=i;
//      if (level==maxlevel)   { writeUp(); }
//      else construct_labels(level+1);
//    }
//  }
//
//  void construct_labels_symm(int level, Edge *starts[])
//  {
//    char i;
//    char *labelp;
//
//    labelp=mLabel+variable_positions[level];
//    for (i=mNumberOfPossibilities[level]; i != 0 ;--i)
//    {
//    *labelp=i;
//      if (level==maxlevel)
//      {
//        if (canonLabel(starts, mNumberCanNumbOrPres, mNumberCanNumberings,
//          mGlobalInit))
//          writeUp();
//        mGlobalInit=0;}
//      else construct_labels_symm(level+1,starts);
//    }
//  }
//
//
//  void next_step()
//  {
//    static int num_vp; /* number of variable positions */
//    static int i,dummy;
//    static long num_labels;
//    static Edge *starts[MAXAUTS];
//
//    if (mNumberCanNumberings==1) mTrivSkeletons++;
//    mNumberOfSkeletons++;
//
//    if (just_skeletons) return;
//
//    if (mDetailed)
//    { catacondensed= (mNumEdges==catanumber);
//      mC=Cconstant-(mNumEdges>>1);
//      mH=mC-CHdifference;;
//    }
//
//    mGlobalInit=1; /* mNext time the canonLabel routine is called, it must
//      be initialised for a new skeleton */
//
//    /* compute the positions where various labels are possible */
//    num_labels=1;
//    for (i=num_vp=0; i<mNumVertices ; ++i)
//    { dummy=mPossibleLabels[mDegree[i]][mComponents[i]];
//      if (dummy==1) mLabel[i]=0;
//      else
//      { variable_positions[num_vp]=i;
//        mNumberOfPossibilities[num_vp]=dummy;
//        num_labels *= dummy;
//        num_vp++;
//      }
//    }
//
//    mNumberOfLabellings += num_labels;
//
//    if (num_labels==1) { writeUp(); }
//    else {
//      maxlevel=num_vp-1;
//      if (mNumberCanNumberings==1)
//      { if (just_count) { mCount += num_labels;
//        if (mDetailed) { mGroupFormula[Cs][mC][mH] += num_labels;
//          if (catacondensed) catas += num_labels; }
//      }
//      else { construct_labels(0); }
//      }
//      else { /* Look for the orbit of "mBoundaryEdge": */
//        for (i=0; mCanNumberings[0][i] != mBoundaryEdge; ++i);
//        /* write them all to starts: */
//        for (dummy=0; dummy<mNumberCanNumberings; dummy++)
//          starts[dummy]=mCanNumberings[dummy][i];
//        construct_labels_symm(0,starts);
//      }
//
//    }
//
//
//
//
//  }

  private Edge2 nthEdge(Edge2 edge, final int n) {
    for (int i = n; i != 1; --i, edge = edge.mNext) {
      // do nothing
    }
    return edge;
  }

  /* This function continues the construction of the labels and
     simultaneously embeds the structures into the hexagonal net.
     Whenever it embeds a vertex, it checks whether the edges that are assumed
     to be boundary edges really do not lead to embedded vertices.
     Furthermore all the places that lead to other mComponents than the one
     one comes from, must also be empty, since whenever a vertex is embedded, it
     is FIRST visited. */
  private void embedBenzenoid(final int[] which, final int wp) {

    MutableInteger delete = null; // Is there an entry that must be reset to UNNAMED
    final int vertex = which[wp];
    final Edge2 startEdge = mEdgeNet[vertex];
    final Edge2 startEdgeNN = startEdge.mNextNext;

    // OK -- then let's embed the vertex
    if (mNumberOfPossibilities[vertex] == 1) {
      // Some mEdgeNet[] entries have to be initialised
      if (mComponents[vertex] == 1) {
        // One vertex has to be embedded from here
        delete = findPlace(vertex, startEdgeNN);
        if (delete == null) {
          return;
        }
        if (which[wp + 1] == EMPTY) {
          writeUp();
        } else {
          embedBenzenoid(which, wp + 1);
        }
      } else if (mComponents[vertex] == 2) {
        final int jumpVertex = mEmbedFromHere[vertex][1];
        if (jumpVertex >= 0) {
          final Edge2 runNet = nthEdge(startEdgeNN, mCheckEdges[vertex]);
          final Edge2 buffer = runNet.mInverse;
          int test = 1;
          Edge2 run2 = buffer.mNextNext;
          for (int j = mCheckEdges[jumpVertex]; j != 0; run2 = run2.mNext, --j) {
            if (run2.mEnd.get() != UNNAMED) {
              test = 0;
            }
          }
          if (test != 0) {
            mEdgeNet[jumpVertex] = buffer;
            delete = buffer.mStart;
            delete.set(OCCUPIED);
          } else {
            return;
          }
        }

        final int fixVertex = mEmbedFromHere[vertex][0];
        // This one is ALWAYS embedded after vertex
        final Edge2 buffer = startEdgeNN.mInverse;
        int test = 1;
        Edge2 run2 = buffer.mNextNext;
        for (int j = mCheckEdges[fixVertex]; j != 0; run2 = run2.mNext, --j) {
          if (run2.mEnd.get() != UNNAMED) {
            test = 0;
          }
        }
        if (test != 0) {
          mEdgeNet[fixVertex] = buffer;
          final MutableInteger charp = buffer.mStart;
          charp.set(OCCUPIED);
          if (which[wp + 1] == EMPTY) {
            writeUp();
          } else {
            embedBenzenoid(which, wp + 1);
          }
          charp.set(UNNAMED);
        }
      } else {
        // that is: (mComponents[vertex]==3) -- the other vertices MUST be embedded later and we know that 3 places must be checked
        Edge2 buffer = startEdgeNN.mInverse;
        int fixVertex = mEmbedFromHere[vertex][0];
        Edge2 run2 = buffer.mNextNext;
        if (run2.mEnd.get() == UNNAMED) {
          run2 = run2.mNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              delete = buffer.mStart;
              mEdgeNet[fixVertex] = buffer;
              delete.set(OCCUPIED);
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }

        fixVertex = mEmbedFromHere[vertex][1];
        buffer = startEdgeNN.mNextNext.mInverse;

        run2 = buffer.mNextNext;
        if (run2.mEnd.get() == UNNAMED) {
          run2 = run2.mNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mEdgeNet[fixVertex] = buffer;
              final MutableInteger charp = buffer.mStart;
              charp.set(OCCUPIED);
              if (which[wp + 1] == EMPTY) {
                writeUp();
              } else {
                embedBenzenoid(which, wp + 1);
              }
              charp.set(UNNAMED);
            }
          }
        }
      }
    } else { // Number of components is always 2
      final int poss = mNumberOfPossibilities[vertex];
      if (poss == 3) {
        final int fixVertex = mEmbedFromHere[vertex][0];
        Edge2 runNet = startEdgeNN;
        if (runNet.mInverse.mNextNext.mNextNext.mEnd.get() != UNNAMED) {
          /* At a position neighbouring both the faces where the hexagon is placed for
            label 1 and 2 a forbidden neighbour was detected, so only 3 is possible */
          runNet = runNet.mNextNext;
          final Edge2 buffer = runNet.mInverse;
          Edge2 run2 = buffer.mNextNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              run2 = run2.mNext;
              if (run2.mEnd.get() == UNNAMED) {
                mLabel[vertex] = 3;
                mEdgeNet[fixVertex] = buffer;
                final MutableInteger charp = buffer.mStart;
                charp.set(OCCUPIED);
                if (which[wp + 1] == EMPTY) {
                  writeUp();
                } else {
                  embedBenzenoid(which, wp + 1);
                }
                charp.set(UNNAMED);
              }
            }
          }
        } else {
          //this face is OK -- and need not be checked again
          // OK first try label 1
          Edge2 buffer = runNet.mInverse;
          Edge2 run2 = buffer.mNextNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mLabel[vertex] = 1;
              mEdgeNet[fixVertex] = buffer;
              final MutableInteger charp = buffer.mStart;
              charp.set(OCCUPIED);
              if (which[wp + 1] == EMPTY) {
                writeUp();
              } else {
                embedBenzenoid(which, wp + 1);
              }
              charp.set(UNNAMED);
            }
          }
          runNet = runNet.mNext;
          buffer = runNet.mInverse;
          if (buffer.mNextNext.mNextNext.mEnd.get() == UNNAMED) {
            // Otherwise this time the face between position 2 and 3 made a problem
            buffer = runNet.mInverse;
            run2 = buffer.mNextNext.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mLabel[vertex] = 2;
              mEdgeNet[fixVertex] = buffer;
              final MutableInteger charp = buffer.mStart;
              charp.set(OCCUPIED);
              if (which[wp + 1] == EMPTY) {
                writeUp();
              } else {
                embedBenzenoid(which, wp + 1);
              }
              charp.set(UNNAMED);
            }
            runNet = runNet.mNext;
            buffer = runNet.mInverse;
            run2 = buffer.mNextNext.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              run2 = run2.mNext;
              if (run2.mEnd.get() == UNNAMED) {
                mLabel[vertex] = 3;
                mEdgeNet[fixVertex] = buffer;
                final MutableInteger charp = buffer.mStart;
                charp.set(OCCUPIED);
                if (which[wp + 1] == EMPTY) {
                  writeUp();
                } else {
                  embedBenzenoid(which, wp + 1);
                }
                charp.set(UNNAMED);
              }
            }
          }
          // else do nothing else
        }
      } else {
        // Labels 1 and 2 possible
        final int jumpVertex = mEmbedFromHere[vertex][1];
        if (jumpVertex >= 0) {
          // First fix the mEdgeNet entry that will stay constant
          final Edge2 runNet = nthEdge(startEdgeNN, mCheckEdges[vertex]);
          final Edge2 buffer = runNet.mInverse;
          int test = 1;
          Edge2 run2 = buffer.mNextNext;
          for (int j = mCheckEdges[jumpVertex]; j != 0; run2 = run2.mNext, --j) {
            if (run2.mEnd.get() != UNNAMED) {
              test = 0;
            }
          }
          if (test != 0) {
            mEdgeNet[jumpVertex] = buffer;
            delete = buffer.mStart;
            delete.set(OCCUPIED);
          } else {
            return;
          }
        }

        // Now the other one
        final int fixVertex = mEmbedFromHere[vertex][0];
        // fixVertex must ALWAYS be embedded after vertex
        Edge2 runNet = startEdgeNN;  // One extra .mNext for the boundary edge (it must AT LEAST be one)
        // Now runNet is correct for the MINIMAL possible mLabel (that is 1)
        Edge2 buffer = runNet.mInverse;
        runNet = runNet.mNext;
        int test = 1;
        Edge2 run2 = buffer.mNextNext;
        for (int j = mCheckEdges[fixVertex]; j != 0; run2 = run2.mNext, --j) {
          if (run2.mEnd.get() != UNNAMED) {
            test = 0;
          }
        }
        if (test != 0) {
          mLabel[vertex] = 1;
          mEdgeNet[fixVertex] = buffer;
          final MutableInteger charp = buffer.mStart;
          charp.set(OCCUPIED);
          if (which[wp + 1] == EMPTY) {
            writeUp();
          } else {
            embedBenzenoid(which, wp + 1);
          }
          charp.set(UNNAMED);
        }
        buffer = runNet.mInverse;
        test = 1;
        run2 = buffer.mNextNext;
        for (int j = mCheckEdges[fixVertex]; j != 0; run2 = run2.mNext, --j) {
          if (run2.mEnd.get() != UNNAMED) {
            test = 0;
          }
        }
        if (test != 0) {
          mLabel[vertex] = 2;
          mEdgeNet[fixVertex] = buffer;
          final MutableInteger charp = buffer.mStart;
          charp.set(OCCUPIED);
          if (which[wp + 1] == EMPTY) {
            writeUp();
          } else {
            embedBenzenoid(which, wp + 1);
          }
          charp.set(UNNAMED);
        }
      }
    }

    if (delete != null) {
      delete.set(UNNAMED);
    }
  }

  private MutableInteger findPlace(final int vertex, final Edge2 start) {
    MutableInteger delete = null;
    final int fixVertex = mEmbedFromHere[vertex][0];
    final Edge2 runNet = nthEdge(start, mCheckEdges[vertex]);
    // To find the place to insert the vertex
    final Edge2 buffer = runNet.mInverse;
    final int poss = mCheckEdges[fixVertex];
    Edge2 run2 = buffer.mNextNext;
    if (poss == 3) {
      if (run2.mEnd.get() == UNNAMED) {
        run2 = run2.mNext;
        if (run2.mEnd.get() == UNNAMED) {
          run2 = run2.mNext;
          if (run2.mEnd.get() == UNNAMED) {
            mEdgeNet[fixVertex] = buffer;
            delete = buffer.mStart;
            delete.set(OCCUPIED);
          } else {
            return null;
          }
        } else {
          return null;
        }
      } else {
        return null;
      }
    } else if (poss == 4) {
      if (run2.mEnd.get() == UNNAMED) {
        run2 = run2.mNext;
        if (run2.mEnd.get() == UNNAMED) {
          run2 = run2.mNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mEdgeNet[fixVertex] = buffer;
              delete = buffer.mStart;
              delete.set(OCCUPIED);
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
      } else {
        return null;
      }
    } else if (poss == 2) {
      if (run2.mEnd.get() == UNNAMED) {
        run2 = run2.mNext;
        if (run2.mEnd.get() == UNNAMED) {
          mEdgeNet[fixVertex] = buffer;
          delete = buffer.mStart;
          delete.set(OCCUPIED);
        } else {
          return null;
        }
      } else {
        return null;
      }
    } else if (poss == 1) {
      if (run2.mEnd.get() == UNNAMED) {
        mEdgeNet[fixVertex] = buffer;
        delete = buffer.mStart;
        delete.set(OCCUPIED);
      } else {
        return null;
      }
    } else if (poss == 0) {
      mEdgeNet[fixVertex] = buffer;
      delete = buffer.mStart;
      delete.set(OCCUPIED);
    }
    return delete;
  }

  /* This function continues the construction of the labels and
     simultaneously embeds the structures into the hexagonal net.
     Whenever it embeds a vertex, it checks whether the edges that are assumed
     to be boundary edges really do not lead to embedded vertices.
     Furthermore all the places that lead to other mComponents than the one
     one comes from, must also be empty, since whenever a vertex is embedded, it
     is FIRST visited.
   */
  private void embedBenzenoidSym(final int[] which, final int wp, final Edge[] starts) {

    final int vertex = which[wp];
    if (vertex == EMPTY) {
      if (canonLabel(starts, mNumberCanNumbOrPres, mNumberCanNumberings, mGlobalInit)) {
        writeUp();
      }
      mGlobalInit = 0;
      return;
    }

    MutableInteger delete = null; // Is there an entry that must be reset to UNNAMED?
    final Edge2 startEdge = mEdgeNet[vertex];
    final Edge2 startEdgeNN = startEdge.mNextNext;

    // OK -- then let's embed the vertex
    if (mNumberOfPossibilities[vertex] == 1) {
      // Some mEdgeNet[] entries have to be initialised
      if (mComponents[vertex] == 1) { // One vertex has to be embedded from here.
        delete = findPlace(vertex, startEdgeNN);
        if (delete == null) {
          return;
        }
        embedBenzenoidSym(which, wp + 1, starts);
      } else if (mComponents[vertex] == 2) {
        final int jumpVertex = mEmbedFromHere[vertex][1];
        if (jumpVertex >= 0) {
          final Edge2 runNet = nthEdge(startEdgeNN, mCheckEdges[vertex]);
          final Edge2 buffer = runNet.mInverse;
          int test = 1;
          Edge2 run2 = buffer.mNextNext;
          for (int j = mCheckEdges[jumpVertex]; j != 0; run2 = run2.mNext, --j) {
            if (run2.mEnd.get() != UNNAMED) {
              test = 0;
            }
          }
          if (test != 0) {
            mEdgeNet[jumpVertex] = buffer;
            delete = buffer.mStart;
            delete.set(OCCUPIED);
          } else {
            return;
          }
        }

        final int fixVertex = mEmbedFromHere[vertex][0];
        // This one is ALWAYS embedded after vertex
        final Edge2 buffer = startEdgeNN.mInverse;
        int test = 1;
        Edge2 run2 = buffer.mNextNext;
        for (int j = mCheckEdges[fixVertex]; j != 0; run2 = run2.mNext, --j) {
          if (run2.mEnd.get() != UNNAMED) {
            test = 0;
          }
        }
        if (test != 0) {
          mEdgeNet[fixVertex] = buffer;
          final MutableInteger charp = buffer.mStart;
          charp.set(OCCUPIED);
          embedBenzenoidSym(which, wp + 1, starts);
          charp.set(UNNAMED);
        }
      } else {
        // (mComponents[vertex]==3) -- the other vertices MUST be embedded later and we know that 3 places must be checked
        Edge2 buffer = startEdgeNN.mInverse;
        int fixVertex = mEmbedFromHere[vertex][0];
        Edge2 run2 = buffer.mNextNext;
        if (run2.mEnd.get() == UNNAMED) {
          run2 = run2.mNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              delete = buffer.mStart;
              mEdgeNet[fixVertex] = buffer;
              delete.set(OCCUPIED);
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }

        fixVertex = mEmbedFromHere[vertex][1];
        buffer = startEdgeNN.mNextNext.mInverse;

        run2 = buffer.mNextNext;
        if (run2.mEnd.get() == UNNAMED) {
          run2 = run2.mNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mEdgeNet[fixVertex] = buffer;
              final MutableInteger charp = buffer.mStart;
              charp.set(OCCUPIED);
              embedBenzenoidSym(which, wp + 1, starts);
              charp.set(UNNAMED);
            }
          }
        }
      }
    } else { // Number of components is always 2
      final int poss = mNumberOfPossibilities[vertex];
      if (poss == 3) {
        final int fixVertex = mEmbedFromHere[vertex][0];
        Edge2 runNet = startEdgeNN;
        if (runNet.mInverse.mNextNext.mNextNext.mEnd.get() != UNNAMED) {
          /* At a position neighbouring both the faces where the hexagon is placed for
             label 1 and 2 a forbidden neighbour was detected, so only 3 is possible */
          runNet = runNet.mNextNext;
          final Edge2 buffer = runNet.mInverse;
          Edge2 run2 = buffer.mNextNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              run2 = run2.mNext;
              if (run2.mEnd.get() == UNNAMED) {
                mLabel[vertex] = 3;
                mEdgeNet[fixVertex] = buffer;
                final MutableInteger charp = buffer.mStart;
                charp.set(OCCUPIED);
                embedBenzenoidSym(which, wp + 1, starts);
                charp.set(UNNAMED);
              }
            }
          }
        } else {
          // This face is OK -- and need not be checked again
          // OK first try label 1
          Edge2 buffer = runNet.mInverse;
          Edge2 run2 = buffer.mNextNext;
          if (run2.mEnd.get() == UNNAMED) {
            run2 = run2.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mLabel[vertex] = 1;
              mEdgeNet[fixVertex] = buffer;
              final MutableInteger charp = buffer.mStart;
              charp.set(OCCUPIED);
              embedBenzenoidSym(which, wp + 1, starts);
              charp.set(UNNAMED);
            }
          }
          runNet = runNet.mNext;
          buffer = runNet.mInverse;
          if (buffer.mNextNext.mNextNext.mEnd.get() == UNNAMED) {
            // Otherwise this time the face between position 2 and 3 made a problem
            buffer = runNet.mInverse;
            run2 = buffer.mNextNext.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              mLabel[vertex] = 2;
              mEdgeNet[fixVertex] = buffer;
              final MutableInteger charp = buffer.mStart;
              charp.set(OCCUPIED);
              embedBenzenoidSym(which, wp + 1, starts);
              charp.set(UNNAMED);
            }
            runNet = runNet.mNext;
            buffer = runNet.mInverse;
            run2 = buffer.mNextNext.mNext;
            if (run2.mEnd.get() == UNNAMED) {
              run2 = run2.mNext;
              if (run2.mEnd.get() == UNNAMED) {
                mLabel[vertex] = 3;
                mEdgeNet[fixVertex] = buffer;
                final MutableInteger charp = buffer.mStart;
                charp.set(OCCUPIED);
                embedBenzenoidSym(which, wp + 1, starts);
                charp.set(UNNAMED);
              }
            }
          }
          // else do nothing else
        }
      } else {
        // Labels 1 and 2 possible
        final int jumpVertex = mEmbedFromHere[vertex][1];
        if (jumpVertex >= 0) {
          // First fix the mEdgeNet entry that will stay constant
          final Edge2 runNet = nthEdge(startEdgeNN, mCheckEdges[vertex]);
          final Edge2 buffer = runNet.mInverse;
          int test = 1;
          Edge2 run2 = buffer.mNextNext;
          for (int j = mCheckEdges[jumpVertex]; j != 0; run2 = run2.mNext, --j) {
            if (run2.mEnd.get() != UNNAMED) {
              test = 0;
            }
          }
          if (test != 0) {
            mEdgeNet[jumpVertex] = buffer;
            delete = buffer.mStart;
            delete.set(OCCUPIED);
          } else {
            return;
          }
        }

        // Now the other one
        final int fixVertex = mEmbedFromHere[vertex][0];
        // fixVertex must ALWAYS be embedded after vertex
        Edge2 runNet = startEdgeNN;  // One extra .mNext for the boundary edge (It must AT LEAST be one)
        // Now runNet is correct for the MINIMAL possible mLabel (that is 1)
        Edge2 buffer = runNet.mInverse;
        runNet = runNet.mNext;
        int test = 1;
        Edge2 run2 = buffer.mNextNext;
        for (int j = mCheckEdges[fixVertex]; j != 0; run2 = run2.mNext, --j) {
          if (run2.mEnd.get() != UNNAMED) {
            test = 0;
          }
        }
        if (test != 0) {
          mLabel[vertex] = 1;
          mEdgeNet[fixVertex] = buffer;
          final MutableInteger charp = buffer.mStart;
          charp.set(OCCUPIED);
          embedBenzenoidSym(which, wp + 1, starts);
          charp.set(UNNAMED);
        }
        buffer = runNet.mInverse;
        test = 1;
        run2 = buffer.mNextNext;
        for (int j = mCheckEdges[fixVertex]; j != 0; run2 = run2.mNext, --j) {
          if (run2.mEnd.get() != UNNAMED) {
            test = 0;
          }
        }
        if (test != 0) {
          mLabel[vertex] = 2;
          mEdgeNet[fixVertex] = buffer;
          final MutableInteger charp = buffer.mStart;
          charp.set(OCCUPIED);
          embedBenzenoidSym(which, wp + 1, starts);
          charp.set(UNNAMED);
        }
      }
    }

    if (delete != null) {
      delete.set(UNNAMED);
    }
  }

  // Gives the order in which the vertices are to be placed
  private final int[] mToPlace = new int[MAXNV + 1];

  /* This function is the beginning of the construction of the labels and
     simultaneously embeds the structures into the hexagonal net (well --
     implemented as its trigonal dual...

     It works as follows:

     Only those hexagons are embedded that have at least one edge in the boundary. The
     aim is to embed them in a way that no two hexagons are embed at the same place
     and that on the outer side of edges that are supposed to be in the boundary,
     there is no hexagon.

     Starting at mBoundaryEdge and running around the boundary in clockwise direction,
     the vertices are numbered according to the time they first occur on the boundary.
     Every vertex except the first (mBoundaryEdge.mStart) is embedded "from" another
     vertex, called its father  -- that is: that vertex that is the first one in
     counterclockwise direction around the boundary.
     So e.g. a vertex with valency 1 is embedded from its unique neighbour -- a vertex
     with only one boundary component is embedded from the unique vertex on the boundary
     in counterclockwise direction, etc. The other way around: A valency 1 vertex (except
     the first one) embeds no other vertex, while a valency 3 vertex with 3 boundary
     mComponents embeds all its neighbours except the one that embedded him.

     The vertices that embed others are written to a list (mToPlace[]) and
     mBoundaryEdge.mStart and mEnd.get() are embedded. Then a recursive routine is started
     that first embeds the vertices that must be embedded from mToPlace[0], then those
     that must be embedded from mToPlace[1]... etc.

     Whenever a vertex v is embedded, it is checked that on the other side of all
     the outer edges there is no other hexagon. Furthermore it is checked that the
     positions where a new vertex must be embedded from v and the positions where
     vertices of another block, that is not yet embedded, but will be embedded from
     here, will be placed, are still free. Note that in case of various possibilities
     to place the vertices, there is no ambiguity -- the positions must be either
     outside edges or will lead to the new component -- in any case one must check all
     those positions that do not belong to the component mC one comes from -- and possibly
     the last position in mC, if it must be embedded from here, but its place
     is fixed by the number of edges going to the


     So if a vertex is connected to its father by a bridge, then it starts a new
     block. From this vertex 1 to 3 edges might lead to the new block, but in all cases
     all the 5 positions different from the bridge to the father are checked to be free.

     ---------------------------------------------------------------------------------
     All the positions checked by vertex F at the time it was embedded are still free
     when F starts to embed its sons.
     ---------------------------------------------------------------------------------
     This means especially that the first face in clockwise direction coming from the
     father need not be checked by the son, since it was OK when embedding the father
     -- and analogously for the last position in case the son is connected by a bridge.
     ---------------------------------------------------------------------------------
     Furthermore it means that the sons can be embedded without checking whether
     their positions have been occupied in the meantime.
     ---------------------------------------------------------------------------------

     This is obvious, if the child S is embedded immediately after the father F.
     If not, after the father was embedded, another face was embedded.
     This can be no problem, if just one face is embedded from the fathers father
     (let's call it FF) (easy to be checked, since there are only very few possible
     positions).

     Note that otherwise it IS POSSIBLE that at the positions checked before F is added,
     vertices are placed. We just claim that in this case, the face has already been
     removed in the backtracking procedure when we return to embed F's sons.

     In case after F is embedded other vertices are embedded, they belong to (one or more)
     different blocks than F that are separated by the cutvertex FF. Since we run around
     the boundary, the whole block (and all that are adjacent to it) is embedded, before
     returning to embed F's sons. The boundary curve of these blocks together with the
     edge(s) along which it sticks to FF is a simple closed curve J in the plane -- that is:
     A Jordan curve. Since F sticks to FF at another edge, local arguments at FF show
     that F must be outside the bounded region of J.

     Now assume that one of these vertices (hexagons) E was embedded neighbouring to F. Since
     it would not have been embedded there if F would be at one of those positions that are
     checked to be free when embedding E, it must be neighbouring E at an edge that is not
     checked -- that is an edge leading to an interior hexagon. So F is an interior hexagon
     of J (a contradiction, so the places must still be free).

     From this it can be deduced that when the structure is embedded, no two vertices are
     placed at the same position and that on the outer side of every boundary edge there
     is a free position -- that is: We have a benzenoid.
  */
  private void constructLabelsBenzenoid(final Edge[] starts) {

    final int[] first = new int[MAXNV];
    final int[] numberOnBoundary = new int[MAXNV + 1]; /* The inverse of mToPlace */
    int toPlaceCounter = 0;

    /* First the order in that the vertices have to be placed is determined. They are
       just taken by running in clockwise direction around the inner dual: */
    final int vertex = mBoundaryEdge.mStart;

    for (int i = 0; i < mMaxNumVertices; ++i) {
      first[i] = 1;
      Edge run = mMap[i];
      do {
        run.mDummy1 = 0;
        run = run.mNext;
      } while (run != mMap[i]);
    }
    numberOnBoundary[vertex] = 0;
    numberOnBoundary[mBoundaryEdge.mEnd] = 1;
    first[vertex] = first[mBoundaryEdge.mEnd] = 0;

    /* First mark the edges with the outer face on the left and determine when a vertex
       occurs first on the boundary: */
    mBoundaryEdge.mDummy1 = 1;
    int j = 2;
    for (Edge run = mBoundaryEdge.mInverse.mNext; run != mBoundaryEdge; run = run.mInverse.mNext) {
      run.mDummy1 = 1; // This tells that the outer face is on the left.
      if (first[run.mEnd] != 0) {
        numberOnBoundary[run.mEnd] = j;
        first[run.mEnd] = 0;
        ++j;
      }
    }

    first[vertex] = 1;

    /* The number of boundary mComponents of vertex must be 1, since mBoundaryEdge starts at the
       last vertex, so the inner dual can not be disconnected, when it is removed */
    mEmbedFromHere[vertex][0] = mBoundaryEdge.mEnd;

    for (Edge run = mBoundaryEdge.mInverse.mNext; run != mBoundaryEdge; run = run.mInverse.mNext) {
      j = run.mStart;
      if (first[j] == 0) {
        // This means that it wasn't visited in this second run before
        // A vertex must be added to the mToPlace list only if some vertices have to be embedded from there
        first[j] = 1;
        if (mComponents[j] == 2) {
          // This means that it wasn't visited in this second run before
          mToPlace[toPlaceCounter++] = j;
          mEmbedFromHere[j][0] = run.mEnd;
          int i = 0;
          Edge run2 = run.mNext;
          while (run2.mDummy1 != 1) {
            run2 = run2.mNext;
            ++i;
          }
          mJump[j] = i;
          if (mDegree[j] - mJump[j] == 2) {
            mCheckEdges[j] = 3; // comes from a bridge
          } else {
            mCheckEdges[j] = 6 - mDegree[j] + mJump[j];
          }
          if (numberOnBoundary[run2.mEnd] > numberOnBoundary[j]) {
            mEmbedFromHere[j][1] = run2.mEnd;
            ++mCheckEdges[j]; // The place where the second vertex must be placed, must/may also be checked
          } else {
            mEmbedFromHere[j][1] = -1;
          }
        } else if (mComponents[j] == 3) {
          mCheckEdges[j] = 3;
          mEmbedFromHere[j][0] = run.mEnd;
          mEmbedFromHere[j][1] = run.mNext.mEnd;
          mToPlace[toPlaceCounter++] = j;
        } else {
          // 1 component
          if (mDegree[j] == 1) {
            mCheckEdges[j] = 3;
          } else {
            mCheckEdges[j] = 5 - mDegree[j];
            if (numberOnBoundary[run.mEnd] > numberOnBoundary[j]) {
              mEmbedFromHere[j][0] = run.mEnd;
              ++mCheckEdges[j];
              mToPlace[toPlaceCounter++] = j;
            }
          }
        }
      }
    }

    mToPlace[toPlaceCounter] = EMPTY; // As a mark that there isn't more to embed

    // Now really embed the first vertex:
    mEdgeNet[mBoundaryEdge.mEnd] = mStartNet.mInverse;
    mEdgeNet[vertex] = null;
    mStartNet.mStart.set(OCCUPIED);
    mStartNet.mEnd.set(OCCUPIED);

    if (starts != null) {
      embedBenzenoidSym(mToPlace, 0, starts);
    } else {
      embedBenzenoid(mToPlace, 0);
    }

    mStartNet.mEnd.set(UNNAMED);
    mStartNet.mStart = mStartNet.mEnd;
  }

  private final Edge[] mStartsBenz = new Edge[MAXAUTS];

  private void nextStepBenzenoids() {

//    if (mNumberCanNumberings == 1) {
//      ++mTrivSkeletons;
//    }
    //++mNumberOfSkeletons;

    //if (just_skeletons) return;

//    if (mDetailed)
//    {
//      catacondensed= (mNumEdges==catanumber);
//      mC=Cconstant-(mNumEdges>>1);
//      mH=mC-CHdifference;;
//    }

    mGlobalInit = 1; // Next time the canonLabel routine is called, it must be initialised for a new skeleton

    // Compute the positions where various labels are possible
    long numLabelsBenz = 1;
    for (int iBenz = 0; iBenz < mNumVertices; iBenz++) {
      final int dummyBenz = mPossibleLabels[mDegree[iBenz]][mComponents[iBenz]];
      mNumberOfPossibilities[iBenz] = dummyBenz;
      if (dummyBenz == 1) {
        mLabel[iBenz] = 0;
      } else {
        numLabelsBenz *= dummyBenz;
      }
    }

    //mNumberOfLabellings += numLabelsBenz;
    if (mNumberCanNumberings == 1 || numLabelsBenz == 1) {
      constructLabelsBenzenoid(null);
    } else { /* Look for the orbit of "mBoundaryEdge": */
      int iBenz;
      for (iBenz = 0; mCanNumberings[0][iBenz] != mBoundaryEdge; iBenz++) {
      }
      /* write them all to starts: */
      for (int dummyBenz = 0; dummyBenz < mNumberCanNumberings; dummyBenz++) {
        mStartsBenz[dummyBenz] = mCanNumberings[dummyBenz][iBenz];
      }
      constructLabelsBenzenoid(mStartsBenz);
    }

  }

  private static Edge[] initEdges(final int size) {
    final Edge[] res = new Edge[size];
    for (int k = 0; k < size; ++k) {
      res[k] = new Edge();
    }
    return res;
  }

  /* Initialises the mNewVertex[][] field, planMap, n */
  private void init() {
    // first the mNewVertex field
    for (int i = 2; i < MAXNV; ++i) { // vertices 0 and 1 are never replaced
      for (int j = 1; j <= 5; ++j) {
        final Edge[] list = initEdges(j);
        mNewVertex[i][j] = list[0];
        final Edge[] invers = initEdges(j);
        for (int k = 0; k < j; k++) {
          list[k].mStart = i;
          invers[k].mEnd = i;
          list[k].mInverse = invers[k];
          invers[k].mInverse = list[k];
          if (k == 0) {
            list[k].mPrev = list[j - 1];
          } else {
            list[k].mPrev = list[k - 1];
          }
          if (k == j - 1) {
            list[k].mNext = list[0];
          } else {
            list[k].mNext = list[k + 1];
          }
        }
      }
    }

    mNumEdges = 2;
    mNumVertices = 2;

    mMap[0] = new Edge();
    mMap[1] = new Edge();

    mMap[0].mStart = 0;
    mMap[0].mEnd = 1;
    mMap[0].mPrev = mMap[0].mNext = mMap[0];
    mMap[0].mInverse = mMap[1];

    mMap[1].mStart = 1;
    mMap[1].mEnd = 0;
    mMap[1].mPrev = mMap[1].mNext = mMap[1];
    mMap[1].mInverse = mMap[0];

    mDegree[0] = 1;
    mDegree[1] = 1;

    mComponents[0] = 1;
    mComponents[1] = 1;

    mBoundaryEdge = mMap[1];
    mBoundaryEdges[1] = mMap[1];

    canon(mDegree, mCanNumberings);

    mPossibleLabels[1][1] = 1; // just one possibility
    mPossibleLabels[2][1] = 1;
    mPossibleLabels[2][2] = 3;
    mPossibleLabels[3][1] = 1;
    mPossibleLabels[3][2] = 2;
    mPossibleLabels[3][3] = 1;
    mPossibleLabels[4][1] = 1;
    mPossibleLabels[4][2] = 1;
    mPossibleLabels[5][1] = 1;
    mPossibleLabels[6][0] = 1;
  }


  /* Adds a new vertex starting at mStart.mStart and in mPrev direction from
     mStart and connected also to the mNext valency-1 vertices in clockwise orientation
     along the boundary. */
  private void addVertex(Edge start, final int valency) {
    int vertex;

    Edge newEdge = mNewVertex[mNumVertices][valency];
    mMap[mNumVertices] = newEdge;
    mBoundaryEdge = newEdge.mNext;
    mBoundaryEdges[mNumVertices] = mBoundaryEdge;
    newEdge = newEdge.mInverse;

    switch (valency) {
      case 1:
        vertex = start.mStart;
        newEdge.mInverse.mEnd = vertex;
        newEdge.mStart = vertex;
        newEdge.mPrev = start.mPrev;
        newEdge.mNext = start;
        start.mPrev = newEdge;
        newEdge.mPrev.mNext = newEdge;
        ++mDegree[vertex];
        ++mComponents[vertex];
        break;
      case 2:
        vertex = start.mStart;
        newEdge.mStart = newEdge.mInverse.mEnd = vertex;
        newEdge.mPrev = start.mPrev;
        newEdge.mNext = start;
        newEdge.mPrev.mNext = start.mPrev = newEdge;
        ++mDegree[vertex]; // the number of components does not change
        // Next vertex
        start = start.mInverse.mNext;
        newEdge = newEdge.mInverse.mPrev.mInverse;
        vertex = start.mStart;
        newEdge.mStart = newEdge.mInverse.mEnd = vertex;
        newEdge.mPrev = start.mPrev;
        newEdge.mNext = start;
        newEdge.mPrev.mNext = start.mPrev = newEdge;
        ++mDegree[vertex]; // the number of components does not change
        break;
      case 3:
        vertex = start.mStart;
        newEdge.mStart = newEdge.mInverse.mEnd = vertex;
        newEdge.mPrev = start.mPrev;
        newEdge.mNext = start;
        newEdge.mPrev.mNext = start.mPrev = newEdge;
        ++mDegree[vertex]; // the number of components does not change
        // Next vertex
        start = start.mInverse.mNext;
        newEdge = newEdge.mInverse.mPrev.mInverse;
        vertex = start.mStart;
        newEdge.mStart = newEdge.mInverse.mEnd = vertex;
        newEdge.mPrev = start.mPrev;
        newEdge.mNext = start;
        newEdge.mPrev.mNext = start.mPrev = newEdge;
        ++mDegree[vertex];
        --mComponents[vertex]; // the number of components of the middle vertex is decreased by one
        // Next vertex
        start = start.mInverse.mNext;
        newEdge = newEdge.mInverse.mPrev.mInverse;
        vertex = start.mStart;
        newEdge.mStart = newEdge.mInverse.mEnd = vertex;
        newEdge.mPrev = start.mPrev;
        newEdge.mNext = start;
        newEdge.mPrev.mNext = start.mPrev = newEdge;
        ++mDegree[vertex]; // the number of components does not change
        break;
      default:
        throw new RuntimeException("Error in addVertex -- Trying to add a vertex of valency " + valency);
    }

    mDegree[mNumVertices] = valency;
    mComponents[mNumVertices++] = 1;
    mNumEdges += 2 * valency;
  }

  /* deletes the last vertex (number mNumVertices-1) from mMap and repairs the relevant variables */
  private void deleteVertex() {
    mNumEdges -= 2 * mDegree[--mNumVertices];
    Edge delete = mBoundaryEdge.mInverse;
    mBoundaryEdge = mBoundaryEdges[mNumVertices - 1];

    switch (mDegree[mNumVertices]) {
      case 1:
        delete.mPrev.mNext = delete.mNext;
        delete.mNext.mPrev = delete.mPrev;
        --mDegree[delete.mStart];
        --mComponents[delete.mStart];
        break;
      case 2:
        delete.mPrev.mNext = delete.mNext;
        delete.mNext.mPrev = delete.mPrev;
        mDegree[delete.mStart]--; // number of components doesn't change
        delete = delete.mInverse.mNext.mInverse;
        delete.mPrev.mNext = delete.mNext;
        delete.mNext.mPrev = delete.mPrev;
        --mDegree[delete.mStart]; // number of components doesn't change
        break;
      case 3:
        delete.mPrev.mNext = delete.mNext;
        delete.mNext.mPrev = delete.mPrev;
        --mDegree[delete.mStart]; // number of components doesn't change
        delete = delete.mInverse.mNext.mInverse;
        delete.mPrev.mNext = delete.mNext;
        delete.mNext.mPrev = delete.mPrev;
        --mDegree[delete.mStart];
        ++mComponents[delete.mStart]; // number of components increases by one
        delete = delete.mInverse.mNext.mInverse;
        delete.mPrev.mNext = delete.mNext;
        delete.mNext.mPrev = delete.mPrev;
        --mDegree[delete.mStart]; // number of components doesn't change
        break;
      default:
        throw new RuntimeException("Error in deleteVertex -- Trying to delete a vertex of valency " + mDegree[mNumVertices]);
    }
  }


  /* Tests whether starting from a given edge and constructing the code in
     ".mNext" direction, an automorphism or even a better representation
     can be found. Returns 0 for failure, 1 for an automorphism and 2 for
     a better representation.  This function exits as soon as a better
     representation is found. A function that computes and returns the
     complete better representation can work pretty similar.*/
  private int testCanon(final Edge givenEdge, final int[] representation, final int[] colour) {
    // startEdge[i] is the starting edge for exploring the vertex with the number i + 1
    final Edge[] startEdge = new Edge[MAXNV];
    final int[] number = new int[mNumVertices];
    /* The new numbers of the vertices, starting
       at 1 in order to have "0" as a possibility to
       mark ends of lists and not yet given numbers */
    int lastNumber;
    int rep = 0;

    number[givenEdge.mStart] = 1;

    if (givenEdge.mStart != givenEdge.mEnd) { // no loop start
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    /* A representation is a clockwise ordering of all neighbours ended with a 0.
       The neighbours are numbered in the order that they are reached by the BFS
       procedure. In case a vertex is reached for the first time, not the (new)
       number of the vertex is listed, but its colour. When the list around a
       vertex is finished, it is ended with a 0. Since the colours can be
       distinguished from the vertices (requirement for the colour function), the
       adjacency list can be reconstructed: Every time a colour is listed, its
       number would be the smallest number not given yet.
       Since the edges when a vertex is reached for the first time are remembered,
       for these edges we in fact have more than just the vertex information -- for
       these edges we also have the exact information which edge occurs in the
       cyclic order. This makes the routine work also for double edges.

       Since every representation starts with the colour of vertex 2, which is
       the same colour all the time, we do not have to store that.

       In case of a loop as the starting point, the colour of 1 is omitted.
       Nevertheless also in this case it cannot be mixed up with a non-loop
       starting point, since the number of times a colour occurs is larger
       for loop starters than for non-loop starters.

       Every first entry in a new clockwise ordering (the starting point of the
       edge it was numbered from is determined by the entries before (the first
       time it occurs in the list to be exact), so this is not given either.
       The K4 could be denoted  c3 c4 0 4 3 0 2 3 0 3 2 0 if ci is the colour
       of vertex i.  Note that the colour of vertex 1 is -- by definition --
       always the smallest one */
    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // this loop marks all edges around temp.origin.
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (vertex > representation[rep]) {
          return 0;
        }
        if (vertex < representation[rep]) {
          return 2;
        }
        ++rep;
      }
      // Check whether representation[] is also at the end of a cyclic list
      if (representation[rep] != 0) {
        return 2;
      }
      ++rep;
      // Next vertex to explore:
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= mNumVertices) {
      // Now we know that all numbers have been given
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // this loop marks all edges around temp.origin.
        final int vertex = number[run.mEnd];
        if (vertex > representation[rep]) {
          return 0;
        }
        if (vertex < representation[rep]) {
          return 2;
        }
        ++rep;
      }
      // Check whether representation[] is also at the end of a cyclic list
      if (representation[rep] != 0) {
        return 2;
      }
      ++rep;
      // Next vertex to explore:
      temp = startEdge[actualNumber++];
    }

    return 1;
  }

  /* Tests whether starting from a given edge and constructing the code in
     ".mPrev" direction, an automorphism or even a better representation can
     be found. Comments see testCanon -- it is exactly the same except for
     the orientation */
  private int testCanonMirror(final Edge givenEdge, final int[] representation, final int[] colour) {
    final Edge[] startEdge = new Edge[MAXNV];
    final int[] number = new int[mNumVertices];
    int lastNumber;
    int rep = 0;

    number[givenEdge.mStart] = 1;

    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (vertex > representation[rep]) {
          return 0;
        }
        if (vertex < representation[rep]) {
          return 2;
        }
        ++rep;
      }
      if (representation[rep] != 0) {
        return 2;
      }
      ++rep;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= mNumVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        final int vertex = number[run.mEnd];
        if (vertex > representation[rep]) {
          return 0;
        }
        if (vertex < representation[rep]) {
          return 2;
        }
        ++rep;
      }
      if (representation[rep] != 0) {
        return 2;
      }
      ++rep;
      temp = startEdge[actualNumber++];
    }
    return 1;
  }

  /* Tests whether starting from a given edge and constructing the code in
     ".mNext" direction, an automorphism or even a better representation can
     be found. A better representation will be completely constructed and
     returned in "representation".  It works pretty similar to testCanon except
     for obviously necessary changes, so for extensive comments see testCanon */
  private void testCanonFirstInit(final Edge givenEdge, final int[] representation, final int[] colour) {
    assert givenEdge != null;
    int vertex;
    final Edge[] startEdge = new Edge[MAXNV];
    final int[] number = new int[mNumVertices];
    int lastNumber;
    int rep = 0;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          representation[rep] = colour[vertex];
        } else {
          representation[rep] = number[vertex];
        }
        ++rep;
      }
      representation[rep++] = 0;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= mNumVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        representation[rep++] = number[run.mEnd];
      }
      representation[rep++] = 0;
      temp = startEdge[actualNumber++];
    }
  }

  /* Tests whether starting from a given edge and constructing the code in
     ".mNext" direction, an automorphism or even a better representation can
     be found. A better representation will be completely constructed and
     returned in "representation".  It works pretty similar to testCanon except
     for obviously necessary changes, so for extensive comments see testCanon */
  private int testCanonInit(final Edge givenEdge, final int[] representation, final int[] colour) {

    final Edge[] startEdge = new Edge[MAXNV];
    final int[] number = new int[mNumVertices];
    boolean better = false; // is the representation already better?
    int lastNumber;
    int rep = 0;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (better) {
          representation[rep] = vertex;
        } else {
          if (vertex > representation[rep]) {
            return 0;
          } else if (vertex < representation[rep]) {
            better = true;
            representation[rep] = vertex;
          }
        }
        ++rep;
      }
      if (representation[rep] != 0) {
        better = true;
        representation[rep] = 0;
      }
      ++rep;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= mNumVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        final int vertex = number[run.mEnd];
        if (better) {
          representation[rep] = vertex;
        } else {
          if (vertex > representation[rep]) {
            return 0;
          }
          if (vertex < representation[rep]) {
            better = true;
            representation[rep] = vertex;
          }
        }
        ++rep;
      }
      if (representation[rep] != 0) {
        better = true;
        representation[rep] = 0;
      }
      ++rep;
      temp = startEdge[actualNumber++];
    }

    if (better) {
      return 2;
    }
    return 1;
  }


  /* Tests whether starting from a given edge and constructing the code in
     ".mPrev" direction, an automorphism or even a better representation can
     be found. A better representation will be completely constructed and
     returned in "representation".  It works pretty similar to testCanon except
     for obviously necessary changes, so for extensive comments see testCanon */
  private int testCanonMirrorInit(final Edge givenEdge, final int[] representation, final int[] colour) {
    final Edge[] startEdge = new Edge[MAXNV];
    final int[] number = new int[mNumVertices];
    boolean better = false; /* is the representation already better ? */
    int lastNumber;
    int rep = 0;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (better) {
          representation[rep] = vertex;
        } else {
          if (vertex > representation[rep]) {
            return 0;
          } else if (vertex < representation[rep]) {
            better = true;
            representation[rep] = vertex;
          }
        }
        ++rep;
      }
      if (representation[rep] != 0) {
        better = true;
        representation[rep] = 0;
      }
      ++rep;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= mNumVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        final int vertex = number[run.mEnd];
        if (better) {
          representation[rep] = vertex;
        } else {
          if (vertex > representation[rep]) {
            return 0;
          }
          if (vertex < representation[rep]) {
            better = true;
            representation[rep] = vertex;
          }
        }
        ++rep;
      }
      if (representation[rep] != 0) {
        better = true;
        representation[rep] = 0;
      }
      ++rep;
      temp = startEdge[actualNumber++];
    }

    if (better) {
      return 2;
    }
    return 1;
  }

  /* Starts at givenEdge and writes the edges in the well defined order
     into the list.  Works like testCanon. Look there for comments. */
  private void constructNumb(final Edge givenEdge, final Edge[] numbering) {
    final Edge[] startEdge = new Edge[MAXNV];
    int lastNumber;

    mMarks.resetMarksVertex();

    int tail = 0;
    final int limit = mNumEdges - 1;

    mMarks.markVertex(givenEdge.mStart);
    if (givenEdge.mStart != givenEdge.mEnd) {
      mMarks.markVertex(givenEdge.mEnd);
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = numbering[tail] = givenEdge;

    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // Marks all edges around temp.origin.
        final int vertex = run.mEnd;
        if (!mMarks.isMarkedVertex(vertex)) {
          startEdge[lastNumber++] = run.mInverse;
          mMarks.markVertex(vertex);
        }
        numbering[++tail] = run;
      }
      if (tail != limit) {
        numbering[++tail] = temp = startEdge[actualNumber++];
      }
    }

    while (tail != limit) {
      // Now we know that all numbers have been given
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // Marks all edges around temp.origin.
        numbering[++tail] = run;
      }
      if (tail != limit) {
        // Next vertex to explore
        temp = startEdge[actualNumber++];
        numbering[++tail] = temp;
      }
    }
  }


  /* Starts at givenEdge and writes the edges in the well defined order
     into the list.  Works like testCanon. Look there for comments.  */
  private void constructNumbMirror(final Edge givenEdge, final Edge[] numbering) {
    final Edge[] startEdge = new Edge[MAXNV];
    int lastNumber;

    mMarks.resetMarksVertex();

    int tail = 0;  // The first entry of the numbering list
    final int limit = mNumEdges - 1;  // Last valid entry of the numbering list

    mMarks.markVertex(givenEdge.mStart);
    if (givenEdge.mStart != givenEdge.mEnd) {
      mMarks.markVertex(givenEdge.mEnd);
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;
    numbering[tail] = givenEdge;

    while (lastNumber < mNumVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        // Marks all edges around temp.origin.
        final int vertex = run.mEnd;
        if (!mMarks.isMarkedVertex(vertex)) {
          startEdge[lastNumber++] = run.mInverse;
          mMarks.markVertex(vertex);
        }
        numbering[++tail] = run;
      }
      if (tail != limit) {
        temp = startEdge[actualNumber++];
        numbering[++tail] = temp;
      }
    }

    while (tail != limit) {
      // Now we know that all numbers have been given
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        // This loop marks all edges around temp.origin.
        numbering[++tail] = run;
      }
      if (tail != limit) {
        // Next vertex to explore
        temp = startEdge[actualNumber++];
        numbering[++tail] = temp;
      }
    }
  }

  /* Checks whether the last vertex (number: mNumVertices-1) is canonical or not.
     Returns 1 if yes, 0 if not. One of the criteria a canonical vertex
     must fulfill, is that its colour is minimal.
     A possible starting edge for the construction of a representation is
     one with lexicographically minimal colour pair (mStart,INT_MAX-mEnd).
     In mCanNumberings[][] the canonical numberings are stored as sequences
     of oriented edges.  For every 0 <= i,j < *num_can_numberings and every
     0 <= k < mNumEdges the edges mCanNumberings[i][k] and mCanNumberings[j][k] can
     be mapped onto each other by an automorphism. The first
     *num_can_numberings_or_pres numberings are orientation preserving while
     the rest is orientation reversing.

     In case of only 1 automorphism, in mCanNumberings[0][0] the "canonical"
     edge is given.  It is one edge emanating at the canonical vertex. The
     rest of the numbering is not given.

     In case of nontrivial automorphisms, can[0] starts with a list of edges
     adjacent to mNumVertices-1. In case of an orientation preserving numbering the deges
     are listed in .mNext direction, otherwise in .mPrev direction.

     Works OK if at least one vertex has valence >= 3. Otherwise some numberings
     are computed twice, since changing the orientation (the cyclic order around
     each vertex) doesn't change anything. For this case a special routine can
     be called that is essentially just canon() with the mirror images deleted.

     For the helicenes program, we NEED that in this case the automorphisms are
     listed as orientation preserving AND orientation reversing, so this routine
     is not called.

     For the helicenes program there is exactly one face that is not a triangle (in case
     mNumVertices>3 -- otherwise the vertex with minimum colour -- which is minimum mDegree in this
     case -- can always be deleted). This face is chosen as the outer face. A vertex
     lying in the outer face can not be deleted in case the graph breaks in two (or more)
     parts if this is done. This is exactly the case if it occurs in the boundary more than
     once. The last vertex (mNumVertices-1) can always be deleted by construction -- it was just added !
     Vertices with valency one can also always be deleted, so in case the last vertex has
     valency one (and therefore all possibly canonical ones) nothing has to be checked.

     Since interior vertices always have valency 6, there are always some with smaller valency,
     so we do not have to care for only boundary vertices being regarded canonical.
     Nevertheless by forbidding vertices that do not occur in the boundary, nothing is lost.
  */
  private int canon(final int[] colourPrev, final Edge[][] canNumberings) {

    final Edge[] startListLast = new Edge[5];
    final Edge[] startList = new Edge[5 * MAXNV];
    final Edge[] numblist = new Edge[MAXE];
    final Edge[] numbListMirror = new Edge[MAXE]; // lists of edges where  starting gives a canonical representation
    final int[] colour = new int[MAXNV];
    final int[] representation = new int[2 * MAXE + MAXNV];
    int numbs = 1;
    int numbsMirror = 0;

    /* commented out for helicenes */
//    for (i=0; (mDegree[i]<3) && (i<mNumVertices); ++i);
//    if (i==mNumVertices)  did not find a vertex with mDegree >=3
//    return(special(colour, mCanNumberings,num_can_numberings,num_can_numberings_or_pres));

    for (int i = 0; i < mNumVertices; ++i) {
      colour[i] = colourPrev[i] + MAXNV;
    }

    final int lastVertex = mNumVertices - 1;
    final int minStart = colour[lastVertex];

    // Determine the smallest possible end for the vertex "lastVertex"
    int listLengthLast = 1;
    final Edge end = mMap[lastVertex];
    startListLast[0] = end;
    int maxEnd = colour[end.mEnd];

    for (Edge run = end.mNext; run != end; run = run.mNext) {
      if (colour[run.mEnd] > maxEnd) {
        startListLast[0] = run;
        listLengthLast = 1;
        maxEnd = colour[run.mEnd];
      } else if (colour[run.mEnd] == maxEnd) {
        startListLast[listLengthLast++] = run;
      }
    }

    /* Now we know the pair that SHOULD be minimal and we can determine a list
       of all edges with this colour pair. If a new pair is found that is even
       smaller, we can return 0 at once */
    int listLength = 0;

    for (int i = 0; i < lastVertex; ++i) {
      if (mComponents[i] == 1) { /* Just for helicenes: must occur only once in the boundary */
        if (colour[i] < minStart) {
          return 0;
        }
        if (colour[i] == minStart) {
          final Edge end2 = mMap[i];
          Edge run = end2;
          do {
            if (colour[run.mEnd] > maxEnd) {
              return 0;
            }
            if (colour[run.mEnd] == maxEnd) {
              startList[listLength++] = run;
            }
            run = run.mNext;
          } while (run != end2);
        }
      }
    }

    /* OK -- so there is no smaller pair and now we have to determine the
       smallest representation around vertex "lastVertex": */
    testCanonFirstInit(startListLast[0], representation, colour);
    numblist[0] = startListLast[0];
    int test = testCanonMirrorInit(startListLast[0], representation, colour);
    if (test == 1) {
      numbsMirror = 1;
      numbListMirror[0] = startListLast[0];
    } else if (test == 2) {
      numbsMirror = 1;
      numbs = 0;
      numbListMirror[0] = startListLast[0];
    }

    for (int i = 1; i < listLengthLast; ++i) {
      test = testCanonInit(startListLast[i], representation, colour);
      if (test == 1) {
        numblist[numbs++] = startListLast[i];
      } else if (test == 2) {
        numbsMirror = 0;
        numbs = 1;
        numblist[0] = startListLast[i];
      }
      test = testCanonMirrorInit(startListLast[i],
        representation, colour);
      if (test == 1) {
        numbListMirror[numbsMirror++] = startListLast[i];
      } else if (test == 2) {
        numbsMirror = 1;
        numbs = 0;
        numbListMirror[0] = startListLast[i];
      }
    }

    /* Now we know the best representation we can obtain starting at lastVertex.
       Now we will check all the others. We can return 0 at once if we find a
       better one */
    for (int i = 0; i < listLength; ++i) {
      test = testCanon(startList[i], representation, colour);
      if (test == 1) {
        numblist[numbs++] = startList[i];
      } else if (test == 2) {
        return 0;
      }
      test = testCanonMirror(startList[i], representation, colour);
      if (test == 1) {
        numbListMirror[numbsMirror++] = startList[i];
      } else if (test == 2) {
        return 0;
      }
    }

    mNumberCanNumbOrPres = numbs;
    mNumberCanNumberings = numbs + numbsMirror;
    if (mNumberCanNumberings > 1) {
      for (int i = 0; i < numbs; ++i) {
        constructNumb(numblist[i], canNumberings[i]);
      }
      for (int i = 0, j = numbs; i < numbsMirror; ++i, ++j) {
        constructNumbMirror(numbListMirror[i],
          canNumberings[j]);
      }
    } else {
      if (numbs != 0) {
        canNumberings[0][0] = numblist[0];
      } else {
        canNumberings[0][0] = numbListMirror[0];
      }
    }

    /* In case of maxDegree<3 numbs and numbsMirror are not correct. In case of a path the mGroupName
       must be recomputed depending on the labels anyway, so only the case of a cycle -- to be exact:
       of a 3-cycle must be detected: */
    if (mDetailed && mNumEdges == 6 && mNumVertices == 3) {
      numbs = numbsMirror = 3;
    }

    if (numbs < numbsMirror) {
      final int t = numbs;
      numbs = numbsMirror;
      numbsMirror = t;
    }
    if (numbs == 1 && numbsMirror == 0) {
      mGroupName = GroupName.CS;
    } else if (numbs == 1 && numbsMirror == 1) {
      mGroupName = GroupName.C2V;
    } else if (numbs == 2 && numbsMirror == 0) {
      mGroupName = GroupName.C2H;
    } else if (numbs == 2 && numbsMirror == 2) {
      mGroupName = GroupName.D2H;
    } else if (numbs == 3 && numbsMirror == 0) {
      mGroupName = GroupName.C3H;
    } else if (numbs == 3 && numbsMirror == 3) {
      mGroupName = GroupName.D3H;
    } else if (numbs == 6 && numbsMirror == 0) {
      mGroupName = GroupName.C6H;
    } else if (numbs == 6 && numbsMirror == 6) {
      mGroupName = GroupName.D6H;
    } else {
      throw new RuntimeException("Problem -- didn't recognize mGroupName");
    }

    return 1;
  }


  /* Deletes isomorphic positions from the list by using the entries of
   mCanNumberings[][], mNumberCanNumberings and mNumberCanNumbOrPres.
   The function is only called in case of more than one automorphism. */
  void computeOrbits(final Edge[] starts, final int[][] howMuch) {

    final Edge[] newstarts = new Edge[3 * MAXNV]; // The new starts
    final int[][] newHowMuch = new int[3 * MAXNV][6]; // The new numbers how far one must go
    int numberStarts = 0; // Number of (new) starts

    for (int i = 0; i < mNumVertices; ++i) {
      Edge run = mMap[i];
      for (int j = mDegree[i]; j > 0; --j) {
        run.mDummy1 = -1;
        run = run.mNext;
      }
    }

    for (int i = 0; starts[i] != null; ++i) {
      starts[i].mDummy1 = i;
    }
    /* In mDummy1 the position in the starts-list is noted */

    /* for every 0<=j<mNumEdges, the set of edges
       { mCanNumberings[i][j] | 0<=i<mNumberCanNumberings }
       is a set of equivalent edges in which every edge in the class of edges equivalent
       occurs EXACTLY once. In case there are orientation preserving numberings, the
       first mNumberCanNumbOrPres ones are equivalent to the first one by an orientation
       preserving automorphism, the rest by an orientation reversing one. In case of no
       orientation preserving numberings, all automorphisms are orientation preserving.

       In { mCanNumberings[0][i] | 0<=i<mNumEdges } every edge occurs once.

       So what we do is the following: We run through this list and take the
       first edge that can serve as a mStart (mDummy1>=0). All other starting edges are
       deleted from the list. Furthermore mDummy1 is set to -2 to note that this set
       has been checked and may not be checked when it occurs a second time.

       The mDummy2 entry of the edges is initialised to the position in the new
       list in case the edge occurs there as a starting position and to -1 else.
    */
    final int limit = mNumberCanNumbOrPres != 0 ? mNumberCanNumbOrPres : mNumberCanNumberings;

    /* In case of no orientation preserving canonical numberings, all automorphisms
       mapping the first numbering onto the others are orienatation preserving --
       otherwise only the first mNumberCanNumbOrPres ones */
    for (int i = 0; i < mNumEdges; ++i) {
      if (mCanNumberings[0][i].mDummy1 >= 0) { // New set
        Edge run = mCanNumberings[0][i];
        newstarts[numberStarts] = run;
        final int puffer = run.mDummy1;
        int k;
        for (k = 0; howMuch[puffer][k] != 0; ++k) {
          newHowMuch[numberStarts][k] = howMuch[puffer][k];
        }
        newHowMuch[numberStarts][k] = 0;
        run.mDummy2 = numberStarts++; // Position in new list
        for (int j = 1; j < limit; ++j) {
          run = mCanNumberings[j][i];
          run.mDummy1 = -2;
          run.mDummy2 = -2;
        }
      }
    }

    /* Now we have to deal with those automorphisms that reverse the orientation.
       If edge1 is mapped onto edge2 by such an automorphism, then the position
       (edge1, x) with x the valency of the vertex to be added makes the following
       position superfluous: Go from edge2 x-1 entries in counterclockwise direction
       around the boundary and take the inverse edge e2'. The position (e2',x) is
       equivalent to (edge1, x) and will be deleted (if it hasn't been deleted before).
       The first time a position occurs all equivalent ones are deleted. Since always
       one of the set of equivalent positions is kept (being careful with positions
       that are stabilized under the automorphism), we do not delete too much and
       since for every position whose mirror image is equivalent to some other (not
       reflected) position this mirror edge occurs in the list of equivalent edges
       of the relevant starting edge, we delete every duplicate. */
    if (mNumberCanNumbOrPres != 0 && mNumberCanNumberings > mNumberCanNumbOrPres) {
      for (int i = 0; i < mNumEdges; ++i) {
        if (mCanNumberings[0][i].mDummy1 >= 0) { // The set contains a starting edge
          final Edge run2 = mCanNumberings[0][i];
          final int puffer = run2.mDummy2;
          int j;
          for (j = mNumberCanNumbOrPres; j < mNumberCanNumberings; ++j) {
            final Edge remember = mCanNumberings[j][i].mNext;
            // This is the edge where adding one vertex would give the same result
            int pufferPos;
            for (int k = 0; (pufferPos = newHowMuch[puffer][k]) != 0; ++k) {
              Edge run = remember;
              for (int l = 1; l < pufferPos; ++l) {
                run = run.mPrev.mInverse;
              }
              if (run.mDummy2 >= 0 && run != run2) { // Is it in the new list and not an invariant position ?
                final int puffer2 = run.mDummy2;
                int l;
                for (l = 0; newHowMuch[puffer2][l] != pufferPos && newHowMuch[puffer2][l] != 0; ++l) {
                }
                // Now we found the entry that must be deleted or found it isn't there any more
                for (; newHowMuch[puffer2][l] != 0; l++) {
                  newHowMuch[puffer2][l] = newHowMuch[puffer2][l + 1];
                }
                // It is deleted so that no gaps occur and still a 0 ends the lists
              }
            }
          }
        }
      }
    }

    // Now replace the starts and how much fields
    int j = 0;
    for (int i = 0; i < numberStarts; ++i) {
      if (newHowMuch[i][0] != 0) { // not all positions were deleted
        starts[j] = newstarts[i];
        int k;
        for (k = 0; newHowMuch[i][k] != 0; ++k) {
          howMuch[j][k] = newHowMuch[i][k];
        }
        howMuch[j++][k] = 0;
      }
    }
    starts[j] = null;
  }

  /* Is it a possible midpoint, mStart- and endpoint or is it even possible to add a valency one vertex */
  private void computePositions(final Edge[] starts, final int[][] howMuch) {

    final int[] midpoint = new int[MAXNV];
    final int[] endpoint = new int[MAXNV];
    final int[] oneAdd = new int[MAXNV];
    int ones = 0; // the number of vertices with valency one/two vertices that can be deleted
    int twos = 0;

    for (int vertex = 0; vertex < mNumVertices; vertex++) {
      final int val = mDegree[vertex];
      final int comp = mComponents[vertex];
      if (val < 6) {
        final int sum = val + comp;
        endpoint[vertex] = sum < 6 ? 1 : 0;
        oneAdd[vertex] = sum < 5 ? 1 : 0;
        midpoint[vertex] = comp >= 2 || val == 5 ? 1 : 0;
        if (val == 1) {
          ++ones;
        } else if (val == 2 && comp == 1) {
          ++twos;
        }
      }
    }

    Edge run = mBoundaryEdge;
    int numberStarts = 0;

    if (ones >= 2 && mNumVertices > 2) { // Definitely only ones can be added
      do {
        final int vertex = run.mStart;
        if (endpoint[vertex] != 0) { // Start possible
          if (oneAdd[vertex] != 0) {
            starts[numberStarts] = run;
            howMuch[numberStarts][0] = 1;
            howMuch[numberStarts][1] = 0;
            ++numberStarts;
          }
        }
        run = run.mInverse.mNext;
      }
      while (run != mBoundaryEdge);
    } else {
      if (ones == 1) { /* a two is possible in case it touches the one, a three never */
        Edge next = run.mInverse.mNext;
        do {
          final int vertex = run.mStart;
          int diffPos = 0;
          if (endpoint[vertex] != 0) { // Start possible
            if (oneAdd[vertex] != 0) {
              starts[numberStarts] = run;
              howMuch[numberStarts][0] = 1;
              diffPos = 1;
            }
            if (endpoint[next.mStart] != 0 && (mDegree[run.mStart] == 1 || mDegree[next.mStart] == 1)) {
              if (diffPos == 0) {
                starts[numberStarts] = run;
              }
              howMuch[numberStarts][diffPos++] = 2;
            }
            if (diffPos != 0) {
              howMuch[numberStarts++][diffPos] = 0;
            }
          }
          run = next;
          next = next.mInverse.mNext;
        }
        while (run != mBoundaryEdge);
      } else {
        /* That is: either the special case mNumVertices=2 which doesn't hurt or there
           is absolutely no one -- noone there ? :-)*/
        Edge next = run.mInverse.mNext;
        Edge overNext = next.mInverse.mNext;
        do {
          final int vertex = run.mStart;
          int diffPos = 0;
          if (endpoint[vertex] != 0) { // Start possible
            if (oneAdd[vertex] != 0) {
              starts[numberStarts] = run;
              howMuch[numberStarts][0] = 1;
              diffPos = 1;
            }
            if (endpoint[next.mStart] != 0) {
              if (diffPos == 0) {
                starts[numberStarts] = run;
              }
              howMuch[numberStarts][diffPos++] = 2;
            }
            if (midpoint[next.mStart] != 0 && endpoint[overNext.mStart] != 0) {
              int sum = mDegree[run.mStart] == 2 && mComponents[run.mStart] == 1 ? 1 : 0;
              if (mDegree[next.mStart] == 2 && mComponents[next.mStart] == 1) {
                ++sum;
              }
              if (mDegree[overNext.mStart] == 2 && mComponents[overNext.mStart] == 1) {
                ++sum;
              }
              if (sum >= twos) {
                if (diffPos == 0) {
                  starts[numberStarts] = run;
                }
                howMuch[numberStarts][diffPos++] = 3;
              }
            }
            if (diffPos != 0) {
              howMuch[numberStarts++][diffPos] = 0;
            }
          }
          run = next;
          next = overNext;
          overNext = overNext.mInverse.mNext;
        }
        while (run != mBoundaryEdge);
      }
    }
    starts[numberStarts] = null;
  }


  /* The construction routine -- adds a new vertex in every possible way and
     calls the mNext step (the labelling routine) if n=mMaxNumVertices or construct
     if n<mMaxNumVertices */
  private void construct() {
    final Edge[] starts = new Edge[3 * MAXNV]; // Each vertex can occur up to 3 times in the boundary
    final int[][] howMuch = new int[3 * MAXNV][6];

    if (mModulo != 0 && mNumVertices == SPLITLEVEL) {
      if (mModuloCounter == mModulo) {
        mModuloCounter = 1;
      } else {
        ++mModuloCounter;
        return;
      }
    }

    computePositions(starts, howMuch);

    // The automorphisms were computed in the previous step
    if (mNumberCanNumberings > 1) {
      computeOrbits(starts, howMuch);
    }

    int i = 0;
    for (Edge run = starts[0]; run != null; ++i, run = starts[i]) {
      for (int j = 0; howMuch[i][j] != 0; ++j) {
        addVertex(run, howMuch[i][j]);

        if (canon(mDegree, mCanNumberings) != 0) {
          if (mNumVertices == mMaxNumVertices) { // labelling the vertices
            if (mBenzenoids) {
              nextStepBenzenoids();
            } else {
              throw new UnsupportedOperationException();
              //next_step();
            }
          } else {
            construct(); // add another vertex
          }
        }
        deleteVertex();
      }
    }

  }

//  void usage(char *name)
//  {
//    fprintf(stderr,"Usage: %s x [B] [b] [c] [d] [f outfile] [m a b] [p] [s] \n\n",name);
//    fprintf(stderr,"The integer x is the number of hexagons.\n");
//    fprintf(stderr,"Option B makes that BECode is written to outfile (default stdout).\n");
//    fprintf(stderr,"Option b makes that only mBenzenoids are generated.\n");
//#ifndef NOLOG
//    fprintf(stderr,"Option c makes that the structures are not all formed in the memory, but just counted.\n");
//    fprintf(stderr,"Option d makes the program compute and display data about groups and chemical formulas.\n");
//#endif
//    fprintf(stderr,"Option f makes that data is written to outfile instead of stdout.\n");
//    fprintf(stderr,"Option m makes that the generation is splitted into b parts\n");
//    fprintf(stderr,"         and part number a (0<=a<b) shall be generated.\n");
//    fprintf(stderr,"Option p makes that planarcode is written to outfile (default stdout).\n");
//    fprintf(stderr,"Option s makes that just skeletons are generated.\n");
//
//    fprintf(stderr,"\n For just skeletons no additional mDetailed information is computed.\n\n ");
//    exit(1);
//  }
//
//
//#ifndef NOLOG
//
//  void write_results(FILE *outfile, Horloge *watch)
//  {
//    int i,j,k;
//    long dummy;
//
//    fprintf(outfile,"number of skeletons: %llu\n",mNumberOfSkeletons);
//    fprintf(outfile,"With trivial mGroupName: %llu With nontrivial mGroupName: %llu\n\n",mTrivSkeletons,mNumberOfSkeletons-mTrivSkeletons);
//    if (!just_skeletons) { fprintf(outfile,"number of labelled skeletons: %llu\n",mNumberOfLabellings);
//      if (mBenzenoids) fprintf(outfile,"Accepted %llu mBenzenoids.\n\n",mCount);
//      else fprintf(outfile,"Accepted %llu fusenes.\n\n",mCount);
//    }
//
//    if (mDetailed)
//    {
//      fprintf(outfile,"%llu catacondensed %llu pericondensed,\n",catas,mCount-catas);
//
//
//      fprintf(outfile,"Numbers of structures grouped with respect to the chemical formula:\n");
//      for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//      { for (k=Cs, dummy=0; k<=D6h; k++) dummy+=mGroupFormula[k][i][j];
//        if (dummy) fprintf(outfile,"C_%d H_%d: %llu\n",i,j,dummy); }
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[Cs][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry Cs: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[Cs][i][j])
//          fprintf(outfile,"Cs: C_%d H_%d: %llu\n",i,j,mGroupFormula[Cs][i][j]); }
//      }
//
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[C2h][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry C2h: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[C2h][i][j])
//          fprintf(outfile,"C2h: C_%d H_%d: %llu\n",i,j,mGroupFormula[C2h][i][j]); }
//      }
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[D2h][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry D2h: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[D2h][i][j])
//          fprintf(outfile,"D2h: C_%d H_%d: %llu\n",i,j,mGroupFormula[D2h][i][j]); }
//
//      }
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[C2v][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry C2v: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[C2v][i][j])
//          fprintf(outfile,"C2v: C_%d H_%d: %llu\n",i,j,mGroupFormula[C2v][i][j]); }
//      }
//
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[C3h][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry C3h: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[C3h][i][j])
//          fprintf(outfile,"C3h: C_%d H_%d: %llu\n",i,j,mGroupFormula[C3h][i][j]); }
//      }
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[D3h][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry D3h: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[D3h][i][j])
//          fprintf(outfile,"D3h: C_%d H_%d: %llu\n",i,j,mGroupFormula[D3h][i][j]); }
//      }
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[C6h][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry C6h: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[C6h][i][j])
//          fprintf(outfile,"C6h: C_%d H_%d: %llu\n",i,j,mGroupFormula[C6h][i][j]); }
//      }
//
//      for (i=6, dummy=0;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j) dummy+=mGroupFormula[D6h][i][j];
//      if (dummy)
//      {
//        fprintf(outfile,"Numbers of structures with symmetry D6h: %llu\n",dummy);
//        fprintf(outfile,"Grouped with respect to the chemical formula:\n");
//        for (i=6;i<=4*mMaxNumVertices+2;++i) for (j=6;j<=2*mMaxNumVertices+5;++j)
//        { if (mGroupFormula[D6h][i][j])
//          fprintf(outfile,"D6h: C_%d H_%d: %llu\n",i,j,mGroupFormula[D6h][i][j]); }
//      }
//    }/* mEnd mDetailed */
//
//    EvalHorloge(watch);
//    PrintHorloge(outfile,watch);
//    if(watch.ucpu > 1e-6)
//    {
//      fprintf(outfile,"%f skeletons/sec\n",(double)mNumberOfSkeletons / watch.ucpu);
//      if (!just_skeletons)
//      { if (mBenzenoids) fprintf(outfile,"%f mBenzenoids/sec\n",(double)mCount / watch.ucpu);
//      else fprintf(outfile,"%f fusenes/sec\n",(double)mCount / watch.ucpu);}
//    }
//  }
//#endif
//

  /* adds a new vertex and glues it to the mEnd of edge mStart. Triangles in both
     directions are formed to obtain a part of the trigonal net. In nextEdge
     the mNext edge where a vertex must be added (they are to be added in a spiral
     fashion) is returned.
     The edges are the mNext 6 after edgeList and the mStart pointer is set to starts */
  private Edge2 addNetVertex(final Edge2 start, final Edge2[] edgeList, final int e, final MutableInteger[] starts, final int s) {
    Edge2 edPrev;
    final Edge2 nextEdge;

    /* First initialize the new vertex and the edges going out of it: */
    Edge2 run = edgeList[e];
    run.mNext = edgeList[e + 1];
    run.mInverse = null;
    run.mStart = starts[s];
    run.mEnd = null;
    run.mNextNext = edgeList[e + 2];
    for (int i = 1; i < 5; ++i) {
      run = edgeList[e + i];
      run.mNext = edgeList[e + i + 1];
      run.mInverse = null;
      run.mStart = starts[s];
      run.mEnd = null;
      if (i == 4) {
        run.mNextNext = edgeList[e];
      } else {
        run.mNextNext = edgeList[e + i + 2];
      }
    }
    run = edgeList[e + 5];
    run.mNext = edgeList[e];
    run.mInverse = null;
    run.mStart = starts[s];
    run.mEnd = null;
    run.mNextNext = edgeList[e + 1];

    edgeList[e].mInverse = start;
    start.mInverse = edgeList[e];
    edgeList[e].mEnd = start.mStart;
    start.mEnd = starts[s];

    Edge2 run2;
    if ((run2 = start.mNext.mInverse) != null) { /* there is already a vertex */
      edPrev = edgeList[e].mNextNext.mNextNext.mNext; /* former .mPrev */
      run2.mNext.mInverse = edPrev;
      run2.mNext.mEnd = starts[s];
      edPrev.mInverse = run2.mNext;
      edPrev.mEnd = run2.mNext.mStart;
      nextEdge = run2.mNextNext;
    } else {
      nextEdge = start.mNext;
    }

    edPrev = start.mNextNext.mNextNext.mNext;

    if ((run2 = edPrev.mInverse) != null) /* there is already a vertex */ {
      edPrev = run2.mNextNext.mNextNext.mNext;
      edPrev.mInverse = edgeList[e].mNext;
      edPrev.mEnd = starts[s];
      edgeList[e].mNext.mInverse = edPrev;
      edgeList[e].mNext.mEnd = edPrev.mStart;
    }
    return nextEdge;
  }

  private Edge2[] initEdge2(final int size) {
    final Edge2[] res = new Edge2[size];
    for (int k = 0; k < size; ++k) {
      res[k] = new Edge2();
    }
    return res;
  }

  /* Builds a hexagonal net that is used to embed the structures when testing
     for being benzenoid. The radius is one larger than necessary to fit in, so
     that the neighbouring hexagons are always well defined. */
  private void initNet(final int radius) {
    final int hexagonNumber = 1 + 3 * radius * (radius + 1);
    final MutableInteger[] starts = new MutableInteger[hexagonNumber]; // Starting positions addressed from the edges
    for (int k = 0; k < starts.length; ++k) {
      starts[k] = new MutableInteger();
    }
    final Edge2[] edgeList = initEdge2(6 * hexagonNumber); // the edges used in the net

    // First initialize the first vertex and the edges going out of it.
    int e = 0;
    int s = 0;
    Edge2 nextEdge = edgeList[e];
    mStartNet = nextEdge;
    Edge2 run = nextEdge;
    run.mNext = edgeList[e + 1];
    run.mInverse = null;
    run.mStart = starts[s];
    run.mNextNext = edgeList[e + 2];
    run.mEnd = null;
    for (int i = 1; i < 5; ++i) {
      run = edgeList[e + i];
      run.mNext = edgeList[e + i + 1];
      run.mInverse = null;
      run.mStart = starts[s];
      run.mEnd = null;
      if (i == 4) {
        run.mNextNext = edgeList[e];
      } else {
        run.mNextNext = edgeList[e + i + 2];
      }
    }
    run = edgeList[e + 5];
    run.mNext = edgeList[e];
    run.mInverse = null;
    run.mStart = starts[s];
    run.mEnd = null;
    run.mNextNext = edgeList[e + 1];

    e += 6;
    ++s;
    for (int i = 1; i < hexagonNumber; ++i, e += 6, ++s) {
      nextEdge = addNetVertex(nextEdge, edgeList, e, starts, s);
    }
  }

//  int main(int argc, char *argv[])
//
//  {
//    int i;
//    if (argc<2) usage(argv[0]);
//
//    outfile=stdout;
//
//    for (i=1; i<argc; ++i)
//    { if (isdigit(argv[i][0])) mMaxNumVertices=atoi(argv[i]);
//    else
//    if (argv[i][0]=='B') bec_out=1;
//    else if (argv[i][0]=='b') mBenzenoids=1;
//    else if (argv[i][0]=='c') just_count=1;
//    else if (argv[i][0]=='d') mDetailed=1;
//    else if (argv[i][0]=='f')
//    { ++i;
//      if (i>=argc) { fprintf(stderr,"No file given.\n"); exit(1); }
//      outfile=fopen(argv[i],"wb");
//      if (outfile==null) { fprintf(stderr,"Can not open file %s for writing.\n",argv[i]);
//        exit(1); }
//    }
//    else if (argv[i][0]=='m')
//    { ++i; part=atoi(argv[i]); ++i; mModulo=atoi(argv[i]);
//      if ((mModulo==0) || (part<0) || (part>=mModulo)) usage(argv[0]);
//      mModuloCounter=mModulo-part;
//    }
//    else if (argv[i][0]=='p') pl_code_out=1;
//    else if (argv[i][0]=='s') just_skeletons=1;
//    else{ fprintf(stderr,"Unrecognized option: %s\n",argv[i]);
//      usage(argv[0]); }
//    }
//
//    if (just_skeletons) mDetailed=0;
//
//    CHdifference=2*mMaxNumVertices-2;
//    Cconstant=5*mMaxNumVertices+1;
//
//    if (mModulo && (mMaxNumVertices<=SPLITLEVEL))
//    { fprintf(stderr,"When using option m there must be at least %d hexagons\n",
//      SPLITLEVEL+1);
//      exit(1); }
//
//    if (mBenzenoids && just_skeletons)
//    { fprintf(stderr,"Benzenoids and just skeletons together isn't possible.\n");
//      exit(1); }
//
//    if (mBenzenoids && just_count)
//    { fprintf(stderr,"Just counting Benzenoids isn't possible -- setting just_count to 0.\n");
//      just_count=0; }
//
//
//    if (mBenzenoids) initNet(mMaxNumVertices);
//
//    if (sizeof(long) < 8)
//    { fprintf(stderr,"Warning: size of long only %d bytes ! \n",
//      (int)sizeof(long));
//    }
//
//    if ((mMaxNumVertices<2) || (mMaxNumVertices>MAXNV))
//    { fprintf(stderr,"The number of faces must be in the range 2 to %d.\n",MAXNV);
//      exit(1); }
//
//    init();
//
//    if (mMaxNumVertices==2) { mNumberOfSkeletons=1; mNumberOfLabellings=1; catacondensed=1; mGroupName=D2h; mC=10; mH=8; writeUp(); }
//    else construct();
//
//  }
//

  @Override
  public Z next() {
    if (++mMaxNumVertices < 2) {
      return Z.ONE;
    }
    if (mMaxNumVertices > MAXNV) {
      throw new IllegalArgumentException();
    }
    mCount = 0;

    mBenzenoids = true;
    //CHdifference = 2 * mMaxNumVertices - 2;
    //Cconstant = 5 * mMaxNumVertices + 1;

    if (mBenzenoids) {
      initNet(mMaxNumVertices);
    }

    init();

    if (mMaxNumVertices == 2) {
      //mNumberOfSkeletons = 1;
      //mNumberOfLabellings = 1;
      //catacondensed = 1;
      mGroupName = GroupName.D2H;
      mC = 10;
      mH = 8;
      writeUp();
    } else {
      construct();
    }

    //System.out.println(mCount);
    return Z.valueOf(mCount);
  }
}
