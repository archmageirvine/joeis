package irvine.oeis.a329;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A329054 Array read by antidiagonals: T(n,m) is the number of unlabeled bicolored trees with n nodes of one color and m of the other.
 * @author Gregory Morse
 */
public class A329054 extends Sequence0 {
  // After Andrew Howroyd.
  private static final PolynomialRingField<Q> Y = new PolynomialRingField<>(Rationals.SINGLETON);
  private final PolynomialRingField<Polynomial<Q>> mRing = new PolynomialRingField<>(Y);
  private final Polynomial<Polynomial<Q>> mWhite = mRing.empty();
  private final Polynomial<Polynomial<Q>> mBlack = mRing.empty();
  private final Polynomial<Polynomial<Q>> mTrees = mRing.empty();
  private int mN = -1;
  private int mK = 0;

  /** Construct the sequence. */
  public A329054() {
    mWhite.add(Y.zero());
    mBlack.add(Y.zero());
    mTrees.add(Y.zero());
  }

  protected static Polynomial<Polynomial<Q>> euler(final Polynomial<Polynomial<Q>> p) {
    return PolynomialUtils.eulerTransform(Y, p);
  }

  protected final Polynomial<Polynomial<Q>> trees(final int size) {
    while (mTrees.degree() < size) {
      final int n = mTrees.degree() + 1;
      final Polynomial<Q> white = n == 1 ? Y.one() : euler(mBlack).coeff(n - 1);
      final Polynomial<Q> black = n == 1 ? Y.x() : euler(mWhite).coeff(n - 1).shift(1);
      mWhite.add(white);
      mBlack.add(black);
      // A tree rooted at an edge contributes once to each vertex-rooted class.
      Polynomial<Q> both = Y.add(white, black);
      for (int j = 1; j < n; ++j) {
        both = Y.subtract(both, Y.multiply(mWhite.coeff(j), mBlack.coeff(n - j)));
      }
      mTrees.add(both);
    }
    return mTrees;
  }

  protected Z t(final int n, final int m) {
    return n + m == 0 ? Z.ONE : trees(n + m).coeff(n + m).coeff(m).toZ();
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mK, mN - mK);
  }
}
