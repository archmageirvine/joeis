package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062518 Conjectural largest exponent k such that n^k does not contain all of the digits 0 through 9 (in decimal notation) or 0 if no such k exists (for example if n is a power of 10).
 * @author Sean A. Irvine
 */
public class A062518 extends Sequence1 {

  private static final int HEURISTIC = 100;
  private long mN = 0;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10;
      return Z.ZERO; // powers of 10 are 0
    }
    long prevMax = 0;
    long k = 0;
    Z nk = Z.ONE;
    while (prevMax + HEURISTIC >= k) {
      ++k;
      nk = nk.multiply(mN);
      if (Functions.SYNDROME.i(nk) != 0b1111111111) {
        prevMax = k;
      }
    }
    return Z.valueOf(prevMax);
  }
}
