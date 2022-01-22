package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054018 Squares mentioned in A054017.
 * @author Sean A. Irvine
 */
public class A054018 extends A054013 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero() && t.isSquare()) {
        return t;
      }
    }
  }
}
