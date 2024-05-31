package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003422;

/**
 * A014619 Exponential generating function is -f(x) * Integral_{t = 0..x} exp(exp(-t) - 1) dt, where f(x) = exp(1 - x - exp(-x)) is the exponential generating function for A014182.
 * @author Sean A. Irvine
 */
public class A014619 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final A003422 a = new A003422();
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 1, Functions.STIRLING2.z(mN, k).multiply(a.next()));
    }
    return sum;
  }
}
