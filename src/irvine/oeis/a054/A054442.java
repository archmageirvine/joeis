package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054442 Second convolution of A001405 (central binomial numbers).
 * @author Sean A. Irvine
 */
public class A054442 extends A054336 {

  private int mN = 1;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
