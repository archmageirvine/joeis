package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078843 Where 3^n occurs in n-almost primes, starting at a(0)=1.
 * @author Sean A. Irvine
 */
public class A078843 extends Sequence0 {

  // After Daniel Suteu

  private final long mBase;
  private Z mT = null;
  private int mN = -1;

  protected A078843(final long base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A078843() {
    this(3);
  }

  private Z f(final Z n, final long m, final long p, final int k, long j) {
    Z c = Z.ZERO;
    final long s = n.divide(m).root(k).longValueExact();
    if (k == 2) {
      for (long q = p; q <= s; q = Functions.NEXT_PRIME.l(q)) {
        c = c.add(Functions.PRIME_PI.z(n.divide(m * q)).subtract(j));
        ++j;
      }
    } else {
      for (long q = p; q <= s; q = Functions.NEXT_PRIME.l(q)) {
        c = c.add(f(n, m * q, q, k - 1, j));
        ++j;
      }
    }
    return c;
  }

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(mBase);
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Functions.PRIME_PI.z(mBase);
    }
    return f(mT, 1, 2, mN, 0);
  }
}
