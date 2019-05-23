package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022902.
 * @author Sean A. Irvine
 */
public class A022902 extends A022900 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(3L, ++mN);
  }
}
