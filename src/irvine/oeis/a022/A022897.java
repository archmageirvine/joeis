package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022897.
 * @author Sean A. Irvine
 */
public class A022897 extends A022894 {

  private long mN = 0;

  @Override
  protected long start() {
    return 2;
  }

  @Override
  public Z next() {
    return get(3L, ++mN);
  }
}
