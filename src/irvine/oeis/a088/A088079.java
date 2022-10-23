package irvine.oeis.a088;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A088079 Diagonal T(n,n) of the triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, in which row n contains n+1 consecutive integers T(n,k+1)=T(n,k)+1 such that T(n,k) is divisible by a k-th power.
 * @author Sean A. Irvine
 */
public class A088079 extends Sequence0 {

  protected int mN = -1;
  private long mPrev = 0;

  private boolean cascade(final long candidate, final int power) {
    if (power <= 1) {
      return true;
    }
    final int exp = Jaguar.factor(candidate).maxExponent();
    return exp >= power && cascade(candidate - 1, power - 1);
  }

  @Override
  public Z next() {
    ++mN;
    long v = Math.max(mN + 1, mPrev - 1);
    while (true) {
      if (cascade(v, mN)) {
        mPrev = v;
        return Z.valueOf(v);
      }
      ++v;
    }
  }
}

