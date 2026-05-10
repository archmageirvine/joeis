package irvine.oeis.a391;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391119 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A391119 extends A000040 {

  // todo this is not yet correct

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    long j = 0;
    Z q = Z.ONE;
//    long j = mN;
//    Z q = p;
    final HashSet<Q> seen = new HashSet<>();
    while (true) {
      q = mPrime.nextPrime(q);
      if (++j != mN) {
        final Q slope = new Q(mP.subtract(q), mN - j).abs();
        if (!seen.add(slope)) {
          return Z.valueOf(Math.abs(j - mN));
        }
      }
    }
  }
}

