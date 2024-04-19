package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004307 Number of permutations p of [n] such that (n-p(i)+i) mod n &gt;= 4 for all i.
 * @author Sean A. Irvine
 */
public class A004307 extends AbstractSequence {

  /** Construct the sequence. */
  public A004307() {
    super(4);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final ArrayList<Polynomial<Z>> Y = new ArrayList<>();

  static {
    final Polynomial<Z> y = Polynomial.create(-1, 1);
    Y.add(RING.one());
    for (int k = 1; k <= 8; ++k) {
      Y.add(RING.multiply(Y.get(k - 1), y));
    }
  }
  private final ArrayList<Polynomial<Z>> mHitPolynomials = new ArrayList<>();
  {
    mHitPolynomials.add(RING.zero());
    mHitPolynomials.add(RING.zero());
    mHitPolynomials.add(RING.zero());
    mHitPolynomials.add(RING.zero());
    mHitPolynomials.add(Polynomial.create(0, 0, 0, 0, 24));
    mHitPolynomials.add(Polynomial.create(1, 0, 10, 20, 45, 44));
    mHitPolynomials.add(Polynomial.create(2, 24, 60, 152, 210, 192, 80));
    mHitPolynomials.add(Polynomial.create(31, 154, 595, 980, 1421, 1106, 609, 144));
    mHitPolynomials.add(Polynomial.create(264, 1664, 4512, 8832, 9776, 8832, 4512, 1664, 264));
    mHitPolynomials.add(Polynomial.create(2783, 15984, 44802, 74784, 90396, 70452, 43206, 15768, 4221, 484));
    mHitPolynomials.add(Polynomial.create(30818, 173000, 457040, 759920, 853100, 707744, 405800, 180560, 49730, 10200, 888));
    mHitPolynomials.add(Polynomial.create(369321, 2004486, 5159517, 8282472, 9261714, 7464996, 4539282, 1989768, 673893, 145926, 23793, 1632));
  }

  protected Polynomial<Z> hitPolynomial(final int w) {
    while (w >= mHitPolynomials.size()) {
      final int n = mHitPolynomials.size();
      final Polynomial<Z> a = RING.multiply(hitPolynomial(n - 1), Polynomial.create(n - 4, 4));
      final Polynomial<Z> b = RING.multiply(RING.diff(hitPolynomial(n - 1)), Y.get(1));
      final Polynomial<Z> c = RING.multiply(RING.multiply(hitPolynomial(n - 2), Y.get(2)), Z.FOUR);
      final Polynomial<Z> d = RING.multiply(RING.multiply(hitPolynomial(n - 3), Y.get(2)), Z.valueOf(n - 2));
      final Polynomial<Z> e = RING.multiply(RING.diff(hitPolynomial(n - 3)), Y.get(3));
      final Polynomial<Z> f = RING.multiply(RING.multiply(hitPolynomial(n - 4), Y.get(2)), Polynomial.create(20 - 9L * n + (long) n * n, 4L * n - 16, 2));
      final Polynomial<Z> s4d = RING.diff(hitPolynomial(n - 4));
      final Polynomial<Z> g = RING.multiply(RING.multiply(s4d, Y.get(3)), Polynomial.create(2L * n - 10, 4));
      final Polynomial<Z> h = RING.multiply(RING.diff(s4d), Y.get(4));
      final Polynomial<Z> i = RING.multiply(RING.multiply(hitPolynomial(n - 5), Y.get(4)), Polynomial.create(3L * n - 16, 4));
      final Polynomial<Z> j = RING.multiply(RING.multiply(RING.diff(hitPolynomial(n - 5)), Y.get(5)), Z.THREE);
      final Polynomial<Z> k = RING.multiply(RING.multiply(hitPolynomial(n - 7), Y.get(6)), Z.valueOf(n - 6));
      final Polynomial<Z> l = RING.multiply(RING.diff(hitPolynomial(n - 7)), Y.get(7));
      final Polynomial<Z> m = RING.multiply(hitPolynomial(n - 8), Y.get(8));
      mHitPolynomials.add(RING.subtract(RING.subtract(RING.add(RING.subtract(RING.add(RING.subtract(RING.add(RING.subtract(RING.add(RING.subtract(RING.subtract(RING.subtract(a, b), c), d), e), f), g), h), i), j), k), l), m));
    }
    return mHitPolynomials.get(w);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return hitPolynomial(++mN).coeff(0);
  }
}

