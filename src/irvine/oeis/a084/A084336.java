package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084336 a(n) is the smallest composite number not already in the sequence such that the absolute values of the successive differences are distinct primes.
 * @author Sean A. Irvine
 */
public class A084336 extends Sequence0 {

  private Z mA = null;
  private final HashSet<Z> mUsed = new HashSet<>();
  private final HashSet<Z> mForbiddenDiffs = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else {
      Z k = Z.FIVE;
      while (true) {
        k = k.add(1);
        if (!k.isProbablePrime() && !mUsed.contains(k)) {
          final Z f = mA.subtract(k).abs();
          if (f.isProbablePrime() && mForbiddenDiffs.add(f)) {
            mA = k;
            break;
          }
        }
      }
    }
    mUsed.add(mA);
    return mA;
  }
}
