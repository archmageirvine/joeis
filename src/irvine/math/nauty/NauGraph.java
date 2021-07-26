package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Graph-specific auxiliary source file for version 2.5 of nauty.
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class NauGraph extends DefaultDispatchVec {

  private final long[] mWorkSet = new long[Nauty.MAXM];
  private final int[] mWorkPerm = new int[Nauty.MAXN];
  private final int[] mBucket = new int[Nauty.MAXN + 2];

  @Override
  public boolean isAutomorphism(final Graph g, final int[] perm, final boolean digraph) {
    for (int pg = 0, i = 0; i < g.order(); pg += 1, ++i) {
      final long pgp = ((SmallGraph) g).getEdgeVector(perm[i]);
      int pos = digraph ? -1 : i;
      // SAI: this loop might be wrong
      while ((pos = g.nextVertex(pg, pos)) >= 0) {
        final int posp = perm[pos];
        if ((pgp & GenerateGraphs.BIT[posp]) == 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public int testCanLab(final Graph g, final Graph canong, final int[] lab, final int[] samerows) {
    final int n = g.order();
    for (int i = 0; i < n; ++i) {
      mWorkPerm[lab[i]] = i;
    }

    for (int i = 0, ph = 0; i < n; ++i, ++ph) {
      NautyUtil.permSet(g, lab[i], mWorkSet, 0, mWorkPerm);
      for (int j = 0; j < 1; ++j) {
        if (mWorkSet[j] < ((SmallGraph) canong).getEdgeVector(ph + j)) {
          samerows[0] = i;
          return -1;
        } else if (mWorkSet[j] > ((SmallGraph) canong).getEdgeVector(ph + j)) {
          samerows[0] = i;
          return 1;
        }
      }
    }

    samerows[0] = n;
    return 0;
  }

  @Override
  public void updateCan(final Graph g, final Graph canong, final int[] lab, final int samerows) {
    final int n = g.order();
    for (int i = 0; i < n; ++i) {
      mWorkPerm[lab[i]] = i;
    }
    for (int i = samerows; i < n; ++i) {
      //NautyUtil.permSet(g, lab[i], ((SmallGraph) canong).adj(), i, mWorkPerm);
      ((SmallGraph) canong).isolate(i); // this line appears to be essential! -d3 -D3 -c 18 case.
      long setw = ((SmallGraph) g).getEdgeVector(lab[i]);
      while (setw != 0) {
        final int b = Long.numberOfLeadingZeros(setw);
        setw ^= GenerateGraphs.BIT[b];
        canong.addEdge(i, mWorkPerm[b]);
      }
    }
  }


///*
//*                                                                            *
//*  refine(g,lab,ptn,level,numcells,count,active,code,m,n) performs a         *
//*  refinement operation on the partition at the specified level of the       *
//*  partition nest (lab,ptn).  *numcells is assumed to contain the number of  *
//*  cells on input, and is updated.  The initial set of active cells (alpha   *
//*  in the paper) is specified in the set active.  Precisely, x is in active  *
//*  iff the cell starting at index x in lab is active.                        *
//*  The resulting partition is equitable if active is correct (see the paper  *
//*  and the Guide).                                                           *
//*  *code is set to a value which depends on the fine detail of the           *
//*  algorithm, but which is independent of the labelling of the graph.        *
//*  count is used for work space.                                             *
//*                                                                            *
//*  GLOBALS ACCESSED:  mWorkSet<w>,bit<r>,next(),mBucket<w>,mWorkPerm<w>  *
//*                                                                            *
//*/
//
//void
//refine(long[]g, int[]lab, int[]ptn, int level, int[]numcells,
//       int[]count, long[]active, int[]code, int m, int n)
//{
//  printf("This class is usedXXX\n");
//#if MAXM==1
//    refine1(g,lab,ptn,level,numcells,count,active,code,m,n);
//}
//#else
//
//    int i,c1,c2,labc1;
//    long x;
//    long[]set1,*set2;
//    int split1,split2,cell1,cell2;
//    int cnt,bmin,bmax;
//    long longcode;
//    long[]gptr;
//    int maxcell,maxpos,hint;
//
//#if !MAXN
//    DYNALLOC1(int,mWorkPerm,workperm_sz,n,"refine");
//    DYNALLOC1(set,mWorkSet,workset_sz,m,"refine");
//    DYNALLOC1(int,mBucket,bucket_sz,n+2,"refine");
//#endif
//
//    longcode = *numcells;
//    split1 = -1;
//    hint = 0;
//    while (*numcells < n && ((split1 = hint, ISELEMENT(active,split1))
//                         || (split1 = next(active,M,split1)) >= 0
//                         || (split1 = next(active,M,-1)) >= 0))
//    {
//        DELELEMENT(active,split1);
//        for (split2 = split1; ptn[split2] > level; ++split2) {}
//        longcode = mash(longcode,split1+split2);
//        if (split1 == split2)       /* trivial splitting cell */
//        {
//            gptr = GRAPHROW(g,lab[split1],M);
//            for (cell1 = 0; cell1 < n; cell1 = cell2 + 1)
//            {
//                for (cell2 = cell1; ptn[cell2] > level; ++cell2) {}
//                if (cell1 == cell2) continue;
//                c1 = cell1;
//                c2 = cell2;
//                while (c1 <= c2)
//                {
//                    labc1 = lab[c1];
//                    if (ISELEMENT(gptr,labc1))
//                        ++c1;
//                    else
//                    {
//                        lab[c1] = lab[c2];
//                        lab[c2] = labc1;
//                        --c2;
//                    }
//                }
//                if (c2 >= cell1 && c1 <= cell2)
//                {
//                    ptn[c2] = level;
//                    longcode = mash(longcode,c2);
//                    ++*numcells;
//                    if (ISELEMENT(active,cell1) || c2-cell1 >= cell2-c1)
//                    {
//                        ADDELEMENT(active,c1);
//                        if (c1 == cell2) hint = c1;
//                    }
//                    else
//                    {
//                        ADDELEMENT(active,cell1);
//                        if (c2 == cell1) hint = cell1;
//                    }
//                }
//            }
//        }
//
//        else        /* nontrivial splitting cell */
//        {
//            EMPTYSET(mWorkSet,m);
//            for (i = split1; i <= split2; ++i)
//                ADDELEMENT(mWorkSet,lab[i]);
//            longcode = mash(longcode,split2-split1+1);
//
//            for (cell1 = 0; cell1 < n; cell1 = cell2 + 1)
//            {
//                for (cell2 = cell1; ptn[cell2] > level; ++cell2) {}
//                if (cell1 == cell2) continue;
//                i = cell1;
//                set1 = mWorkSet;
//                set2 = GRAPHROW(g,lab[i],m);
//                cnt = 0;
//                for (c1 = m; --c1 >= 0;)
//                    if ((x = (*set1++) & (*set2++)) != 0)
//                        cnt += POPCOUNT(x);
//
//                count[i] = bmin = bmax = cnt;
//                mBucket[cnt] = 1;
//                while (++i <= cell2)
//                {
//                    set1 = mWorkSet;
//                    set2 = GRAPHROW(g,lab[i],m);
//                    cnt = 0;
//                    for (c1 = m; --c1 >= 0;)
//                        if ((x = (*set1++) & (*set2++)) != 0)
//                            cnt += POPCOUNT(x);
//
//                    while (bmin > cnt) mBucket[--bmin] = 0;
//                    while (bmax < cnt) mBucket[++bmax] = 0;
//                    ++mBucket[cnt];
//                    count[i] = cnt;
//                }
//                if (bmin == bmax)
//                {
//                    longcode = mash(longcode,bmin+cell1);
//                    continue;
//                }
//                c1 = cell1;
//                maxcell = -1;
//                for (i = bmin; i <= bmax; ++i)
//                    if (mBucket[i])
//                    {
//                        c2 = c1 + mBucket[i];
//                        mBucket[i] = c1;
//                        longcode = mash(longcode,i+c1);
//                        if (c2-c1 > maxcell)
//                        {
//                            maxcell = c2-c1;
//                            maxpos = c1;
//                        }
//                        if (c1 != cell1)
//                        {
//                            ADDELEMENT(active,c1);
//                            if (c2-c1 == 1) hint = c1;
//                            ++*numcells;
//                        }
//                        if (c2 <= cell2) ptn[c2-1] = level;
//                        c1 = c2;
//                    }
//                for (i = cell1; i <= cell2; ++i)
//                    mWorkPerm[mBucket[count[i]]++] = lab[i];
//                for (i = cell1; i <= cell2; ++i) lab[i] = mWorkPerm[i];
//                if (!ISELEMENT(active,cell1))
//                {
//                    ADDELEMENT(active,cell1);
//                    DELELEMENT(active,maxpos);
//                }
//            }
//        }
//    }
//
//    longcode = mash(longcode,*numcells);
//    *code = cleanup(longcode);
//}

  /*
   *  refine1(g,lab,ptn,level,numcells,count,active,code,m,n) is the same as
   *  refine(g,lab,ptn,level,numcells,count,active,code,m,n), except that
   *  m==1 is assumed for greater efficiency.  The results are identical in all
   *  respects.  See refine (above) for the specs.
   */
  @Override
  public void refine1(final Graph g, final int[] lab, final int[] ptn, final int level, final int[] numcells, final int[] count, final NautySet active, final int[] code, final int m) {
    int maxpos = 0;
    int hint = 0;
    long longcode = numcells[0];
    final int n = g.order();

    int split1;
    int split2;
    while (numcells[0] < n && (((split1 = hint) >= 0 && (active.isSet(split1)))
      || (split1 = active.next(split1)) >= 0
      || (split1 = active.next(-1)) >= 0)) {
      active.clear(split1);
      for (split2 = split1; ptn[split2] > level; ++split2) {
      }
      longcode = NautyUtil.mash(longcode, split1 + split2);
      if (split1 == split2) {
        // trivial splitting cell
        final long gptr = ((SmallGraph) g).getEdgeVector(lab[split1]);
        int cell2;
        for (int cell1 = 0; cell1 < n; cell1 = cell2 + 1) {
          for (cell2 = cell1; ptn[cell2] > level; ++cell2) {
          }
          if (cell1 == cell2) {
            continue;
          }
          int c1 = cell1;
          int c2 = cell2;
          while (c1 <= c2) {
            final int labc1 = lab[c1];
            if ((gptr & GenerateGraphs.BIT[labc1]) != 0) {
              ++c1;
            } else {
              lab[c1] = lab[c2];
              lab[c2] = labc1;
              --c2;
            }
          }
          if (c2 >= cell1 && c1 <= cell2) {
            ptn[c2] = level;
            longcode = NautyUtil.mash(longcode, c2);
            ++numcells[0];
            if (active.isSet(cell1) || c2 - cell1 >= cell2 - c1) {
              active.set(c1);
              if (c1 == cell2) {
                hint = c1;
              }
            } else {
              active.set(cell1);
              if (c2 == cell1) {
                hint = cell1;
              }
            }
          }
        }
      } else {
        //nontrivial splitting cell
        long workset0 = 0;
        for (int i = split1; i <= split2; ++i) {
          workset0 |= GenerateGraphs.BIT[lab[i]];
        }
        longcode = NautyUtil.mash(longcode, split2 - split1 + 1);
        int cell2;
        for (int cell1 = 0; cell1 < g.order(); cell1 = cell2 + 1) {
          for (cell2 = cell1; ptn[cell2] > level; ++cell2) {
          }
          if (cell1 == cell2) {
            continue;
          }
          int i = cell1;
          int cnt = (int) (long) Long.bitCount(workset0 & ((SmallGraph) g).getEdgeVector(lab[i]));
          count[i] = cnt;
          int bmin = cnt;
          int bmax = cnt;
          mBucket[cnt] = 1;
          while (++i <= cell2) {
            cnt = (int) (long) Long.bitCount(workset0 & ((SmallGraph) g).getEdgeVector(lab[i]));
            while (bmin > cnt) {
              mBucket[--bmin] = 0;
            }
            while (bmax < cnt) {
              mBucket[++bmax] = 0;
            }
            ++mBucket[cnt];
            count[i] = cnt;
          }
          if (bmin == bmax) {
            longcode = NautyUtil.mash(longcode, bmin + cell1);
            continue;
          }
          int c1 = cell1;
          int maxcell = -1;
          for (i = bmin; i <= bmax; ++i) {
            if (mBucket[i] != 0) {
              final int c2 = c1 + mBucket[i];
              mBucket[i] = c1;
              longcode = NautyUtil.mash(longcode, i + c1);
              if (c2 - c1 > maxcell) {
                maxcell = c2 - c1;
                maxpos = c1;
              }
              if (c1 != cell1) {
                active.set(c1);
                if (c2 - c1 == 1) {
                  hint = c1;
                }
                ++numcells[0];
              }
              if (c2 <= cell2) {
                ptn[c2 - 1] = level;
              }
              c1 = c2;
            }
          }
          for (i = cell1; i <= cell2; ++i) {
            mWorkPerm[mBucket[count[i]]++] = lab[i];
          }
          for (i = cell1; i <= cell2; ++i) {
            lab[i] = mWorkPerm[i];
          }
          if (!active.isSet(cell1)) {
            active.set(cell1);
            active.clear(maxpos);
          }
        }
      }
    }

    longcode = NautyUtil.mash(longcode, numcells[0]);
    code[0] = NautyUtil.cleanup(longcode);
  }

  /*
   *  cheapAutom(ptn,level,mDigraph,n) returns TRUE if the partition at the
   *  specified level in the partition nest (lab,ptn) {lab is not needed here}
   *  satisfies a simple sufficient condition for its cells to be the orbits of
   *  some subgroup of the automorphism group.  Otherwise it returns FALSE.
   *  It always returns FALSE if mDigraph!=FALSE.
   *
   *  nauty assumes that this function will always return TRUE for any
   *  partition finer than one for which it returns TRUE.
   */
  @Override
  public boolean cheapAutom(final int[] ptn, final int level, final boolean digraph, final int n) {
    if (digraph) {
      return false;
    }
    int k = n;
    int nnt = 0;
    for (int i = 0; i < n; ++i) {
      --k;
      if (ptn[i] > level) {
        ++nnt;
        while (ptn[++i] > level) {
        }
      }
    }
    return k <= nnt + 1 || k <= 4;
  }

  /*
   *  bestcell(g,lab,ptn,level,mTcLevel,m,n) returns the index in lab of the
   *  start of the "best non-singleton cell" for fixing.  If there is no
   *  non-singleton cell it returns n.
   *  This implementation finds the first cell which is non-trivially joined
   *  to the greatest number of other cells.
   */
  int bestcell(final Graph g, final int[] lab, final int[] ptn, final int level) {
     // find non-singleton cells: put starts in mWorkPerm[0..nnt-1]
     final int n = g.order();
     int i = 0;
     int nnt = 0;

     while (i < n) {
       if (ptn[i] > level) {
         mWorkPerm[nnt++] = i;
         while (ptn[i] > level) {
           ++i;
         }
       }
       ++i;
     }

     if (nnt == 0) {
       return n;
     }

     // set mBucket[i] to # non-trivial neighbours of n.s. cell i
     for (i = nnt; --i >= 0; ) {
       mBucket[i] = 0;
     }
     int v1;
     int v2;
     for (v2 = 1; v2 < nnt; ++v2) {
       mWorkSet[0] = 0;
       i = mWorkPerm[v2] - 1;
       do {
         ++i;
         mWorkSet[0] |= GenerateGraphs.BIT[lab[i]];
       } while (ptn[i] > level);
       for (v1 = 0; v1 < v2; ++v1) {
         final long gp = ((SmallGraph) g).getEdgeVector(lab[mWorkPerm[v1]]);
         final long long1 = mWorkSet[0] & gp;
         final long long2 = mWorkSet[0] & ~gp;
         if (long1 != 0 && long2 != 0) {
           ++mBucket[v1];
           ++mBucket[v2];
         }
       }
     }

     // find first greatest mBucket value
     v1 = 0;
     v2 = mBucket[0];
     for (i = 1; i < nnt; ++i) {
       if (mBucket[i] > v2) {
         v1 = i;
         v2 = mBucket[i];
       }
     }

     return mWorkPerm[v1];
   }

  /*
   *  targetCell(g,lab,ptn,level,mTcLevel,mDigraph,hint,m,n) returns the index
   *  in lab of the next cell to split.
   *  hint is a suggestion for the answer, which is obeyed if it is valid.
   *  Otherwise we use bestcell() up to mTcLevel and the first non-trivial
   *  cell after that.
   */
  @Override
  public int targetCell(final Graph g, final int[] lab, final int[] ptn, final int level, final int tcLevel, final boolean digraph, final int hint) {
    final int n = g.order();
    if (hint >= 0 && ptn[hint] > level && (hint == 0 || ptn[hint - 1] <= level)) {
      return hint;
    } else if (level <= tcLevel) {
      return bestcell(g, lab, ptn, level);
    } else {
      int i;
      for (i = 0; i < n && ptn[i] <= level; ++i) {
      }
      return i == n ? 0 : i;
    }
  }

///*
//*                                                                            *
//*  densenauty(g,lab,ptn,orbits,&options,&stats,m,n,h)                        *
//*  is a slightly simplified interface to nauty().  It allocates enough       *
//*  workspace for 20 automorphisms and checks that the densegraph dispatch     *
//*  vector is in use.                                                         *
//*                                                                            *
//*/
//
//void
//densenauty(long[]g, int[]lab, int[]ptn, int[]orbits,
//           optionblk *options, statsblk *stats, int m, int n, long[]h)
//{
//    if (options->dispatch != &dispatch_graph)
//    {
//  fprintf(ERRFILE,"Error: densenauty() needs standard options block\n");
//  exit(1);
//    }
//
//#if !MAXN
//    DYNALLOC1(set,dnwork,dnwork_sz,2*60*m,"densenauty malloc");
//#endif
//
//    nauty(g,lab,ptn,NULL,orbits,options,stats,dnwork,2*60*m,m,n,h);
//}
}
