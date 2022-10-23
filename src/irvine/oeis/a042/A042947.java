package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A042947 Gilda's numbers: numbers k such that if a Fibonacci sequence is formed with first term = a certain absolute value between decimal digits in k (A007953) and second term = sum of decimal digits in k (A040997), then k itself occurs as a term in the sequence.
 * @author Sean A. Irvine
 */
public class A042947 extends Sequence1 {

  private long mN = -1;

  private static boolean contains(long a, long b, final long n) {
    do {
      final long t = a + b;
      a = b;
      b = t;
    } while (b < n);
    return b == n;
  }

  @Override
  public Z next() {
    while (true) {
      final long b = ZUtils.digitSum(++mN);
      long m = mN;
      long a = 0;
      while (m != 0) {
        final long r = m % 10;
        m /= 10;
        if (m == 0) {
          a += r;
        } else {
          a -= r;
        }
      }
      if (contains(Math.abs(a), b, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
