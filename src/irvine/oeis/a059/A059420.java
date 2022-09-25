package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059420 A diagonal of A059419.
 * @author Sean A. Irvine
 */
public class A059420 extends A059419 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, 3L);
  }
}
