package irvine.oeis.a221;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A221494 Table read by downward diagonals: T(n,k) = number of skeleta of (3+1)-free posets with n clone sets and k tangles.
 * @author Sean A. Irvine
 */
public class A221494 extends AbstractSequence {

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>("x", INNER);
  private int mN = 0;
  private int mM = -1;
  private Polynomial<Polynomial<Z>> mS = RING.one();

  protected A221494(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A221494() {
    this(0);
  }

  protected Polynomial<Polynomial<Z>> gf(final int n, final int m) {
    // WARNING: Calling this function on large n without intervening n likely will not work
    if (n >= mS.degree()) {
      final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, Math.max(n, m));
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>("x", inner);
      final Polynomial<Polynomial<Z>> s2 = ring.multiply(mS, mS, n);
      final Polynomial<Polynomial<Z>> s3 = ring.multiply(s2, mS, n);
      final Polynomial<Polynomial<Z>> c = ring.series(ring.x(), ring.onePlusXToTheN(1), n + 1);
      mS = ring.add(ring.add(ring.one(), ring.multiply(s2, c, n + 1)), PolynomialUtils.innerShift(ring, s3, 1));
    }
    return mS;
  }

  protected Z t(final int n, final int m) {
    return gf(n, m).coeff(n).coeff(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

