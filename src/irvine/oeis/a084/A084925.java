package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084925 Inverse hyperbolic cotangent irreducible numbers: positive integers such that the arccoth of these numbers form a basis for the space of arccoth of rationals &gt;=1. The hyperbolic analog of the Stormer numbers (A005528).
 * @author Sean A. Irvine
 */
public class A084925 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      boolean ok = true;
      Z x = Z.ONE;
      final Z n = Z.valueOf(++mN);
      while (x.compareTo(n) < 0) {
        x = x.add(1);
        final Z t = x.add(n);
        final Z r = t.multiply(x.multiply(n).add(1).divide(t));
        if (r.compareTo(x.multiply(n).add(1)) >= 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return n;
      }
    }
  }
}
