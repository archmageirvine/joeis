package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084926 Inverse hyperbolic cotangent reducible numbers. The hyperbolic analog of the non-Stormer numbers (A002312).
 * @author Sean A. Irvine
 */
public class A084926 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      boolean ok = false;
      Z x = Z.ONE;
      final Z n = Z.valueOf(++mN);
      while (x.compareTo(n) < 0) {
        x = x.add(1);
        final Z t = x.add(n);
        final Z r = t.multiply(x.multiply(n).add(1).divide(t));
        if (r.compareTo(x.multiply(n).add(1)) >= 0) {
          ok = true;
          break;
        }
      }
      if (ok) {
        return n;
      }
    }
  }
}
