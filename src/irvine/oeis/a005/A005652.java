package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005652 Sum of 2 terms is never a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A005652 implements Sequence {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR PHI = SQRT5.add(CR.ONE).divide(CR.TWO);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR n = CR.valueOf(++mN);
      final Z a = PHI.multiply(n).ceil(32).multiply2();
      final Z b = SQRT5.multiply(n).ceil(32);
      if (a.subtract(b).longValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
