package irvine.oeis.a093;

import irvine.math.MemoryFunction1;
import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072123 Remainder when Fibonacci(n) is divided by prime(n).
 * @author Sean A. Irvine
 */
public class A093614 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));
  private int mN = 4;
  private final MemoryFunction1<Polynomial<Z>> mF = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n <= 0) {
        return RING.zero();
      } else if (n == 1) {
        return RING.one();
      } else {
        return RING.subtract(get(n - 1).shift(1), get(n - 2));
      }
    }
  };

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> t = mF.get(++mN);
      if (!RING.gcd(t, RING.substitute(t, RING.oneMinusXToTheN(1), Integer.MAX_VALUE)).equals(RING.one())) {
        return Z.valueOf(mN);
      }
    }
  }
}
