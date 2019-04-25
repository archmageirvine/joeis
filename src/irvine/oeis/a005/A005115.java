package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005115 Let <code>i,</code> i+d, i+2d, <code>...,</code> i+(n-1)d be an n-term arithmetic progression of primes; choose the one which minimizes the last term; then <code>a(n) =</code> last term i+(n-1)d.
 * @author Sean A. Irvine
 */
public class A005115 implements Sequence {

  private Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z t = mN <= 1 ? Z.ONE : Z.TWO;
      for (Z m = t; m.multiply(mN).compareTo(mP) < 0; m = m.add(t)) {
        Z p = mP;
        boolean ok = true;
        for (long j = 0; j < mN; ++j) {
          p = p.subtract(m);
          if (!mPrime.isPrime(p)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mP;
        }
      }
    }
  }
}

