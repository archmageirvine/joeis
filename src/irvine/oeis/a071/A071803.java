package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071803 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final int a = mN / 2;
    final int b = (mN + 1) / 2;
    return Binomial.multinomial(3 * mN, mN, mN, mN).subtract(Binomial.multinomial(3 * a, a, a, a).multiply(Binomial.multinomial(3 * b, b, b, b)));
  }
}
