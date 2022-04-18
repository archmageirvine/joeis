package irvine.oeis.a056;

import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.FiniteSequence;

/**
 * A056079 Number of 7 X 7 binary matrices with n ones, with no zero rows or columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A056079 extends FiniteSequence {

  private static final CycleIndex Z7 = SymmetricGroup.create(7).cycleIndex();
  private static final CycleIndex Z6 = SymmetricGroup.create(6).cycleIndex();
  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);

  /** Construct the sequence. */
  public A056079() {
    super(PolynomialUtils.qToZ(RING.subtract(RING.add(Z7.op(HararyMultiply.OP, Z7).applyOnePlusXToTheN(),
        Z6.op(HararyMultiply.OP, Z6).applyOnePlusXToTheN()),
        RING.multiply(Z7.op(HararyMultiply.OP, Z6).applyOnePlusXToTheN(), Q.TWO))).shift(-7));
  }
}
