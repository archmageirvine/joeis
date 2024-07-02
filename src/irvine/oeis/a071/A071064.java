package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061602;

/**
 * A071064 Numbers divisible by the sum of factorials of their digits [A061602(n)] and also terminate in the sum of factorials of their digits.
 * @author Sean A. Irvine
 */
public class A071064 extends Sequence1 {

  private final Sequence mA = new A061602();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z t = mA.next();
      if (t.compareTo(n) <= 0 && n.mod(t).isZero()) {
        Z m = Z.TEN;
        while (m.compareTo(t) <= 0) {
          m = m.multiply(10);
        }
        if (n.mod(m).equals(t)) {
          return n;
        }
      }
    }
  }
}
