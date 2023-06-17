package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.PairMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000666 Number of symmetric relations on n nodes.
 * @author Sean A. Irvine
 */
public class A000666 extends AbstractSequence {

  /* Construct the sequence. */
  public A000666() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex zn = SymmetricGroup.create(mN).cycleIndex();
    final MultivariateMonomial m = new MultivariateMonomial();
    m.add(1, 1);
    final CycleIndex c = zn.multiply(m);
    final CycleIndex pair = c.op(PairMultiply.OP, c);
    final Polynomial<Q> g = pair.applyOnePlusXToTheN();
    return RING.eval(g, Q.ONE).toZ();
  }
}
