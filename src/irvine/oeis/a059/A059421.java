package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059421 A diagonal of A059419.
 * @author Sean A. Irvine
 */
public class A059421 extends A059419 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN + 4, mN);
  }
}
