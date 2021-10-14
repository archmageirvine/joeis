package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051935 a(n) = smallest number &gt; a(n-1) such that a(1) + a(2) + ... + a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A051935 implements Sequence {

  private Z mPrev = Z.ZERO;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mPrev);
    do {
      mPrev = mPrev.add(1);
      mSum = mSum.add(1);
    } while (!mSum.isProbablePrime());
    return mPrev;
  }
}
