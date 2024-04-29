package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A069355 Numbers of form 2^i*3^j - (i+j) with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A069355 extends Sequence1 {

  private final TreeSet<Pair<Z, Long>> mA = new TreeSet<>((a, b) -> {
    final Z u = a.left().subtract(a.right());
    final Z v = b.left().subtract(b.right());
    final int c = u.compareTo(v);
    if (c != 0) {
      return c;
    }
    return a.left().compareTo(b.left());
  });
  {
    mA.add(new Pair<>(Z.ONE, 0L));
  }
  Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Pair<Z, Long> a = mA.pollFirst();
      mA.add(new Pair<>(a.left().multiply2(), a.right() + 1));
      mA.add(new Pair<>(a.left().multiply(3), a.right() + 1));
      final Z t = a.left().subtract(a.right());
      if (!t.equals(mPrev)) {
        mPrev = t;
        return t;
      }
    }
  }
}
