package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007142 E-trees with at most 3 colors.
 * @author Sean A. Irvine
 */
public class A007142 extends A007141 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(3, ++mN);
  }
}
