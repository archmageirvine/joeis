package irvine.oeis.a385;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A385879 Values of u in triples (u, v, w) such that the polynomial x^3 + u*x^2 + v*x + w has 3 (possibly repeated) negative integer zeros; the triples are ordered by the inequality u &lt; v.
 * @author Sean A. Irvine
 */
public class A385879 extends Sequence1 {

  private final TreeSet<Triple<Long>> mA = new TreeSet<>(Comparator.comparingLong((Triple<Long> t) -> t.left() + t.mid() + t.right())
    .thenComparingLong(t -> t.left() * t.mid() + t.left() * t.right() + t.mid() * t.right())
    .thenComparingLong(t -> t.left() * t.mid() * t.right()));
  {
    mA.add(new Triple<>(1L, 1L, 1L));
  }

  protected Z select(final Triple<Long> t) {
    final long v = t.left() + t.mid() + t.right();
    return Z.valueOf(v);
  }

  @Override
  public Z next() {
    final Triple<Long> t = mA.pollFirst();
    mA.add(new Triple<>(t.left() + 1, t.mid(), t.right()));
    mA.add(new Triple<>(t.left(), t.mid() + 1, t.right()));
    mA.add(new Triple<>(t.left(), t.mid(), t.right() + 1));
    return select(t);
  }
}
