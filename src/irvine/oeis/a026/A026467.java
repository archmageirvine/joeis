package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026467 a(n) = least positive integer &gt; a(n-1) and not a(i)^2 + a(j)^2 for 1&lt;=i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A026467 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.square().add(mN.square()));
    }
    return mN;
  }
}
