package irvine.oeis.a024;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A024606 Numbers of form x^2 + xy + y^2 with distinct x and y &gt; 0.
 * @author Sean A. Irvine
 */
public class A024606 implements Sequence {

  private static Z eval(final Pair<Long, Long> a) {
    final Z l = Z.valueOf(a.left());
    final Z r = Z.valueOf(a.right());
    return l.square().add(r.square()).add(l.multiply(r));
  }

  private final TreeSet<Pair<Long, Long>> mA = new TreeSet<>((a, b) -> {
    final int c = eval(a).compareTo(eval(b));
    if (c != 0) {
      return c;
    }
    final int d = a.left().compareTo(b.left());
    if (d != 0) {
      return d;
    }
    return a.right().compareTo(b.right());
  });
  {
    mA.add(new Pair<>(1L, 2L));
  }

  @Override
  public Z next() {
    final Pair<Long, Long> pair = mA.pollFirst();
    mA.add(new Pair<>(pair.left(), pair.right() + 1));
    if (pair.left() + 1 < pair.right()) {
      mA.add(new Pair<>(pair.left() + 1, pair.right()));
    }
    final Z res = eval(pair);
    while (eval(mA.first()).equals(res)) {
      mA.pollFirst();
    }
    return res;
  }
}
