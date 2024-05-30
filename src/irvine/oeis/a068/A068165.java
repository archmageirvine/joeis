package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068165 Smallest square formed from n by inserting zero or more decimal digits.
 * @author Sean A. Irvine
 */
public class A068165 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n, long s) {
    while (n > 0) {
      if (s < n) {
        return false;
      }
      if (n % 10 == s % 10) {
        n /= 10;
      }
      s /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long k = Functions.SQRT.l(mN);
    while (true) {
      if (is(mN, k * k)) {
        return Z.valueOf(k * k);
      }
      ++k;
    }
  }
}
