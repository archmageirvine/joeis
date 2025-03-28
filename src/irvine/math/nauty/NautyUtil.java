package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Utility functions.
 * @author Brendan McKay
 */
final class NautyUtil {

  private NautyUtil() { }

  /**
   * The position of the first element in set <code>set</code>
   * which occupies a position greater than <code>pos</code>.  If no such element exists,
   * the value is -1.  pos can have any value less than n, including negative
   * values.
   * @param set the set
   * @param pos position
   * @return next element
   */
  static int nextElement(final long set, final int pos) {
    final long setwd = pos < 0 ? set : set & GenerateGraphs.bitmask(pos);
    return setwd == 0 ? -1 : Long.numberOfLeadingZeros(setwd);
  }

  static int nextElement(final long[] set1, final int p, final int pos) {
    return nextElement(set1[p], pos);
  }

  /*
   *  permSet(set1,set2,m,perm)  defines set2 to be the set
   *  {perm[i] | i in set1}.
   */
  static void permSet(final Graph set1, final int off1, final long[] set2, final int off2, final int[] perm) {
    set2[off2] = 0;
    long setw = ((SmallGraph) set1).getEdgeVector(off1);
    while (setw != 0) {
      final int b = Long.numberOfLeadingZeros(setw);
      setw ^= GenerateGraphs.BIT[b];
      final int pos = perm[b];
      set2[off2] |= GenerateGraphs.BIT[pos];
    }
  }

  /*
   *  orbits represents a partition of {0,1,...,n-1}, by orbits[i] = the
   *  smallest element in the same cell as i.  map[] is any array with values
   *  in {0,1,...,n-1}.  orbJoin(orbits,map,n) joins the cells of orbits[]
   *  together to the minimum extent such that for each i, i and map[i] are in
   *  the same cell.  The function value returned is the new number of cells.
   */
  static int orbJoin(final int[] orbits, final int[] map, final int n) {
    for (int i = 0; i < n; ++i) {
      if (map[i] != i) {
        int j1 = orbits[i];
        while (orbits[j1] != j1) {
          j1 = orbits[j1];
        }
        int j2 = orbits[map[i]];
        while (orbits[j2] != j2) {
          j2 = orbits[j2];
        }

        if (j1 < j2) {
          orbits[j2] = j1;
        } else {
          if (j1 > j2) {
            orbits[j1] = j2;
          }
        }
      }
    }

    int j1 = 0;
    for (int i = 0; i < n; ++i) {
      if ((orbits[i] = orbits[orbits[i]]) == i) {
        ++j1;
      }
    }
    return j1;
  }


  /*
   *  fmptn(lab,ptn,level,fix,mcr,m,n) uses the partition at the specified
   *  level in the partition nest (lab,ptn) to make sets fix and mcr.  fix
   *  represents the points in trivial cells of the partition, while mcr
   *  represents those points which are least in their cells.
   */
  static void fmptn(final int[] lab, final int[] ptn, final int level, final long[] w, final int fix, final int mcr, final int n) {
    w[fix] = 0;
    w[mcr] = 0;

    for (int i = 0; i < n; ++i) {
      if (ptn[i] <= level) {
        w[fix] |= GenerateGraphs.BIT[lab[i]];
        w[mcr] |= GenerateGraphs.BIT[lab[i]];
      } else {
        int lmin = lab[i];
        do {
          if (lab[++i] < lmin) {
            lmin = lab[i];
          }
        } while (ptn[i] > level);
        w[mcr] |= GenerateGraphs.BIT[lmin];
      }
    }
  }

  /*
   *  makeTargetCell(g,lab,ptn,level,tcell,tcellsize,&cellpos,
   *                 mTcLevel,mDigraph,hint,targetCell,m,n)
   *  calls targetCell() to determine the target cell at the specified level
   *  in the partition nest (lab,ptn).  It must be a nontrivial cell (if not,
   *  the first cell.  The intention of hint is that, if hint >= 0 and there
   *  is a suitable non-trivial cell starting at position hint in lab,
   *  that cell is chosen.
   *  mTcLevel and mDigraph are input options.
   *  When a cell is chosen, tcell is set to its contents, *tcellsize to its
   *  size, and cellpos to its starting position in lab.
   */
  static long makeTargetCell(final Graph g, final int[] lab, final int[] ptn, final int level,
                           final int[] tcellsize, final int[] cellpos, final int tcLevel, final boolean digraph,
                           final int hint,
                           final DispatchVec dispatchVec) {
    final int i = dispatchVec.targetCell(g, lab, ptn, level, tcLevel, digraph, hint);
    int j = i + 1;
    while (ptn[j] > level) {
      ++j;
    }

    tcellsize[0] = j - i + 1;
    long tcell = 0;
    for (int k = i; k <= j; ++k) {
      tcell |= GenerateGraphs.BIT[lab[k]];
    }

    cellpos[0] = i;
    return tcell;
  }

  /* And the contents of set2 into set1. */
  static long shortPrune(final long set1, final long[] set2, final int pos) {
    return set1 & set2[pos];
  }

  /*
   *  breakout(lab,ptn,level,tc,tv,active,m) operates on the partition at
   *  the specified level in the partition nest (lab,ptn).  It finds the
   *  element tv, which is in the cell C starting at index tc in lab (it had
   *  better be) and splits C in the two cells {tv} and C\{tv}, in that order.
   *  It also sets the set active to contain just the element tc.
   */
  static void breakout(final int[] lab, final int[] ptn, final int level, final int tc, final int tv, final NautySet active) {
    active.clear();
    active.set(tc);
    int i = tc;
    int prev = tv;

    do {
      final int next = lab[i];
      lab[i++] = prev;
      prev = next;
    } while (prev != tv);

    ptn[tc] = level;
  }

  /*
   *  longPrune(tcell,fix,bottom,top,m) removes zero or elements of the set
   *  tcell.  It is assumed that addresses bottom through top-1 contain
   *  contiguous pairs of sets (f1,m1),(f2,m2), ... .  tcell is intersected
   *  with each mi such that fi is a subset of fix.
   */
  static long longPrune(long tcell, final NautySet fix, final long[] array, int bottom, final int top) {
    // XXX TODO I don't think this is correct for n>64 vertices
    while (bottom < top) {
      if ((fix.getBlock(0) & ~array[bottom++]) == 0) {
        tcell &= array[bottom];
      }
      ++bottom;
    }
    return tcell;
  }
}
