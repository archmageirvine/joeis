package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001828 Related to partially ordered sets.
 * @author Sean A. Irvine
 */
public class A001828 extends A001827 {

  private int mN = -1;

  @Override
  public Z next() {
    return c(5, ++mN);
  }
}
