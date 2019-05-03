package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A089781 Successive coprime numbers with distinct successive differences: <code>gcd(a(k+1),a(k)) = gcd(a(m+1),a(m)) = 1</code> and <code>a(k+1)-a(k) = a(m+1)-a(m) &lt;==&gt; m=k</code>.
 * @author Sean A. Irvine
 */
public class A089781 implements Sequence {

  private Z mPrev = null;
  private Z mMinDelta = Z.ZERO;
  private final HashSet<Z> mSeenDelta = new HashSet<>();

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ONE;
    } else {
      Z t = mPrev.add(mMinDelta);
      while (true) {
        t = t.add(1);
        if (mPrev.gcd(t).equals(Z.ONE)) {
          final Z d = t.subtract(mPrev);
          if (mSeenDelta.add(d)) {
            if (mMinDelta.add(1).equals(d)) {
              mMinDelta = d;
            }
            mPrev = t;
            break;
          }
        }
      }
    }
    return mPrev;
  }
}
