package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067453 a(n) = binomial(a,b) where a&gt;=b and one of a and b is the product of the nonzero decimal digits of n and the other is the sum of the decimal digits of n.
 * @author Sean A. Irvine
 */
public class A067453 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long v = ++mN;
    final long sum = Functions.DIGIT_SUM.l(v);
    final long prod = ZUtils.digitNZProduct(mN, 10);
    return Binomial.binomial(Math.max(sum, prod), Math.min(sum, prod));
  }
}
