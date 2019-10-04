package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026480 <code>a(1) = 1, a(2) = 2, a(3) = 4</code>, and for <code>n &gt; 3, a(n)</code> is the least positive integer <code>&gt; a(n-1)</code> not of form <code>a(i)*a(j)*a(k)</code> for <code>1 &lt;= i &lt;= j &lt;= k &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A026480 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.THREE.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      final Z a = t.multiply(mN);
      for (final Z u : this) {
        mForbidden.add(a.multiply(u));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(mN.square().multiply(t));
    }
    mForbidden.add(mN.pow(3));
    mForbidden.remove(Z.FOUR);
    return mN;
  }
}
