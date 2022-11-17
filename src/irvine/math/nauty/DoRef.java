package irvine.math.nauty;

import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.util.array.Sort;

/**
 * Refine a partition.
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class DoRef {

  private final int[] mWorkPerm = new int[Nauty.MAXN];

  static long mash(final long l, final int i) {
    return (l ^ 0x6b1d) + (i & 0x7fff);
  }

  static int cleanup(final long l) {
    return (int) (l % 0x7fff);
  }

  /*
   *  doRef(g,lab,ptn,level,numcells,qinvar,invar,active,code,refproc,
   *        invariant,mininvarlev,maxinvarlev,invararg,mDigraph,m,n)
   *  is used to perform a refinement on the partition at the given level in
   *  (lab,ptn).  The number of cells is *numcells both for input and output.
   *  The input active is the active set for input to the refinement procedure
   *  (*refproc)(), which must have the argument list of refine().
   *  active may be arbitrarily changed.  invar is used for working storage.
   *  First, (*refproc)() is called.  Then, if invariant!=NULL and
   *  |mininvarlev| <= level <= |maxinvarlev|, the routine (*invariant)() is
   *  used to compute a vertex-invariant which may refine the partition
   *  further.  If it does, (*refproc)() is called again, using an active set
   *  containing all but the first fragment of each old cell.  Unless g is a
   *  mDigraph, this guarantees that the final partition is equitable.  The
   *  arguments invararg and mDigraph are passed to (*invariant)()
   *  uninterpretted.  The output argument code is a composite of the codes
   *  from all the calls to (*refproc)().  The output argument qinvar is set
   *  to 0 if (*invariant)() is not applied, 1 if it is applied but fails to
   *  refine the partition, and 2 if it succeeds.
   *  See the file nautinv.c for a further discussion of vertex-invariants.
   *  Note that the dreadnaut I command generates a call to  this procedure
   *  with level = mMinInvarLevel = mMaxInvarLevel = 0.
   */
  void doRef(final Graph g, final int[] lab, final int[] ptn, final int level, final int[] numCells,
                  final int[] qinvar, final int[] invar, final NautySet active, final int[] code,
                  final DispatchVec dispatchVec,
                  final InvarProc invarProc,
                  final int minInvarLev, final int maxInvarLev, final int invarArg,
                  final boolean digraph) {

    int tvpos;
    if ((tvpos = active.next(-1)) < 0) {
      tvpos = 0;
    }

    final int n = g.order();
    dispatchVec.refine(g, lab, ptn, level, numCells, invar, active, code, 1);

    final int minlev = minInvarLev < 0 ? -minInvarLev : minInvarLev;
    final int maxlev = maxInvarLev < 0 ? -maxInvarLev : maxInvarLev;
    if (invarProc != null && numCells[0] < n && level >= minlev && level <= maxlev) {
      invarProc.invariant(g, lab, ptn, level, numCells[0], tvpos, invar, invarArg, digraph);
      active.clear();
      for (int i = n; --i >= 0; ) {
        mWorkPerm[i] = invar[lab[i]];
      }
      final int nc = numCells[0];
      int cell2 = 0;
      for (int cell1 = 0; cell1 < n; cell1 = cell2 + 1) {
        final int pw = mWorkPerm[cell1];
        boolean same = true;
        for (cell2 = cell1; ptn[cell2] > level; ++cell2) {
          if (mWorkPerm[cell2 + 1] != pw) {
            same = false;
          }
        }

        if (same) {
          continue;
        }

        Sort.sort(mWorkPerm, cell1, cell2 - cell1 + 1, (a, b) -> {
          int t = mWorkPerm[a];
          mWorkPerm[a] = mWorkPerm[b];
          mWorkPerm[b] = t;
          t = lab[a];
          lab[a] = lab[b];
          lab[b] = t;
        });

        for (int i = cell1 + 1; i <= cell2; ++i) {
          if (mWorkPerm[i] != mWorkPerm[i - 1]) {
            ptn[i - 1] = level;
            ++numCells[0];
            active.set(i);
          }
        }
      }

      if (numCells[0] > nc) {
        qinvar[0] = 2;
        long longcode = code[0];
        dispatchVec.refine(g, lab, ptn, level, numCells, invar, active, code, 1);
        longcode = mash(longcode, code[0]);
        code[0] = cleanup(longcode);
      } else {
        qinvar[0] = 1;
      }
    } else {
      qinvar[0] = 0;
    }
  }

  /*
   *  fmperm(perm,fix,mcr,m,n) uses perm to construct fix and mcr.  fix
   *  contains those points are fixed by perm, while mcr contains the set of
   *  those points which are least in their orbits.
   */
  void fmperm(final int[] perm, final long[] w, final int fix, final int mcr, final int n) {
    w[fix] = 0;
    w[mcr] = 0;
    Arrays.fill(mWorkPerm, 0, n + 1, 0);
    for (int i = 0; i < n; ++i) {
      if (perm[i] == i) {
        w[fix] |= GenerateGraphs.BIT[i];
        w[mcr] |= GenerateGraphs.BIT[i];
      } else if (mWorkPerm[i] == 0) {
        int l = i;
        do {
          final int k = l;
          l = perm[l];
          mWorkPerm[k] = 1;
        } while (l != i);
        w[mcr] |= GenerateGraphs.BIT[i];
      }
    }
  }
}
