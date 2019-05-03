package irvine.oeis.a222;

import irvine.math.group.DihedralGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A222189 Number of toroidal <code>n X 3</code> binary arrays, allowing rotation and/or reflection of the rows and/or the columns.
 * @author Sean A. Irvine
 */
public class A222189 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final CycleIndex mS = SymmetricGroup.create(3).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CycleIndex d = DihedralGroup.cycleIndex(mN);
    final CycleIndex c = mS.op(HararyMultiply.OP, d);
    return RING.eval(c.applyOnePlusXToTheN(), Q.ONE).toZ();
  }
}
