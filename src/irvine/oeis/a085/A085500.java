package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085500 Indices of primes where nondecreasing gaps occur.
 * @author Sean A. Irvine
 */
public class A085500 extends A000040 {

  private Z mGap = Z.ZERO;
  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z prev = mP;
      final Z t = super.next().subtract(prev);
      if (t.compareTo(mGap) >= 0) {
        mGap = t;
        return Z.valueOf(mN);
      }
    }
  }
}
