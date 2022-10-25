package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053461 a(0) = 0; a(n) = a(n-1) - n^2 if positive and new, otherwise a(n) = a(n-1) + n^2.
 * @author Sean A. Irvine
 */
public class A053461 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private final TreeSet<Z> mSeen = new TreeSet<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z t = mA.subtract(mN * mN);
    if (t.signum() > 0 && mSeen.add(t)) {
      mA = t;
      return t;
    }
    mA = mA.add(mN * mN);
    mSeen.add(mA);
    return mA;
  }
}
