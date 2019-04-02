package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006668 Exponential self-convolution of Pell numbers (divided by 2).
 * @author Sean A. Irvine
 */
public class A006668 extends A006646 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
