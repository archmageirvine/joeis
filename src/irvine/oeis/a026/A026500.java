package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026500 For n &gt;= 3, a(n) = least positive integer &gt; a(n-1) and not a(i)^2 + a(j)^2 + a(k)^2 for 1&lt;=i&lt;=j&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026500 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
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
    if (!Z.ONE.equals(mN)) {
      mForbidden.add(n2.multiply(3));
    }
    return mN;
  }
}
