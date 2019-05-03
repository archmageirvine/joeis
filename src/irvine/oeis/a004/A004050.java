package irvine.oeis.a004;

import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A004050 Numbers of the form <code>2^j + 3^k</code>, for j and k <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A004050 implements Sequence {

  private static class MyComparator implements Comparator<Pair<Z, Z>>, Serializable {

    @Override
    public int compare(final Pair<Z, Z> a, final Pair<Z, Z> b) {
      return a.left().add(a.right()).compareTo(b.left().add(b.right()));
    }
  }

  private final TreeSet<Pair<Z, Z>> mPriority = new TreeSet<>(new MyComparator());
  {
    mPriority.add(new Pair<>(Z.ONE, Z.ONE));
  }
  private Z mPrev = null;

  @Override
  public Z next() {
    Z res;
    do {
      final Pair<Z, Z> e = mPriority.pollFirst();
      mPriority.add(new Pair<>(e.left().multiply2(), e.right()));
      mPriority.add(new Pair<>(e.left(), e.right().multiply(3)));
      res = e.left().add(e.right());
    } while (res.equals(mPrev));
    mPrev = res;
    return res;
  }
}
