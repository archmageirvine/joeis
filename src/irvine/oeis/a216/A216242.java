package irvine.oeis.a216;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A216242 Triangular array read by rows: T(n,k) is the number of functions f:{1,2,...,n}-&gt;{1,2,...,n} with a height of k; n&gt;=1, 0&lt;=k&lt;=n-1.
 * @author Gregory Morse
 */
public class A216242 extends Triangle {
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mSize = -1;
  private Z[] mRow;

  /** Construct the sequence. */
  public A216242() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    if (n != mSize) {
      mSize = n;
      mRow = new Z[n + 1];
      Polynomial<Q> trees = RING.zero();
      Q previous = Q.ZERO;
      final Z fac = Functions.FACTORIAL.z(n + 1);
      for (int h = 0; h <= n; ++h) {
        trees = RING.exp(trees, n).shift(1);
        final Q count = RING.coeff(RING.one(), RING.subtract(RING.one(), trees), n + 1);
        mRow[h] = count.subtract(previous).multiply(fac).toZ();
        previous = count;
      }
    }
    return mRow[k];
  }
}
