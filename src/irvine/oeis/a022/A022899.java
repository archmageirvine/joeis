package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022899.
 * @author Sean A. Irvine
 */
public class A022899 extends A022897 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(1L, ++mN);
  }
}
