package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A094096 Min{m: <code>n =</code> Sum((m <code>mod (1+k*L(n)!))*2^(k-1)</code>: <code>1&lt;=k&lt;=L(n))}</code>, where <code>L(n) =</code> length of binary representation of n, cf. A070939, A000142.
 * @author Sean A. Irvine
 */
public class A094096 implements Sequence {

  private static final long[] FACTORIAL = new long[21];
  static {
    long f = 1;
    for (int k = 1; k < FACTORIAL.length; ++k) {
      f *= (long) k;
      FACTORIAL[k] = f;
    }
  }

  static long lg(final long x) {
    return (Double.doubleToLongBits((double) x) >>> 52) - 1023;
  }

  private boolean isValid(final long m, final long n) {
    final long l = 1 + lg(n);
    final long f = FACTORIAL[(int) l];
    //    System.out.println("m=" + m + " n="+n + " L(n)=" + l + " L(n)!=" + f);
    long s = 0;
    for (long k = 1; k <= l; ++k) {
      s += (m % (1 + k * f)) << (k - 1);
      if (s > n) {
        return false;
      }
    }
    return s == n;
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (!isValid(++m, mN)) {
    }
    return Z.valueOf(m);
  }

}

