package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083119 extends CachedSequence {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mLeastUnused = 2;

  /** Construct the sequence. */
  public A083119() {
    super(1);
  }

  @Override
  protected Z compute(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    final int m = n.intValueExact();
    if (n.isEven()) {
      mUsed.add(mLeastUnused);
      return Z.valueOf(mLeastUnused);
    } else {
      final Z sum = Integers.SINGLETON.sum(m / 2 + 1, m - 1, this::a);
      long k = mLeastUnused;
      while (mUsed.contains(k) || !Predicates.SQUARE.is(sum.add(k))) {
        ++k;
      }
      mUsed.add(k);
      return Z.valueOf(k);
    }
  }
}

