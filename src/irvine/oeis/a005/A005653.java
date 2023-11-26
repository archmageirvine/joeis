package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005653 Lexicographically least increasing sequence, starting with 2, such that the sum of two distinct terms of the sequence is never a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A005653 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR PHI = SQRT5.add(CR.ONE).divide(CR.TWO);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final CR n = CR.valueOf(++mN);
      final Z k = n.divide(PHI).floor();
      final CR crk = CR.valueOf(k);
      final CR a = n.subtract(PHI.multiply(crk));
      final CR b = crk.add(CR.ONE).multiply(PHI).subtract(n);
      if (a.compareTo(b) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
