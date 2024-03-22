package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068883 Smallest n-digit triangular numbers with property that digits alternate in parity, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A068883 extends Sequence1 {

  private Z mA = Z.ZERO;

  private Z trinv(final Z n) {
    return n.shiftLeft(3).add(1).sqrt().subtract(1).divide2();
  }

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mA.isEven() ? 1 : 0);
    Z r = trinv(mA);
    while (true) {
      final Z t = r.multiply(r.add(1)).divide2();
      if (t.compareTo(mA) >= 0 && A068880.is(t)) {
        return t;
      }
      r = r.add(1);
    }
  }
}
