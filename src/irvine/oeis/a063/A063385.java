package irvine.oeis.a063;

import java.util.Map;

import irvine.math.api.Ring;
import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GaloisField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002884;
import irvine.util.Pair;

/**
 * A063385 Number of solutions of x^2=1 in general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A063385 extends Sequence1 {

  private int mN = 0;
  private final Ring<Z> mFld;
  private final Sequence mA = new A002884().skip(1);
  private final Z mOrder;

  protected A063385(final GaloisField field, final Z order) {
    mFld = field;
    mOrder = order;
  }

  /** Construct the sequence. */
  public A063385() {
    this(new GaloisField(2), Z.TWO);
  }

  @Override
  public Z next() {
    final CycleIndex ci = AffineGroupCycleIndex.cycleIndex(++mN, mFld);
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
        if (order.compareTo(mOrder) > 0) {
          break;
        }
      }
      if (mOrder.mod(order).isZero()) {
        sum = sum.add(m.getCoefficient());
      }
    }
    return sum.multiply(mA.next()).multiply(Z.ONE.shiftLeft(mN)).toZ();
  }
}
