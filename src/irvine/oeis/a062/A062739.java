package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A062739 Odd powerful numbers.
 * @author Georg Fischer
 */
public class A062739 extends A001694 {

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.testBit(0)) {
        return result;
      }
    }
  }
}
