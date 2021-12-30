package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A086385 Odd digits of Pi.
 * @author Georg Fischer
 */
public class A086385 extends A000796 {

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isOdd()) {
        return result;
      }
    }
  }
}
