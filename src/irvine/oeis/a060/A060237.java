package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060237 <code>a(n) = n!^2 *</code> Sum_{m=1..n}( Sum_{k=1..m} 1/(k*m) ).
 * @author Sean A. Irvine
 */
public class A060237 implements Sequence {

  private Z mPrev = Z.ZERO;
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z f = mF.multiply(mN);
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(f.divide(k));
    }
    s = s.multiply(mF);
    mF = f;
    mPrev = s.add(mPrev.multiply(mN * mN));
    return mPrev;
  }
}

