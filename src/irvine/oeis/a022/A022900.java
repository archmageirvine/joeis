package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022900.
 * @author Sean A. Irvine
 */
public class A022900 extends A022894 {

  private long mN = 0;

  @Override
  protected long start() {
    return 4;
  }

  @Override
  public Z next() {
    return get(5L, ++mN);
  }
}
