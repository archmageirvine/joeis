package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A056770 Smallest number that is n times the product of its digits or 0 if impossible.
 * @author Sean A. Irvine
 */
public class A056770 extends Sequence1 implements Conjectural {


  private static final long HEURISTIC_MULTIPLIER = 1000;
  private long mN = 0;
  private long mMax = 1;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    long k = 0;
    do {
      k += mN;
    } while (Functions.DIGIT_PRODUCT.l(k) * mN != k && k < HEURISTIC_MULTIPLIER * mMax);
    if (k < HEURISTIC_MULTIPLIER * mMax) {
      if (k > mMax) {
        mMax = k;
      }
      return Z.valueOf(k);
    }
    return Z.ZERO;
  }
}
