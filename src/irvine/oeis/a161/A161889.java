package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161889 a(1)=2. a(n) = the smallest integer &gt; a(n-1) that is coprime to n, and is such that (a(n)-a(n-1)) is not a divisor of n.
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

