package irvine.oeis.a060;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060723 a(n) is the denominator of r(n) where r(n) is the sequence of rational numbers defined by the recursion: r(0) = 0, r(1) = 1 and for n&gt;1 r(n) = r(n-1) + r(n-2)/2. From this definition it is clear that a(n) is always a power of 2 (see A060755).
 * @author Sean A. Irvine
 */
public class A060723 extends Sequence0 implements RationalSequence  {

  private Q mA = null;
  private Q mB = null;

  @Override
  public Q nextQ() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ZERO;
        return mA;
      }
      mB = Q.ONE;
    } else {
      final Q t = mB.add(mA.divide(2));
      mA = mB;
      mB = t;
    }
    return mB;
  }

  @Override
  public Z next() {
    return nextQ().den();
  }
}
