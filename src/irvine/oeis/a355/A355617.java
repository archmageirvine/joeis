package irvine.oeis.a355;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A355617 a(1) = 1; a(2) = 2; for n &gt; 2, a(n) = R(a(n-1)) if a(n-1) != R(a(n-2)) and R(a(n-1)) has not yet been used, where R is the digit reversal function A004086, otherwise a(n) is the smallest positive integer &gt; a(n-1) that has not yet been used.
 * @author Sean A. Irvine
 */
public class A355617 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mSeen.add(Z.ONE);
        mA = Z.ONE;
        return Z.ONE;
      }
      mSeen.add(Z.TWO);
      mB = Z.TWO;
      return Z.TWO;
    }
    if (!mB.equals(ZUtils.reverse(mA))) {
      final Z r = ZUtils.reverse(mB);
      if (mSeen.add(r)) {
        mA = mB;
        mB = r;
        return r;
      }
    }
    Z k = mB;
    while (true) {
      k = k.add(1);
      if (mSeen.add(k)) {
        mA = mB;
        mB = k;
        return k;
      }
    }
  }
}

// a(1) = 1; a(2) = 2; for n > 2, a(n) = R(a(n-1)) if a(n-1) != R(a(n-2)) and R(a(n-1)) has not yet been used, where R is the digit reversal function A004086, otherwise a(n) is the smallest positive integer > a(n-1) that has not yet been used.
