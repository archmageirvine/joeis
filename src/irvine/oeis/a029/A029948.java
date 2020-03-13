package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029948 Smallest prime containing n-th square as substring.
 * @author Sean A. Irvine
 */
public class A029948 implements Sequence {

  private Z mN = Z.NEG_ONE;

  protected int power() {
    return 2;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ZERO.equals(mN)) {
      return Z.valueOf(101); // So we don't have to worry about leading 0's elsewhere
    }
    final String s = mN.pow(power()).toString();
    int extraDigits = 1;
    long min = 10;
    long max = 100;
    while (true) {
      Z bestPrime = null;
      for (long extension = min; extension < max; ++extension) {
        final boolean excluded = (extension & 1) == 0 || extension % 5 == 0;
        final String e = Long.toString(extension); // Note contains leading 1 which is to be ignored
        for (int left = 0; left <= extraDigits; ++left) {
          if (left != extraDigits && excluded) {
            continue;
          }
          final Z candidate = new Z(e.substring(1, left + 1) + s + e.substring(left + 1));
          if ((bestPrime == null || candidate.compareTo(bestPrime) < 0) && candidate.isProbablePrime()) {
            bestPrime = candidate;
          }
        }
      }
      if (bestPrime != null) {
        return bestPrime;
      }

      // Move to the next longer number of digits
      ++extraDigits;
      min = max;
      max *= 10L;
    }
  }
}
