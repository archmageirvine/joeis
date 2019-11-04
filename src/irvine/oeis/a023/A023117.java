package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A023117 Signature sequence of <code>sqrt(5)</code> (arrange the numbers <code>i+j*x (i,j &gt;= 1)</code> in increasing order; the sequence of i's is the signature of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A023117 implements Sequence {

  private static final CR N = CR.FIVE.sqrt();

  private final TreeSet<Pair<Long, Long>> mS = new TreeSet<>((a, b) -> {
    if (a.equals(b)) {
      return 0; // To avoid infinite precision calculation in next compare
    }
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

  protected CR getN() {
    return N;
  }

  protected CR eval(final Pair<Long, Long> p) {
    return getN().multiply(p.right()).add(CR.valueOf(p.left()));
  }

  @Override
  public Z next() {
    final Pair<Long, Long> p = mS.pollFirst();
    mS.add(new Pair<>(p.left() + 1, p.right()));
    mS.add(new Pair<>(p.left(), p.right() + 1));
    return Z.valueOf(p.left());
  }
}
