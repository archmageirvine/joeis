package irvine.oeis.a062;

import java.util.Map;
import java.util.TreeSet;

import irvine.math.api.Ring;
import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GaloisField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A062766 Number of nonisomorphic cyclic subgroups of general affine group AGL(n,2).
 * @author Sean A. Irvine
 */
public class A062766 extends Sequence1 {

  private int mN = 0;
  private final Ring<Z> mFld;

  protected A062766(final GaloisField field) {
    mFld = field;
  }

  /** Construct the sequence. */
  public A062766() {
    this(new GaloisField(2));
  }

  @Override
  public Z next() {
    final CycleIndex ci = AffineGroupCycleIndex.cycleIndex(++mN, mFld);
    final TreeSet<Z> orders = new TreeSet<>();
    for (final MultivariateMonomial m : ci.values()) {
      Z order = Z.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        order = order.lcm(Z.valueOf(e.getKey().right()));
      }
      orders.add(order);
    }
    return Z.valueOf(orders.size());
  }
}
