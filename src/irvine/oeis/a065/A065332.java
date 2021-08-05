package irvine.oeis.a065;
// manually 2021-08-04

import irvine.math.z.Z;

/**
 * A065332 3-smooth numbers in their natural position, gaps filled with 0.
 * @author Georg Fischer
 */
public class A065332 extends A065333 {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return result.equals(Z.ZERO) ? result : result.multiply(mN);
  }
}
