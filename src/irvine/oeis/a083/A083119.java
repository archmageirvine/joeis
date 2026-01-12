package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083119 Sum of n terms from the n-th term is a square: a(1), a(2) + a(3), a(3) + a(4) + a(5),..., a(n) + a(n+1) + ...+ a(2n-1) are squares.
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

