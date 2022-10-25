package irvine.oeis.a032;

import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032306 Number of rooted trees with leaves of 2 colors where any 2 subtrees extending from the same node have a different number of nodes.
 * @author Sean A. Irvine
 */
public class A032306 extends MemorySequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  {
    setOffset(1);
    add(Z.ZERO);
  }

  static Polynomial<Z> efk(final List<Z> seq) {
    Polynomial<Z> efk = RING.one();
    for (int k = 1; k < seq.size(); ++k) {
      efk = RING.multiply(efk, RING.onePlusXToTheN(seq.get(k), k), seq.size());
    }
    return efk;
  }

  @Override
  protected Z computeNext() {
    if (size() <= 2) {
      return Z.TWO;
    }
    return efk(toList()).coeff(size() - 1);
  }
}
