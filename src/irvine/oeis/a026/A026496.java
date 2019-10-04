package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026496 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)^2 + a(j)^2 + a(k)^2</code> for <code>1&lt;=i&lt;=j&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A026496 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    final Z n2 = mN.square();
    for (final Z t : this) {
      final Z a = t.square().add(n2);
      for (final Z u : this) {
        mForbidden.add(a.add(u.square()));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(a.add(n2));
    }
    mForbidden.add(n2.multiply(3));
    return mN;
  }
}
