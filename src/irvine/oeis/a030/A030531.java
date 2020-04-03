package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030531 Value of <code>3^x - 2^x - 5</code> for the solutions of <code>3^x - 2^x == 5 (mod 7)</code>.
 * @author Sean A. Irvine
 */
public class A030531 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(3);
      mB = mB.multiply2();
      final Z t = mA.subtract(mB).subtract(5);
      if (t.mod(7) == 0) {
        return t;
      }
    }
  }
}
