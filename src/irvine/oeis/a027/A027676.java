package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027676 Squares composed of digits {1,4,6}.
 * @author Sean A. Irvine
 */
public class A027676 extends Sequence1 {

  private Z mN = Z.ZERO;

  private boolean is(Z n) {
    while (!n.isZero()) {
      final long r = n.mod(10);
      if (r != 1 && r != 4 && r != 6) {
        return false;
      }
      n = n.divide(Z.TEN);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (is(s)) {
        return s;
      }
    }
  }
}
