package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026487 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j)-a(k) for 1&lt;=i&lt;j&lt;k&lt;n.
 * @author Sean A. Irvine
 */
public class A026487 extends MemorySequence {

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
        mForbidden.add(t.multiply(u).subtract(mN));
      }
    }
    return mN;
  }
}
