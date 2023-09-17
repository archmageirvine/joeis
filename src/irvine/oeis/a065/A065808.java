package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065808 Square of n has a smaller square as its final digits.
 * @author Sean A. Irvine
 */
public class A065808 extends A065807 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
