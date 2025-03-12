package irvine.oeis.a125;

import irvine.math.MemoryFunction2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A125183 Triangle read by rows: T(n,k) is the number of permutations p of {1,2,...,n} such that the set {|p(i)-i|, i=1,2,...,n} has exactly k elements (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A125183 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunction2<Z, Polynomial<Z>> mB = new MemoryFunction2<>() {
    @Override
    protected Polynomial<Z> compute(final Z p, final Z s) {
      if (p.isZero()) {
        return RING.monomial(Z.ONE, s.bitCount());
      }
      Polynomial<Z> sum = RING.zero();
      for (int k = 0; k < p.bitLength(); ++k) {
        if (p.testBit(k)) {
          sum = RING.add(sum, mB.get(p.clearBit(k), s.setBit(Math.abs(k - p.bitCount()))));
        }
      }
      return sum;
    }
  };

  /**
   * Return an element of the triangle.
   * @param n row
   * @param m column
   * @return value
   */
  public Z t(final int n, final int m) {
    return mB.get(Z.ONE.shiftLeft(n + 1).subtract(2), Z.ZERO).coeff(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
