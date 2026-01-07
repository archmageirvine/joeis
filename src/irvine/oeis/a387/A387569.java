package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A387569 a(n) is the smallest positive integer y such that there exists an integer x such that binomial(x + i*y, n) is a Gaussian integer.
 * @author Sean A. Irvine
 */
public class A387569 extends Sequence1 {

  // After Michel Marcus

  private static final GaussianIntegers RING = GaussianIntegers.SINGLETON;
  private long mN = 0;

  private boolean binomialIsInteger(final Zi x, final long n) {
    Zi prod = Zi.ONE;
    for (long j = 0; j < n; ++j) {
      prod = RING.multiply(prod, RING.subtract(x, RING.coerce(j)));
    }
    final Zi f = RING.coerce(Functions.FACTORIAL.z(n));
    final Zi d = RING.divide(prod, f);
    return d.multiply(f).equals(prod);
  }

  private boolean is(final long n, final long b) {
    for (long a = 0; a <= b; ++a) {
      if (binomialIsInteger(new Zi(a, b), n)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long b = 0;
    while (true) {
      if (is(mN, ++b)) {
        return Z.valueOf(b);
      }
    }
  }
}
