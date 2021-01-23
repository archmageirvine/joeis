package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A036907 Square refactorable numbers.
 * @author Sean A. Irvine
 */
public class A036907 extends A033950 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z[] s = n.sqrtAndRemainder();
      if (s[1].isZero()) {
        return n;
      }
    }
  }
}
