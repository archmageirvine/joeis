package irvine.oeis.a385;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A385880 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385880 extends Sequence1 {

  private final TreeSet<Triple<Long>> mA = new TreeSet<>(Comparator.comparingLong((Triple<Long> t) -> t.left() + t.mid() + t.right())
    .thenComparingLong(t -> t.left() * t.mid() + t.left() * t.right() + t.mid() * t.right())
    .thenComparingLong(t -> t.left() * t.mid() * t.right()));
  {
    mA.add(new Triple<>(1L, 2L, 3L));
  }

  protected Z select(final Triple<Long> t) {
    final long v = t.left() + t.mid() + t.right();
    return Z.valueOf(v);
  }

  @Override
  public Z next() {
    final Triple<Long> t = mA.pollFirst();
    if (t.left() + 1 < t.mid()) {
      mA.add(new Triple<>(t.left() + 1, t.mid(), t.right()));
    }
    if (t.mid() + 1 < t.right()) {
      mA.add(new Triple<>(t.left(), t.mid() + 1, t.right()));
    }
    mA.add(new Triple<>(t.left(), t.mid(), t.right() + 1));
    return select(t);
  }
}
