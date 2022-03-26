package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A086384 Odd digits of e.
 * @author Georg Fischer
 */
public class A086384 extends A001113 {

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
