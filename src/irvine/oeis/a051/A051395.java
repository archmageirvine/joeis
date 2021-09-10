package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051395 Numbers whose square is a sum of 4 consecutive primes.
 * @author Sean A. Irvine
 */
public class A051395 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = super.next();
      final Z sum = t.add(mA).add(mB).add(mC);
      if (sum.isSquare()) {
        return sum.sqrt();
      }
    }
  }
}
