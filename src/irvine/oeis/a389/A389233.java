package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389233 a(0) = 0 and a(n) = a(n-1) - n if it is &gt; 0 and not already in the sequence, otherwise a(n) = n*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A389233 extends Sequence0 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = mA.subtract(mN);
      if (t.signum() <= 0 || !mUsed.add(t)) {
        mA = mA.multiply(mN).add(1);
      } else {
        mA = t;
      }
    }
    mUsed.add(mA);
    return mA;
  }
}
