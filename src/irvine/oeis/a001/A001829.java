package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001829 Related to graded partially ordered sets.
 * @author Sean A. Irvine
 */
public class A001829 extends A001827 {

  private int mN = -1;

  @Override
  public Z next() {
    return c(6, ++mN);
  }
}
