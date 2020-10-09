package irvine.oeis.a035;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.WeighTransformSequence;

/**
 * A035353 Number of asymmetric rooted polygonal cacti with bridges (mixed Husimi trees).
 * @author Sean A. Irvine
 */
public class A035353 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected Polynomial<Z> mA = RING.create(Collections.emptyList());
  protected int mN = -1;

  static Polynomial<Z> bhk(final Polynomial<Z> p, final int n) {
    final Polynomial<Z> p1 = RING.subtract(RING.one(), p);
    final Polynomial<Z> a = RING.series(RING.one(), p1, n);
    final Polynomial<Z> b = RING.series(RING.add(RING.one(), p), p1.substitutePower(2, n), n);
    return RING.add(p, RING.divide(RING.subtract(a, b), Z.TWO));
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      mA.add(Z.valueOf(mN));
    } else {
      final WeighTransformSequence wt = new WeighTransformSequence(new FiniteSequence(bhk(mA, mN)));
      for (int k = 0; k < mN - 1; ++k) {
        wt.next();
      }
      mA.add(wt.next());
    }
    return mA.coeff(mN);
  }
}

