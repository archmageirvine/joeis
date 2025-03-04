package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a072.A072568;

/**
 * A075688 Pair sums are even interprimes.
 * @author Sean A. Irvine
 */
public class A075688 extends A072568 {

  private final HashSet<Z> mEvenInterprimes = new HashSet<>();
  private Z mLast = Z.ZERO;
  protected Z mN = Z.TWO;
  protected final ArrayList<Z> mA = new ArrayList<>();

  private boolean isEvenInterprime(final Z v) {
    while (v.compareTo(mLast) >= 0) {
      mLast = super.next();
      mEvenInterprimes.add(mLast);
    }
    return mEvenInterprimes.contains(v);
  }

  private boolean is(final Z cand) {
    for (final Z v : mA) {
      if (!isEvenInterprime(cand.add(v))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (is(mN)) {
        mA.add(mN);
        return mN;
      }
    }
  }
}
