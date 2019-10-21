package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026488 <code>a(n)</code> is the least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)-a(k)</code> for <code>1 &lt;= i &lt;= j &lt;= k &lt;=</code> n, where <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A026488 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      for (final Z u : this) {
        mForbidden.add(t.multiply(u).subtract(mN));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(t.multiply(mN).subtract(mN));
    }
    mForbidden.add(mN.square().subtract(mN));
    return mN;
  }
}
