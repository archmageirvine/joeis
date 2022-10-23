package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046855 a(n) = Sum_{i=0..n} binomial(2^n-1, i).
 * @author Sean A. Irvine
 */
public class A046855 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN).subtract(1);
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(t, Z.valueOf(k)));
    }
    return sum;
  }
}
