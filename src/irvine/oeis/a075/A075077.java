package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075077 a(1) =1 and then the smallest number not occurring earlier such that a(n)+a(n+1) gives a different composite number (not obtained earlier).
 * @author Sean A. Irvine
 */
public class A075077 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final HashSet<Z> mSeenComposites = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(1L);
      return mA;
    }
    long k = 0;
    while (true) {
      final Z t = mA.add(++k);
      if (!t.isProbablePrime() && !mSeenComposites.contains(t) && mUsed.add(k)) {
        mA = Z.valueOf(k);
        mSeenComposites.add(t);
        return mA;
      }
    }
  }
}

