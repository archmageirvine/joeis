package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026502 a(n) = least positive integer &gt; a(n-1) and not a(j)*a(k) + a(k)*a(i) + a(i)*a(j) for 1&lt;=i&lt;=j&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026502 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    final Z n2 = mN.square();
    for (final Z t : this) {
      final Z a = t.multiply(mN);
      for (final Z u : this) {
        mForbidden.add(a.add(u.multiply(mN)).add(u.multiply(t)));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(a.multiply2().add(n2));
    }
    if (!Z.ONE.equals(mN)) {
      mForbidden.add(n2.multiply(3));
    }
    return mN;
  }
}
