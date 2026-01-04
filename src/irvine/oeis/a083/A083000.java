package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083000 Values of x for which 9y^2 = x^2 + 2xy - 2x has integer solutions with positive y.
 * @author Sean A. Irvine
 */
public class A083000 extends Sequence1 {

  private long mY = 0;

  @Override
  public Z next() {
    while (true) {
      final Z d = Z.valueOf(++mY).multiply(10).subtract(2).multiply(mY).add(1);
      final Z[] s = d.sqrtAndRemainder();
      if (s[1].isZero()) {
        return s[0].add(1).subtract(mY);
      }
    }
  }
}
