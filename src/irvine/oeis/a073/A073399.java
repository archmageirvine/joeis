package irvine.oeis.a073;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073399 Coefficient triangle of polynomials (falling powers) related to convolutions of A001045(n+1), n&gt;=0, (generalized (1,2)-Fibonacci). Companion triangle is A073400.
 * @author Sean A. Irvine
 */
public class A073399 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;
  protected final MemoryFunction1<Polynomial<Z>> mP = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int k) {
      if (k == 0) {
        return Polynomial.create(1);
      }
      // p(k, x) = (x+2)*p(k-1, x+1)+4*(x+2*(k+1))*p(k-1, x)+2*(x+3)*q(k-1, x+1)
      final Polynomial<Z> a = RING.substitute(get(k - 1), RING.onePlusXToTheN(1), Integer.MAX_VALUE);
      final Polynomial<Z> as = RING.add(RING.multiply(a, Z.TWO), a.shift(1));
      final Polynomial<Z> b = RING.multiply(get(k - 1), Z.FOUR);
      final Polynomial<Z> bs = RING.add(RING.multiply(b, Z.valueOf(2L * (k + 1))), b.shift(1));
      final Polynomial<Z> c = RING.substitute(RING.multiply(mQ.get(k - 1), Z.TWO), RING.onePlusXToTheN(1), Integer.MAX_VALUE);
      final Polynomial<Z> cs = RING.add(RING.multiply(c, Z.THREE), c.shift(1));
      return RING.add(as, bs, cs);
    }
  };
  protected final MemoryFunction1<Polynomial<Z>> mQ = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int k) {
      if (k == 0) {
        return Polynomial.create(2);
      }
      // q(k, x) = (x+1)*p(k-1, x+1)+4*(x+2*(k+1))*q(k-1, x)
      final Polynomial<Z> a = RING.substitute(mP.get(k - 1), RING.onePlusXToTheN(1), Integer.MAX_VALUE);
      final Polynomial<Z> as = RING.add(a, a.shift(1));
      final Polynomial<Z> b = RING.multiply(get(k - 1), Z.FOUR);
      final Polynomial<Z> bs = RING.add(RING.multiply(b, Z.valueOf(2L * (k + 1))), b.shift(1));
      return RING.add(as, bs);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mP.get(mN).coeff(mN - mM);
  }
}

