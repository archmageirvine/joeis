package irvine.oeis.a052;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A052836 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052836 extends MemorySequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    } else {
      final WeighTransformSequence weigh = new WeighTransformSequence(this);
      final Polynomial<Z> t = RING.empty();
      t.add(Z.ONE);
      for (int k = 0; k < n; ++k) {
        t.add(weigh.next().negate());
      }
      return RING.coeff(RING.one(), t, n);
    }
  }
}
