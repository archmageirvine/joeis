package irvine.oeis.a053;

import java.util.Map;

import irvine.math.api.Ring;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A053718.
 * @author Sean A. Irvine
 */
public class A053718 implements Sequence {

  private int mN = 0;
  private final Ring<Z> mFld;

  protected A053718(final GaloisField field) {
    mFld = field;
  }

  /** Construct the sequence. */
  public A053718() {
    this(new GaloisField(2));
  }

  // todo parameter for the "4"
  @Override
  public Z next() {
    final GeneralLinearGroup<Z> group = new GeneralLinearGroup<>(++mN, mFld);
    final CycleIndex ci = group.cycleIndex();
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      if (Z.FOUR.mod(order).isZero()) {
        sum = sum.add(m.getCoefficient());
      }
    }
    sum = sum.multiply(group.size());
    return sum.toZ();
  }
}
