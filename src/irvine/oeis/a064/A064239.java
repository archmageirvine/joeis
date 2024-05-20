package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064239 Values of m such that N=(am+1)(bm+1)(cm+1) is a 3-Carmichael number (A087788), where a,b,c = 1,2,5.
 * @author Sean A. Irvine
 */
public class A064239 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private final long mA;
  private final long mB;
  private final long mC;

  protected A064239(final long a, final long b, final long c) {
    mA = 6 * a;
    mB = 6 * b;
    mC = 6 * c;
  }

  /** Construct the sequence. */
  public A064239() {
    this(1, 2, 5);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = Z.valueOf(mA * mN + 1);
      if (mPrime.isPrime(a)) {
        final Z b = Z.valueOf(mB * mN + 1);
        if (mPrime.isPrime(b)) {
          final Z c = Z.valueOf(mC * mN + 1);
          if (mPrime.isPrime(c)) {
            final Z t = a.multiply(b).multiply(c);
            if (t.mod(Functions.CARMICHAEL_LAMBDA.z(t)).equals(Z.ONE)) {
              return Z.valueOf(6 * mN);
            }
          }
        }
      }
    }
  }
}
