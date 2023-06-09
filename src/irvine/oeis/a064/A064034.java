package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064034 2-dimensional table T(i, j) defined for any integers i and j, read by antidiagonals in the southeast quadrant. T(i, j) gives the "Fibonacci depth" of (i, j): form the Fibonacci sequence starting with i, j: w(0) = i, w(1) = j, w(n) = w(n-1) + w(n-2). It can be shown that for all but finitely many n, the w(n) have the same sign, i.e., are all positive, all negative or all zero. T(i, j), is the smallest number of iterations required to find out which of these cases holds.
 * @author Sean A. Irvine
 */
public class A064034 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private long t(final long n, final long m) {
    Z a = Z.valueOf(n);
    Z b = Z.valueOf(m);
    long cnt = -1;
    do {
      ++cnt;
      final Z t = a.add(b);
      a = b;
      b = t;
    } while (a.signum() != b.signum());
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN, -mM));
  }
}
