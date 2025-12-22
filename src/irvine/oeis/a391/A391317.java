package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006037;

/**
 * A391317 a(n) is the smallest positive integer that has at least one subset of proper divisors that adds to the n-th weird number (A006037(n)).
 * @author Sean A. Irvine
 */
public class A391317 extends Sequence1 {

  private final Sequence mW = new A006037();

  private boolean is(final long target, final long[] d, final int k) {
    if (target == 0) {
      return true;
    }
    for (int j = k; j < d.length - 1 && d[j] <= target; ++j) {
      if (is(target - d[j], d, j + 1)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long target, final long k) {
    final int c = Functions.SIGMA1.z(k).subtract(k + 1).compareTo(target);
    if (c <= 0) {
      return c == 0;
    }
    final long[] d = ZUtils.toLong(Jaguar.factor(k).divisorsSorted());
    return is(target, d, 1);
  }

  @Override
  public Z next() {
    final long t = mW.next().longValueExact();
    long k = 0;
    while (true) {
      if (is(t, ++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
