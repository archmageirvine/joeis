package irvine.oeis.a032;

import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032318 Shifts left under "EGJ" (unordered, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032318 extends MemorySequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  {
    setOffset(1);
    add(Z.ZERO);
  }

  /**
   * The <code>EGJ</code> transform of a sequence.
   * @param seq sequence
   * @return transform
   */
  public static Polynomial<Q> egj(final List<Z> seq) {
    final int n = seq.size();
    Q f = Q.ONE;
    Polynomial<Q> egj = RING.one();
    for (int k = 1; k < n; ++k) {
      f = f.divide(k);
      egj = RING.multiply(egj, RING.powz(RING.onePlusXToTheN(f, k), seq.get(k), n), n);
    }
    return egj;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.TWO;
    }
    mF = mF.multiply(n - 1);
    return egj(toList()).coeff(n - 1).multiply(mF).toZ();
  }
}
