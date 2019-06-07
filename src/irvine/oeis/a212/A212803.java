package irvine.oeis.a212;

import irvine.math.z.Z;

/**
 * A212803 Number of Eulerian circuits in the Cartesian product of two directed cycles of lengths <code>n</code>.
 * @author Sean A. Irvine
 */
public class A212803 extends A212801 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
