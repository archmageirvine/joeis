package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A391021 Primes in A390697 where the concatenation, in non-decreasing order, of all prime digit permutations, read as a decimal integer, attains a new record.
 * @author Sean A. Irvine
 */
public class A391021 extends A000040 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final Permutation perm = Permutation.permuter(prime);
      final StringBuilder sb = new StringBuilder();
      int[] p;
      while ((p = perm.next()) != null) {
        final Z q = Permutation.permToZ(p);
        if (q.isProbablePrime()) {
          sb.append(q);
        }
      }
      final Z q = new Z(sb);
      if (q.compareTo(mBest) > 0 && q.isProbablePrime()) {
        mBest = q;
        return prime;
      }
    }
  }
}
