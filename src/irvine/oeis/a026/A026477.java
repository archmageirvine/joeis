package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026477 <code>a(1) = 1, a(2) = 2, a(3) = 3</code>; and for <code>n &gt; 3, a(n) =</code> smallest number <code>&gt; a(n-1)</code> and not of the form <code>a(i)*a(j)*a(k)</code> for <code>1 &lt;= i &lt; j &lt; k &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A026477 extends MemorySequence {

  protected final TreeSet<Z> mForbidden = new TreeSet<>();
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
