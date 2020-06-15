package irvine.oeis.a032;

import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032318 Shifts left under "EGJ" <code>(unordered</code>, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032318 extends MemorySequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  {
    add(Z.ZERO);
  }

  protected static Polynomial<Q> egj(final List<Z> seq) {
    final int n = seq.size();
    Q f = Q.ONE;
    Polynomial<Q> efk = RING.one();
    for (int k = 1; k < n; ++k) {
      f = f.divide(k);
      efk = RING.multiply(efk, RING.powz(RING.onePlusXToTheN(f, k), seq.get(k), n), n);
    }
    return efk;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.TWO;
    }
    mF = mF.multiply(n - 1);
    return egj(this).coeff(n - 1).multiply(mF).toZ();
  }
}
