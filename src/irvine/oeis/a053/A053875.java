package irvine.oeis.a053;

import java.util.Map;

import irvine.math.api.Ring;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A053875 Number of elements of order 4 in GL(n,2).
 * @author Sean A. Irvine
 */
public class A053875 extends Sequence1 {

  private int mN;
  private final Ring<Z> mFld;
  private final Z mOrder;

  protected A053875(final long order, final GaloisField field, final int start) {
    mN = start - 1;
    mFld = field;
    mOrder = Z.valueOf(order);
  }

  protected A053875(final long order, final GaloisField field) {
    this(order, field, 1);
  }

  /** Construct the sequence. */
  public A053875() {
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
      if (mOrder.equals(order)) {
        sum = sum.add(m.getCoefficient());
      }
    }
    sum = sum.multiply(group.size());
    return sum.toZ();
  }
}
