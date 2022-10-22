package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a059.A059419;

/**
 * A060056 Nonzero numbers in expansion of ((tan(x))^4)/4! in (x^n)/n!.
 * @author Sean A. Irvine
 */
public class A060056 extends A059419 {

  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, 4L);
  }
}
