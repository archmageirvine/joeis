package irvine.oeis.a058;

import java.util.Map;

import irvine.math.api.Field;
import irvine.math.function.Functions;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a053.A053290;
import irvine.util.Pair;

/**
 * A058502 Number of cyclic subgroups of Chevalley group A_n(3) (the group of nonsingular n X n matrices over GF(3)).
 * @author Sean A. Irvine
 */
public class A058502 extends Sequence1 {

  private int mN = 0;
  private final Field<Z> mFld;
  private final Sequence mA;

  protected A058502(final GaloisField field, final Sequence nonsingular) {
    mFld = field;
    mA = nonsingular;
  }

  /** Construct the sequence. */
  public A058502() {
    this(new GaloisField(3), new A053290().skip(1));
  }

  @Override
  public Z next() {
    final CycleIndex ci = new GeneralLinearGroup<>(++mN, mFld).cycleIndex();
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      sum = sum.add(m.getCoefficient().divide(Functions.PHI.z(order)));
    }
    return sum.multiply(mA.next()).toZ();
  }
}
