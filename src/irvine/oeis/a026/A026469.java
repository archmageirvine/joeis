package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026469 a(1) = 1; for n &gt; 1, a(n) = least positive integer &gt; a(n-1) and not equal to a(i)^2 + a(j)^2 for 1&lt;=i&lt;=j&lt;=n-1.
 * @author Sean A. Irvine
 */
public class A026469 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.square().add(mN.square()));
    }
    if (!Z.ONE.equals(mN)) {
      mForbidden.add(mN.square().multiply2());
    }
    return mN;
  }
}
