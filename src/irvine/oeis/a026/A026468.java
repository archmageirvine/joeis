package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026468 a(1) = 1, a(2) = 2; for n &gt;= 3, a(n) = least positive integer &gt; a(n-1) and not a(i)^2 + a(j)^2 for 1&lt;=i&lt;=j&lt;=n-1.
 * @author Sean A. Irvine
 */
public class A026468 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.square().add(mN.square()));
    }
    if (!Z.ONE.equals(mN)) {
      mForbidden.add(mN.square().multiply2());
    }
    return mN;
  }
}
