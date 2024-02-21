package irvine.oeis.a053;

import java.util.Map;

import irvine.math.api.Field;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Pair;

/**
 * A053718 Number of n X n binary matrices of order dividing 4 (also number of solutions to X^4=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053718 extends AbstractSequence {

  private int mN;
  private final Field<Z> mFld;
  private final Z mMaxOrder;

  protected A053718(final long maxOrder, final GaloisField field, final int start) {
    super(start);
    mN = start - 1;
    mFld = field;
    mMaxOrder = Z.valueOf(maxOrder);
  }

  protected A053718(final long maxOrder, final GaloisField field) {
    this(maxOrder, field, 1);
  }

  /** Construct the sequence. */
  public A053718() {
    this(4, new GaloisField(2));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final GeneralLinearGroup<Z> group = new GeneralLinearGroup<>(mN, mFld);
    final CycleIndex ci = group.cycleIndex();
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      if (mMaxOrder.mod(order).isZero()) {
        sum = sum.add(m.getCoefficient());
      }
    }
    sum = sum.multiply(group.size());
    return sum.toZ();
  }
}
