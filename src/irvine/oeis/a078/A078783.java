package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078783 a(0) = 0; a(1)=1; for n&gt;1, a(n) = least positive integer m not among a(1),...,a(n-1) such that |m-a(n-1)| &gt; |a(n-1)-a(n-2)|.
 * @author Sean A. Irvine
 */
public class A078783 extends Sequence0 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;
  private Z mLeastUnused = Z.TWO;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    Z k = mLeastUnused;
    while (true) {
      if (k.subtract(mB).abs().compareTo(mB.subtract(mA).abs()) > 0) {
        mA = mB;
        mB = k;
        mUsed.add(k);
        return k;
      }
      k = k.add(1);
    }
  }
}

