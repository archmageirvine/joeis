package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002203;

/**
 * A006646 Exponential self-convolution of Pell numbers.
 * @author Sean A. Irvine
 */
public class A006646 extends A002203 {

  private int mN = -4;

  @Override
  public Z next() {
    return super.next().subtract(2).shiftLeft(++mN);
  }
}
