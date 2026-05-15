package irvine.oeis.a391;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391119 a(n) is the involvement delay of prime(n) in A390812.
 * @author Sean A. Irvine
 */
public class A391119 extends A000040 {

  // After Ruud H.G. van Tol

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    long k = mN;
    Z q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      ++k;
      final Q slope = new Q(q.subtract(p), k - mN);
      for (long j = 1, r = 2; j < k; ++j, r = mPrime.nextPrime(r)) {
        if (j != mN && new Q(q.subtract(r), k - j).equals(slope)) {
          return Z.valueOf(k - mN);
        }
      }
    }
  }
}

