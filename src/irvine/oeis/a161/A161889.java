package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161889 <code>a(1)=2. a(n) =</code> the smallest integer <code>&gt; a(n-1)</code> that is coprime to n, and is such that <code>(a(n)-a(n-1))</code> is not a divisor of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A161889 implements Sequence {

  private Z mPrev = null;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mPrev == null) {
      mPrev = Z.TWO;
    } else {
      Z g = mPrev;
      final Z n = Z.valueOf(mN);
      long q = 0;
      while (true) {
        g = g.add(1);
        ++q;
        if (g.gcd(n).equals(Z.ONE) && mN % q != 0) {
          mPrev = g;
          break;
        }
      }
    }
    return mPrev;
  }
}

