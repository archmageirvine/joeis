package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A036896 Odd refactorable numbers.
 * @author Sean A. Irvine
 */
public class A036896 extends A033950 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!n.isEven()) {
        return n;
      }
    }
  }
}
