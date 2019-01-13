package irvine.oeis.a212;

import irvine.math.z.Z;

/**
 * A212803.
 * @author Sean A. Irvine
 */
public class A212803 extends A212801 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
