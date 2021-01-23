package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026477 a(1) = 1, a(2) = 2, a(3) = 3; and for n &gt; 3, a(n) = smallest number &gt; a(n-1) and not of the form a(i)*a(j)*a(k) for 1 &lt;= i &lt; j &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A026477 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      final Z a = t.multiply(mN);
      for (final Z u : this) {
        if (u.equals(t)) {
          break;
        }
        mForbidden.add(a.multiply(u));
      }
    }
    return mN;
  }
}
