package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a001.A001414;

/**
 * A064463 Numbers k such that A001414(k) is a square and sets a new record for squares.
 * @author Sean A. Irvine
 */
public class A064463 extends A001414 {

  private Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mA) > 0 && t.isSquare()) {
        mA = t;
        return Z.valueOf(mN);
      }
    }
  }
}
