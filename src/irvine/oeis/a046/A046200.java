package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a003.A003506;

/**
 * A046200 Odd numbers in the triangle of denominators in Leibniz's Harmonic Triangle.
 * @author Sean A. Irvine
 */
public class A046200 extends A003506 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven()) {
        return t;
      }
    }
  }
}
