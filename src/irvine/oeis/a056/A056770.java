package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A056770 Smallest number that is n times the product of its digits or 0 if impossible.
 * @author Sean A. Irvine
 */
public class A056770 implements Sequence {

  // WARNING: Do not use this to extend the sequence.

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
    } while (ZUtils.digitProduct(k) * mN != k && k < HEURISTIC_MULTIPLIER * mMax);
    if (k < HEURISTIC_MULTIPLIER * mMax) {
      if (k > mMax) {
        mMax = k;
      }
      return Z.valueOf(k);
    }
    return Z.ZERO;
  }
}
