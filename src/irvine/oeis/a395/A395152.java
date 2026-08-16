package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A395152 Exponent k such that the largest alternating-digital-root number in base n (A397879) equals r^k.
 * @author Sean A. Irvine
 */
public class A395152 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z best = Z.ONE;
    long bestK = 1;
    for (long r = 1; r < mN; ++r) {
      long k = 1;
      while (true) {
        final Z m = Z.valueOf(r).pow(k);
        final long l = Functions.DIGIT_LENGTH.l(mN, m);
        if (l < k) {
          break;
        }
        if (m.mod(mN + 1) == r && m.compareTo(best) > 0) {
          best = m;
          bestK = k;
        }
        ++k;
      }
    }
    return Z.valueOf(bestK);
  }
}
