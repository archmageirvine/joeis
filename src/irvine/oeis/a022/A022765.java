package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A022765 Ordered sequence of distinct terms of the form floor(exp(i) * floor(exp(j))), i,j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A022765 implements Sequence {

  private Z mPrev = Z.ZERO;
  private final TreeSet<Pair<Long, Long>> mS = new TreeSet<>((a, b) -> {
    final int c = eval(a).compareTo(eval(b));
    if (c != 0) {
      return c;
    }
    final int d = Long.compare(a.left(), b.left());
    if (d != 0) {
      return d;
    }
    return Long.compare(a.right(), b.right());
  });
  {
    mS.add(new Pair<>(0L, 0L));
  }

  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(CR.valueOf(p.left()).exp().floor()).multiply(CR.valueOf(p.right()).exp()).floor();
  }

  @Override
  public Z next() {
    Z t;
    do {
      final Pair<Long, Long> p = mS.pollFirst();
      t = eval(p);
      mS.add(new Pair<>(p.left() + 1, p.right()));
      mS.add(new Pair<>(p.left(), p.right() + 1));
    } while (mPrev.equals(t));
    mPrev = t;
    return t;
  }
}
