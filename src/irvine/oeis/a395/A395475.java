package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A395475 Number of 3 X n binary matrices that are "primitive"; that is, they cannot be expressed as a "tiling" by a smaller matrix.
 * @author Sean A. Irvine
 */
public class A395475 extends Sequence1 {

  private long mN = 0;

  protected Z psi(final long k, final long m, final long n) {
    final long[] v1 = ZUtils.toLong(Jaguar.factor(m).divisors());
    final long[] v2 = ZUtils.toLong(Jaguar.factor(n).divisors());
    final Z zk = Z.valueOf(k);
    Z sum = Z.ZERO;
    for (final long v : v1) {
      for (final long u : v2) {
        final int mobius = Functions.MOBIUS.i(v) * Functions.MOBIUS.i(u);
        if (mobius != 0) {
          sum = sum.signedAdd(mobius == 1, zk.pow((m / v) * (n / u)));
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return psi(2, 3, ++mN);
  }
}

