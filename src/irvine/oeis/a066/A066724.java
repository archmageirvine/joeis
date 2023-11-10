package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A066724 a(1) = 1, a(2) = 2; for n &gt; 1, a(n) is the least integer &gt; a(n-1) such that the products a(i)*a(j) for 1 &lt;= i &lt; j &lt;= n are all distinct.
 * @author Sean A. Irvine
 */
public class A066724 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  {
    setOffset(1);
  }

  private boolean isOk(final Z t) {
    for (final Z a : this) {
      if (mForbidden.contains(a.multiply(t))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z t = a(size() - 1);
    while (true) {
      t = t.add(1);
      if (!mForbidden.remove(t) && isOk(t)) {
        for (final Z a : this) {
          mForbidden.add(a.multiply(t));
        }
        return t;
      }
    }
  }
}
