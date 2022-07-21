package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A058048 For each prime P consider the generalized Collatz sequence of each integer N &gt; 1 defined by c(0) = N, c(m+1) = c(m) * P + 1 if F &gt; P, else c(m+1) = c(m) / F, where F is the smallest factor of c(m), until the sequence cycles. If all c(i) &gt; 1 for some starting number N then P belongs to the sequence (and vice versa).
 * @author Sean A. Irvine
 */
public class A058048 extends A058047 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mVerbose) {
        StringUtils.message("Testing: " + mP);
      }
      if (!is(mP)) {
        return mP;
      }
    }
  }
}
