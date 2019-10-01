package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026482 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not equal to <code>a(i)*a(j)*a(k)</code> for <code>1&lt;=i&lt;=j&lt;=k&lt;n</code>.
 * @author Sean A. Irvine
 */
public class A026482 extends MemorySequence {

  protected final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
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
    return mN;
  }
}
