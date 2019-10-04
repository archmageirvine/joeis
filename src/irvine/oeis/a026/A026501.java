package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026501 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(j)*a(k) + a(k)*a(i) + a(i)*a(j)</code> for <code>1&lt;=i&lt;j&lt;k&lt;n</code>.
 * @author Sean A. Irvine
 */
public class A026501 extends MemorySequence {

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
        mForbidden.add(a.add(u.multiply(mN)).add(u.multiply(t)));
      }
    }
    return mN;
  }
}
