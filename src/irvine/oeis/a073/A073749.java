package irvine.oeis.a073;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a008.A008578;

/**
 * A073571.
 * @author Sean A. Irvine
 */
public class A073749 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mP = RING.empty();
  private final Sequence mSeq = new A008578();
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mP.add(new Q(mSeq.next()));
    return select(RING.sqrt(mP, ++mN).coeff(mN));
  }
}
