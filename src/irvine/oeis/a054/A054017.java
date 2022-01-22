package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054017 Chowla's function of n modulo n is a square (excluding 0's).
 * @author Sean A. Irvine
 */
public class A054017 extends A054013 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero() && t.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
