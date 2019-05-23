package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022904.
 * @author Sean A. Irvine
 */
public class A022904 extends A022903 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(6L, ++mN);
  }
}
