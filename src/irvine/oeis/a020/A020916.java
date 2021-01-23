package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020916 A molecule is a row of atoms joined together by bonds; each atom has a valence (e.g. 1 - 3 = 2 is a molecule with 3 atoms); a(n) = number of molecules with n atoms and different valencies from 1 to n.
 * @author Robert Munafo
 * @author Sean A. Irvine (Java port)
 */
public class A020916 implements Sequence {

  // Munafo also describes a superior algorithm at:
  // http://mrob.com/pub/seq/a020916.html

  private int mN = -1;

  /**
   * Search.
   * @param i next position to fill (0 = first position)
   * @param n length of molecule we want to build
   * @param bb bitmap of atom values that have been used
   * @param val valence-number of bond from previous atom
   * @param rem sum of remaining unused atom values
   * @return count of solutions
   */
  private long search(final int i, final int n, final int bb, final int val, final int rem) {
    if (i >= n - 2) {
      /* There are two atoms left to place, rem is their sum, and val is the
         valence coming in. his leaves only one possible solution: the next
         atom must be (rem+val)/2, as illustrated by the examples below. If
         this "ideal" value is legal (<= n), bigger than the valence coming in,
         and if that atom hasn't been used yet, we have a solution.
           rem val solution
           5   3   4-1
           5   2   impossible by parity
           5   1   3=2
           17  1   9:8
           3   5   impossible by valence
         Note that if this penultimate atom is available, we know the final one
         is available too because we've been keeping track of the sum.
         */
      int pen = rem + val; // penultimate atom
      if ((pen & 1) == 1) {
        return 0;
      }
      pen >>>= 1;
      return (pen <= n) && (pen > val) && ((bb & (1 << pen)) == 0) ? 1 : 0;
    }

    /* Recurse on all unused numbers */
    long rv = 0;
    /* Try all candidates for the next atom. Note this next atom must be
       at least 1 greater than the incoming valence. */
    for (int j = val + 1; j <= n; ++j) {
      /* Check bitmap to see if this atom is available */
      if ((bb & (1 << j)) == 0) {
        /* Recurse and accumulate */
        rv += search(i + 1, n, bb | (1 << j), j - val, rem - j);
      }
    }
    return rv;
  }

  @Override
  public Z next() {
    final int sum = ++mN * (mN + 1) / 2;
    if (((mN + 3) & 2) == 0) {
      return Z.ZERO;
    } else {
      /* We always put the '1' atom first; this eliminates mirror image
         equivalents and reduces the depth of the search. */
      return Z.valueOf(search(1, mN, 1 << 1, 1, sum - 1));
    }
  }
}
