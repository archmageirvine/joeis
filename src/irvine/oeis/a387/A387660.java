package irvine.oeis.a387;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387660 a(0) = 0; thereafter a(n) = a(n-1) - n if a(n-1) &gt; 2*n and not already in the sequence, otherwise a(n) = a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A387660 extends Sequence0 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t;
      if (mA.compareTo(2 * mN) > 0 && !mUsed.contains(t = mA.subtract(mN))) {
        mA = t;
      } else {
        mA = mA.add(mN);
      }
    }
    mUsed.add(mA);
    return mA;
  }
}

