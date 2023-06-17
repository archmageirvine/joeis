package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002658 a(0) = a(1) = 1; for n &gt; 0, a(n+1) = a(n)*(a(0) + ... + a(n-1)) + a(n)*(a(n) + 1)/2.
 * @author Sean A. Irvine
 */
public class A002658 extends AbstractSequence {

  /** Construct the sequence. */
  public A002658() {
    super(0);
  }

  private Z mSum = null;
  private Z mPrev = null;


  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    if (mPrev == null) {
      mPrev = Z.ONE;
    } else {
      final Z t = mSum.multiply(mPrev).add(mPrev.multiply(mPrev.add(1)).divide2());
      mSum = mSum.add(mPrev);
      mPrev = t;
    }
    return mPrev;
  }
}
