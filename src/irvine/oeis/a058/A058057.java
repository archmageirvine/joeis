package irvine.oeis.a058;

import java.util.ArrayList;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058057 Triangle giving coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A058057 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private static final ArrayList<Polynomial<Z>> CACHE = new ArrayList<>();

  /**
   * Return an element from the triangle defining these menage polynomials.
   *
   * @param n row
   * @param m column
   * @return value
   */
  public static Z t(final int n, final int m) {
    while (n >= CACHE.size()) {
      Polynomial<Z> s = RING.zero();
      final int nn = CACHE.size();
      for (int k = 0; k <= nn; ++k) {
        s = RING.add(s, RING.multiply(RING.pow(Polynomial.create(-1, 1), k),
                  FACTORIAL.factorial(nn - k).multiply(Binomial.binomial(2L * nn - k, k))));
      }
      CACHE.add(s);
    }
    return CACHE.get(n).coeff(n - m);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM++);
  }
}
