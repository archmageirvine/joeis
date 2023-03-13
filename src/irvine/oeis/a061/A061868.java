package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061868 Numbers n such that n^2 has property that the sum of its digits and the product of its digits are squares (allowing zeros).
 * @author Sean A. Irvine
 */
public class A061868 extends A061869 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
