package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A086396 Even digits of e.
 * @author Georg Fischer
 */
public class A086396 extends A001113 {

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
