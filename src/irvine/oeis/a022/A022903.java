package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022903.
 * @author Sean A. Irvine
 */
public class A022903 extends A022894 {

  private long mN = 0;

  @Override
  protected long start() {
    return 6;
  }

  @Override
  public Z next() {
    return get(7L, ++mN);
  }
}
