package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051534 Integers n for which ceiling(n/2)*10^n - ceiling(n/2) is an n-White number.
 * @author Sean A. Irvine
 */
public class A051534 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long c = (mN + 1) / 2;
      final Z mod = Z.TEN.pow(mN);
      final Z m = mod.multiply(c).subtract(c);
      Z t = m.pow(mN);
      Z sum = Z.ZERO;
      while (!t.isZero()) {
        final Z[] qr = t.divideAndRemainder(mod);
        sum = sum.add(qr[1]);
        t = qr[0];
      }
      if (sum.equals(m)) {
        return Z.valueOf(mN);
      }
    }
  }
}
