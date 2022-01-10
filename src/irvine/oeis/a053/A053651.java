package irvine.oeis.a053;

import java.util.Map;
import java.util.TreeSet;

import irvine.math.api.Ring;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A053651 Number of nonisomorphic cyclic subgroups of general linear group GL(n,2).
 * @author Sean A. Irvine
 */
public class A053651 implements Sequence {

  private int mN = 0;
  private final Ring<Z> mFld;

  protected A053651(final GaloisField field) {
    mFld = field;
  }

  /** Construct the sequence. */
  public A053651() {
    this(new GaloisField(2));
  }

  @Override
  public Z next() {
    final CycleIndex ci = new GeneralLinearGroup<>(++mN, mFld).cycleIndex();
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
