package irvine.math.group;

import java.util.Iterator;
import java.util.Random;

import irvine.factor.factor.Cheetah;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.AbstractIterator;

/**
 * Cyclic group.
 * @author Sean A. Irvine
 */
public class CyclicGroup extends AbstractGroup<Z> {

  private final int mSize;
  private final Z mOrder;

  /**
   * Construct a new cyclic group over integers with the specified size.
   * @param size size of group
   */
  public CyclicGroup(final int size) {
    if (size < 1) {
      throw new IllegalArgumentException();
    }
    mSize = size;
    mOrder = Z.valueOf(mSize);
  }

  @Override
  public Z zero() {
    return Z.ZERO;
  }

  @Override
  public Z size() {
    return mOrder;
  }

  @Override
  public boolean isCyclic() {
    return true;
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public boolean contains(final Z a) {
    return !(a == null || a.signum() < 0) && a.compareTo(size()) < 0;
  }

  @Override
  public Z add(final Z a, final Z b) {
    checkContains(a);
    checkContains(b);
    return a.add(b).mod(size());
  }

  @Override
  public Z negate(final Z a) {
    checkContains(a);
    return a.negate().mod(size());
  }

  private static final class CyclicGroupIterator extends AbstractIterator<Z> {
    private final Z mOrder;
    private Z mCount = Z.ZERO;

    private CyclicGroupIterator(final Z order) {
      mOrder = order;
    }

    @Override
    public boolean hasNext() {
      return mCount.compareTo(mOrder) < 0;
    }

    @Override
    public Z next() {
      final Z r = mCount;
      mCount = mCount.add(1);
      return r;
    }
  }

  @Override
  public Iterator<Z> iterator() {
    return new CyclicGroupIterator(size());
  }

  @Override
  public String toString() {
    return "C_{" + mSize + "}";
  }

  @Override
  public CycleIndex cycleIndex() {
    final CycleIndex ci = new CycleIndex("Z(C" + mSize + ")");
    for (final Z dd : Cheetah.factor(mSize).divisors()) {
      final int d = dd.intValue();
      final MultivariateMonomial m = new MultivariateMonomial();
      m.add(d, mSize / d);
      m.setCoefficient(new Q(Euler.phi(dd), size()));
      ci.add(m);
    }
    return ci;
  }

  @Override
  public Z random(final Random random) {
    return ZUtils.random(random, size());
  }
}
