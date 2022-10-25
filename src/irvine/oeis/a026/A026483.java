package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026483 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j)-a(k) for 1&lt;=i&lt;j&lt;k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026483 extends MemorySequence {

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
      for (final Z u : this) {
        if (u.equals(t)) {
          break;
        }
        mForbidden.add(t.multiply(u).subtract(mN));
      }
    }
    return mN;
  }
}
