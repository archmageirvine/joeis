package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064736 a(1)=1, a(2)=2; for n&gt;0, a(2*n+2) = smallest number missing from {a(1), ... ,a(2*n)}, and a(2*n+1) = a(2*n)*a(2*n+2).
 * @author Sean A. Irvine
 */
public class A064736 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mUnused = Z.THREE;
  private Z mA = null;
  private boolean mEven = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.TWO;
    } else {
      mEven = !mEven;
      if (mEven) {
        mA = mUnused;
        do {
          mUnused = mUnused.add(1);
        } while (mSeen.remove(mUnused));
      } else {
        mA = mUnused.multiply(mA);
        mSeen.add(mA);
      }
    }
    return mA;
  }
}
