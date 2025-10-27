package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A389810 Prime(k)-1 copies of prime(k) ordered by increasing k.
 * @author Sean A. Irvine
 */
public class A389810 extends A000040 {

  private Z mP = super.next();
  private long mM = mP.longValue() - 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mP = super.next();
      mM = mP.longValueExact() - 2;
    }
    return mP;
  }
}

