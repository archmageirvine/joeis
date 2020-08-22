package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A022911 Arrange the nontrivial binomial coefficients C(m,k) (2 &lt;= k &lt;= m/2) in increasing order (not removing duplicates); record the sequence of m's.
 * @author Sean A. Irvine
 */
public class A022911 implements Sequence {

  private final TreeSet<Pair<Long, Long>> mA = new TreeSet<>((a, b) -> {
    final int c = eval(a).compareTo(eval(b));
    if (c != 0) {
      return c;
    }
    final int d = b.left().compareTo(a.left()); // bigger m comes first
    if (d != 0) {
      return d;
    }
    return a.right().compareTo(b.right());
  });
  {
    mA.add(new Pair<>(4L, 2L));
  }

  private Z eval(final Pair<Long, Long> a) {
    return Binomial.binomial(a.left(), a.right());
  }

  protected Z select(final Pair<Long, Long> a) {
    return Z.valueOf(a.left());
  }

  @Override
  public Z next() {
    final Pair<Long, Long> res = mA.pollFirst();
    mA.add(new Pair<>(res.left() + 1, res.right()));
    if (res.right() + 1 <= res.left() / 2) {
      mA.add(new Pair<>(res.left(), res.right() + 1));
    }
    return select(res);
  }
}
