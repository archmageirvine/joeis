package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059229 A diagonal of triangle defined in A059226.
 * @author Sean A. Irvine
 */
public class A059229 extends A059226 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
