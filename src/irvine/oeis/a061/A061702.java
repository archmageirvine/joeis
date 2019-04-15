package irvine.oeis.a061;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A061702 Triangle <code>T(n,k)</code> defined by Sum_{n <code>&gt;= 0</code>,m <code>&gt;= 0} T(n</code>,m)*x^m*y^n <code>= 1 +</code> y*(1 <code>+ 3*x -</code> 4*x^2*y - 3*x^2*y^2 - 3*x^3*y^2 + 4*x^4*y^3)/((1 - y - 2*x*y - x*y^2 + x^3*y^3)*(1 - x*y)).
 * @author Sean A. Irvine
 */
public class A061702 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  // The core of this sequence is defined by a bivariate generating function
  // with the following structure
  // Numerator:   y + 3*x*y - 4*x^2*y^2 - 3*x^2*y^3 - 3*x^3*y^3 + 4*x^4*y^4
  // Denominator: 1 - 3*x*y - y + 2*x^2*y^2 + x^2*y^3 + x^3*y^3 - x^4*y^4

  private static final ArrayList<Polynomial<Z>> NUM = new ArrayList<>();
  static {
    NUM.add(RING.zero());                       // y^0
    NUM.add(Polynomial.create(1, 3));           // y^1
    NUM.add(Polynomial.create(0, 0, -4));       // y^2
    NUM.add(Polynomial.create(0, 0, -3, -3));   // y^3
    NUM.add(Polynomial.create(0, 0, 0, 0, 4));  // y^4
  }

  private static final ArrayList<Polynomial<Z>> DEN = new ArrayList<>();
  static {
    DEN.add(RING.one());                        // y^0
    DEN.add(Polynomial.create(-1, -3));         // y^1
    DEN.add(Polynomial.create(0, 0, 2));        // y^2
    DEN.add(Polynomial.create(0, 0, 1, 1));     // y^3
    DEN.add(Polynomial.create(0, 0, 0, 0, -1)); // y^4
  }

  private static final ArrayList<Polynomial<Z>> CACHE = new ArrayList<>();

  // Expand as a series in y
  private static void expand(final int n) {
    // cf. Taylor series expansion in Rational class
    for (int k = CACHE.size(); k <= n; ++k) {
      Polynomial<Z> s = k >= NUM.size() ? RING.zero() : NUM.get(k);
      for (int j = Math.max(0, k - DEN.size() + 1); j < k; ++j) {
        s = RING.subtract(s, RING.multiply(CACHE.get(j), DEN.get(k - j)));
      }
      CACHE.add(s); // strictly this shoud be s/DEN[0], but DEN[0]==1
    }
  }

  /**
   * Compute the coefficient of <code>x^n * y^k</code> in
   * <pre>
   * y + 3*x*y - 4*x^2*y^2 - 3*x^2*y^3 - 3*x^3*y^3 + 4*x^4*y^4
   * ---------------------------------------------------------
   *  1 - 3*x*y - y + 2*x^2*y^2 + x^2*y^3 + x^3*y^3 - x^4*y^4
   * </pre>
   *
   * @param n power of x
   * @param k power of y
   * @return polynomial coefficient
   */
  public static Z t(final int n, final int k) {
    // some simple boundary cases
    if (k == 0) {
      return Z.ONE;
    }
    if (n <= 0 || k > n) {
      return Z.ZERO;
    }
    // t_{n,k} is coefficient of x^n * y^k in t(x, y)
    expand(n);
    return CACHE.get(n).coeff(k);
  }

  private int mN = -1;
  private int mPos = 0;

  @Override
  public Z next() {
    if (mPos > mN) {
      ++mN;
      mPos = 0;
    }
    return t(mN, mPos++);
  }
}
