package irvine.oeis.a158;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a061.A061049;

/**
 * A158270 Single-digit numbers in A061049.
 * @author Georg Fischer
 */
public class A158270 extends A061049 {

  @Override
  public Z next() {
    while (true) {
      final Z term = super.next();
      if (term.compareTo(Z.TEN) < 0) {
        return term;
      }
    }
  }
}
