package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001830 Related to graded partially ordered sets.
 * @author Sean A. Irvine
 */
public class A001830 extends A001827 {

  private int mN = -1;

  @Override
  public Z next() {
    return c(7, ++mN);
  }
}
