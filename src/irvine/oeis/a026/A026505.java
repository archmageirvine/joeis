package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026505 a(n) is the least positive integer &gt; a(n-1) and not a(j)*a(k) + a(k)*a(i) + a(i)*a(j) for 1 &lt;= i &lt; j &lt; k &lt;= n.
 * @author Sean A. Irvine
 */
public class A026505 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
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
