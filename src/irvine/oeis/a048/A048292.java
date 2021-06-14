package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048292 1-digit terms in the continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A048292 extends A001203 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(Z.TEN) < 0) {
        return t;
      }
    }
  }
}
