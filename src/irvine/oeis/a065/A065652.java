package irvine.oeis.a065;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065652 a(0) = 0 and a(n+1) = if a(n) - 1 is new and &gt; 0 then a(n) - 1 else a(n)*a(n) + 1 for n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A065652 extends Sequence0 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return mA;
    }
    final Z t = mA.subtract(1);
    if (t.signum() > 0 && mSeen.add(t)) {
      mA = t;
    } else {
      mA = mA.square().add(1);
      mSeen.add(mA);
    }
    return mA;
  }
}
