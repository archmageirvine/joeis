package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085910 a(n) = smallest prime(k) not equal to prime(n) and not included earlier, such that A001223(k) = A001223(n); i.e., prime(k+1) - prime(k) = prime(n+1) - prime(n); or 0 is no such prime exists.
 * @author Sean A. Irvine
 */
public class A085910 extends A000040 {

  private final HashSet<Z> mUsed = new HashSet<>();

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ZERO;
    }
    final Z t = mPrime.nextPrime(p).subtract(p);
    Z q = Z.TWO;
    while (true) {
      q = mPrime.nextPrime(q);
      if (!q.equals(p) && !mUsed.contains(q) && mPrime.nextPrime(q).subtract(q).equals(t)) {
        mUsed.add(q);
        return q;
      }
    }
  }
}
