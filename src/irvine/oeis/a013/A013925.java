package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013925.
 * @author Sean A. Irvine
 */
public class A013925 extends A013924 {

  private int mN = 4;

  @Override
  public Z next() {
    return get(3, ++mN);
  }
}
