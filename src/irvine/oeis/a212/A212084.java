package irvine.oeis.a212;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a384.A384968;

/**
 * A212084 Triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=2n, read by rows: row n gives the coefficients of the chromatic polynomial of the complete bipartite graph K_(n,n), highest powers first.
 * @author Gregory Morse
 */
public class A212084 extends A384968 {
  private final int mParts;
  private int mN = -1;
  private int mK = 0;
  private Polynomial<Z> mPolynomial;

  protected A212084(final int parts) {
    super(parts);
    mParts = parts;
    setOffset(0);
  }

  /** Construct the sequence. */
  public A212084() {
    this(2);
  }

  protected Polynomial<Z> counts(final int n) {
    return RING.pow(block(n), mParts);
  }

  protected final Polynomial<Z> chromatic(final int n) {
    Polynomial<Z> result = RING.zero();
    Polynomial<Z> falling = RING.one();
    final Polynomial<Z> counts = counts(n);
    for (int k = 0; k <= counts.degree(); ++k) {
      result = RING.add(result, RING.multiply(falling, counts.coeff(k)));
      falling = RING.multiply(falling, RING.subtract(RING.x(), RING.monomial(Z.valueOf(k), 0)));
    }
    return result;
  }

  protected static Z colorings(final Polynomial<Z> counts, final int colors) {
    Z sum = Z.ZERO;
    Z falling = Z.ONE;
    for (int k = 0; k <= counts.degree() && !falling.isZero(); ++k) {
      sum = sum.add(falling.multiply(counts.coeff(k)));
      falling = falling.multiply((long) colors - k);
    }
    return sum;
  }

  protected static Z orientations(final int... parts) {
    Polynomial<Z> counts = RING.one();
    for (final int k : parts) {
      counts = RING.multiply(counts, block(k));
    }
    return colorings(counts, -1).abs();
  }

  @Override
  public Z next() {
    if (++mK > mParts * mN) {
      ++mN;
      mK = 0;
      mPolynomial = chromatic(mN);
    }
    return mPolynomial.coeff(mParts * mN - mK);
  }
}
