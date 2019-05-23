package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022901.
 * @author Sean A. Irvine
 */
public class A022901 extends A022900 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(4L, ++mN);
  }
}
