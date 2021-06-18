package irvine.oeis.a048;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a047.A047844;
import irvine.util.Pair;

/**
 * A048462 Odd numbers in sorted order from generation 2 onwards.
 * @author Sean A. Irvine
 */
public class A048462 extends A047844 {

  private final TreeSet<Pair<Long, Long>> mA = new TreeSet<>(Comparator.comparing((Pair<Long, Long> o) -> get(o.left(), o.right())).thenComparingLong(Pair::left));
  {
    mA.add(new Pair<>(1L, 2L));
  }
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Pair<Long, Long> a = mA.pollFirst();
      mA.add(new Pair<>(a.left() + 1, a.right()));
      mA.add(new Pair<>(a.left(), a.right() + 1));
      final Z t = get(a.left(), a.right());
      if (t.isOdd() && !t.equals(mPrev)) {
        mPrev = t;
        return t;
      }
    }
  }
}
