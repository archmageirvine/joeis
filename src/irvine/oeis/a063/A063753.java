package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A063753 Numbers k such that cototient(k) is a square and sets a new record for squares.
 * @author Sean A. Irvine
 */
public class A063753 extends A051953 {

  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mRecord) > 0 && t.isSquare()) {
        mRecord = t;
        return Z.valueOf(mN);
      }
    }
  }
}
