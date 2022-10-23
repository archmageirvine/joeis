package irvine.oeis.a036;

import java.util.ArrayList;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006351;

/**
 * A036654 Triangle of series-parallel numbers.
 * @author Sean A. Irvine
 */
public class A036654 extends Sequence0 {

  // There must be a better way than this.

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> Y1 = RING.onePlusXToTheN(1);
  private final MemorySequence mD = MemorySequence.cachedSequence(new A036655());
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final Sequence mA = new A006351();
  private final ArrayList<Polynomial<Q>> mS = new ArrayList<>();
  {
    mS.add(RING.one());
  }
  private int mM = -1;

  @Override
  public Z next() {
    final int n = mS.size();
    if (++mM > mS.get(n - 1).degree()) {
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k < n; ++k) {
        sum = RING.add(sum, RING.multiply(RING.diff(mS.get(n - k)), new Q(mD.a(k))));
      }
      final Z t = mA.next();
      Polynomial<Q> u = RING.add(sum, RING.add(RING.monomial(new Q(t, mF.factorial(n)), n), RING.monomial(new Q(t, mF.factorial(n - 1)), n - 1)));
      Polynomial<Q> prev;
      do {
        prev = u;
        final Polynomial<Q> v = RING.divide(RING.add(sum, RING.multiply(Y1, RING.diff(u))), new Q(n));
        u = RING.empty();
        for (int k = 0; k <= v.degree(); ++k) {
          final Z f = mF.factorial(k);
          u.add(new Q(v.get(k).multiply(f).ceiling(), f));
        }
      } while (!prev.equals(u));
      mS.add(u);
      mM = 0;
    }
    return mS.get(mS.size() - 1).coeff(mM).multiply(mF.factorial(mM)).toZ();
  }
}
