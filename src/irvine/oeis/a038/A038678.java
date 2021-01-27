package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038678 Squares ending in a different nonzero square.
 * @author Sean A. Irvine
 */
public class A038678 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      // Efficiency, any cube ending with 1, 4, or 9
      final long r = n2.mod(10);
      if (r == 1 || r == 4 || r == 9) {
        return n2;
      }
      final String s = n2.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero() && t.sqrtAndRemainder()[1].isZero()) {
          return n2;
        }
      }
    }
  }
}
