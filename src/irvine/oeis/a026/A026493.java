package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026493 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)+a(k)</code> for <code>1&lt;=i&lt;j&lt;k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A026493 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      for (final Z u : this) {
        if (u.equals(t)) {
          break;
        }
        mForbidden.add(t.multiply(u).add(mN));
      }
    }
    return mN;
  }
}
