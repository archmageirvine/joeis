package irvine.oeis.a024;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A024605 Number in position n when the numbers i^2 - i*j + j^2 (1 &lt;= i &lt;= j) are arranged in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A024605 extends Sequence1 {

  private static Z eval(final Pair<Long, Long> a) {
    final Z l = Z.valueOf(a.left());
    final Z r = Z.valueOf(a.right());
    return l.square().add(r.square()).subtract(l.multiply(r));
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
    mA.add(new Pair<>(1L, 1L));
  }

  @Override
  public Z next() {
    final Pair<Long, Long> pair = mA.pollFirst();
    final Z res = eval(pair);
    mA.add(new Pair<>(pair.left(), pair.right() + 1));
    if (pair.left() < pair.right()) {
      final Pair<Long, Long> t = new Pair<>(pair.left() + 1, pair.right());
      if (eval(t).compareTo(res) > 0) {
        mA.add(t);
      }
    }
    return res;
  }
}
