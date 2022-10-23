package irvine.oeis.a137;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A137698 a(1)=2. a(n) = the smallest integer &gt; a(n-1) that is not in sequence A137699. A137699(n) = the smallest integer &gt; A137698(n) and not coprime to A137698(n). (A137699(n) = A137698(n) + smallest prime dividing A137698(n).).
 * @author Sean A. Irvine
 */
public class A137698 extends Sequence1 {

  private Z mPrev = null;
  protected Z mLastK = null;
  private final HashSet<Z> mA137699 = new HashSet<>();

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.TWO;
    } else {
      do {
        mPrev = mPrev.add(1);
      } while (mA137699.contains(mPrev));
    }
    Z k = mPrev;
    do {
      k = k.add(1);
    } while (Z.ONE.equals(mPrev.gcd(k)));
    mA137699.add(k);
    mLastK = k;
    return mPrev;
  }
}

