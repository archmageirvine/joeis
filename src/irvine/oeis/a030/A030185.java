package irvine.oeis.a030;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.a145.A145200;
import irvine.oeis.memory.MemorySequence;

/**
 * A030185 Coefficients in expansion of E_2*E_4/(E_6*j) in powers of 1/j.
 * @author Sean A. Irvine
 */
public class A030185 extends MemorySequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mTSeq = new A145200();
  private final Sequence mUSeq = new A000521();
  private final Polynomial<Z> mT = RING.empty();
  private final Polynomial<Z> mU = RING.empty(); // = x * A000521(x)

  {
    setOffset(1);
    next(); // skip leading 0
  }

  @Override
  protected Z computeNext() {
    mT.add(mTSeq.next());
    mU.add(mUSeq.next());
    Polynomial<Z> s = mT;
    for (int k = 0; k < size(); ++k) {
      s = RING.subtract(s, RING.series(RING.monomial(a(k), k), RING.pow(mU, k, size()), size()));
    }
    return s.coeff(size());
  }
}
