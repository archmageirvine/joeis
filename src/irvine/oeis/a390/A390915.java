package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A390915 Number of n-adic integer solutions of y^(2*n - 1) = y in Z_n.
 * @author Sean A. Irvine
 */
public class A390915 extends Sequence2 {

  // After Marco Rip&agrave;

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    long r = 1;
    if ((mN & 1) == 0) {
      r = 3;
      m = Functions.MAKE_ODD.l(m);
    }
    long p = 3;
    while (p * p <= m) {
      if (m % p == 0) {
        r *= p;
        while (m % p == 0) {
          m /= p;
        }
      }
      p = Functions.NEXT_PRIME.l(p);
    }
    if (m > 1) {
      r *= m;
    }
    return Z.valueOf(r);
  }
}
