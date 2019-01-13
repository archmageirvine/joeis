package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007142.
 * @author Sean A. Irvine
 */
public class A007142 extends A007141 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(3, ++mN);
  }
}
