package irvine.oeis.a063;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063733 A variant of Recam\u00e1n's sequence: a(0)=1, a(n) = a(n-1)-(n-1) if positive and new, else a(n) = a(n-1)+(n-1).
 * @author Sean A. Irvine
 */
public class A063733 extends Sequence0 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mA.subtract(++mN);
      if (t.signum() > 0 && !mSeen.contains(t)) {
        mA = t;
      } else {
        mA = mA.add(mN);
      }
    }
    mSeen.add(mA);
    return mA;
  }
}
