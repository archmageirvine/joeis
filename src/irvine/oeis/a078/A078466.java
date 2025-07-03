package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078466 First cycle is reached under a "Collatz-Fibonacci" transform (cf. comment).
 * @author Sean A. Irvine
 */
public class A078466 extends Sequence1 {

  private Z mN = Z.ZERO;

  private boolean is(final Z n) {
    Z a = Z.ONE;
    Z b = n;
    while (true) {
      final Z t = a.isEven() != b.isEven() ? a.add(b) : b.subtract(a).abs().divide2();
      if (a.isOne()) {
        if (b.isOne() && t.isZero()) {
          return true;
        }
        if (b.equals(Z.TWO) && t.equals(Z.THREE)) {
          return false;
        }
      }
      a = b;
      b = t;
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}

