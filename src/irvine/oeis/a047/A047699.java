package irvine.oeis.a047;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A047699 a(0) = 0; for n &gt;= 0, a(n+1) = a(n) + x where x is the smallest nonnegative number that is not equal to a(i) +- a(k) for any 0 &lt;= i &lt;= n, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A047699 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      mForbidden.add(Z.ZERO);
      return Z.ZERO;
    }
    Z a = Z.ZERO;
    do {
      a = a.add(1);
    } while (mForbidden.contains(a));
    a = a.add(a(size() - 1));
    for (final Z v : this) {
      mForbidden.add(a.add(v));
      mForbidden.add(a.subtract(v));
    }
    mForbidden.add(a.multiply2());
    return a;
  }
}
