package irvine.oeis.a027;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027594 Sequence satisfies <code>T^2(a)=a</code>, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027594 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 3, 4);
  private int mN = 0;

  static Polynomial<Z> specialPartitionTransform(final Polynomial<Z> a, final int n) {
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    int prev = 0;
    for (final Z z : a) {
      final int u = z.intValueExact();
      if (u > prev) { // distinct values
        if ((u % 5) == 0) {
          num = RING.multiply(num, RING.onePlusXToTheN(u), n);  // u occurs at most one
        } else {
          den = RING.multiply(den, RING.oneMinusXToTheN(u), n); // u any number of times
        }
        prev = u;
      }
    }
    return RING.series(num, den, n);
  }

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = specialPartitionTransform(specialPartitionTransform(mA, mN + 1), mN);
    }
    return mA.coeff(mN);
  }
}
