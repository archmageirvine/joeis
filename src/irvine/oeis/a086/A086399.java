package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A086399 Even digits of Pi.
 * @author Georg Fischer
 */
public class A086399 extends A000796 {

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isEven()) {
        return result;
      }
    }
  }
}
