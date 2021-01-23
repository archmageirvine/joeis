package irvine.oeis.a022;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A022879 The number of numbers [ [ ix ]jx ] that equal n, where i &gt;= 1, j &gt;= 1 and x=(1+sqrt(5))/2. a(n)=0 iff n is in Beatty sequence A001950.
 * @author Sean A. Irvine
 */
public class A022879 implements Sequence {

  private Z mN = Z.ZERO;
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
    mS.add(new Pair<>(1L, 1L));
  }

  protected Z eval(final Pair<Long, Long> p) {
    return CR.valueOf(CR.PHI.multiply(p.left()).floor())
      .multiply(CR.PHI.multiply(p.right())).floor();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    while (eval(mS.first()).equals(mN)) {
      final Pair<Long, Long> p = mS.pollFirst();
      mS.add(new Pair<>(p.left() + 1, p.right()));
      mS.add(new Pair<>(p.left(), p.right() + 1));
      ++c;
    }
    return Z.valueOf(c);
  }
}
