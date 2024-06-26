package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055561 Numbers m such that there are precisely 3 groups of order m.
 * @author Sean A. Irvine
 */
public class A055561 extends Sequence1 {

  // After Gheorghe Coserea

  private final Fast mPrime = new Fast();
  private long mN = 74;

  private int sum(final Z[] f, final Z g) {
    int cnt = 0;
    for (final Z t : f) {
      if (Z.ONE.equals(t.mod(g))) {
        ++cnt;
      }
    }
    return cnt;
  }

  private boolean is(final long n) {
    final long p = Functions.GCD.l(n, Functions.PHI.l(n));
    if (mPrime.isPrime(p)) {
      return n % (p * p) == 0 && mPrime.isPrime(Functions.GCD.l(p + 1, n));
    }
    final FactorSequence g = Jaguar.factor(p);
    if (g.omega() != 2) {
      return false;
    }
    final FactorSequence f = Jaguar.factor(n);
    if (!f.isSquareFree()) {
      return false;
    }
    final Z[] gz = g.toZArray();
    final Z[] fz = f.toZArray();
    return Z.ONE.equals(gz[1].mod(gz[0]))
      && 1 == sum(fz, gz[0])
      && 1 == sum(fz, gz[1]);
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
