package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a059.A059419;

/**
 * A060057 Nonzero numbers in expansion of ((tan(x))^5)/5! in (x^n)/n!.
 * @author Sean A. Irvine
 */
public class A060057 extends A059419 {

  private long mN = 3;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, 5L);
  }
}
