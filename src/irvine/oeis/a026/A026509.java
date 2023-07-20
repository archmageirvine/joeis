package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A026509 a(n) = least positive integer &gt; a(n-1) and not (a(i)+a(j))^2 - a(k)^2 for 1&lt;=i&lt;j&lt;k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026509 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.THREE.equals(mN) || mForbidden.remove(mN));
    final Z n2 = mN.square();
    for (final Z t : this) {
      for (final Z u : this) {
        if (u.equals(t)) {
          break;
        }
        final Z a = t.add(u).square().subtract(n2);
        if (a.compareTo(mN) >= 0) {
          mForbidden.add(a);
        }
      }
    }
    return mN;
  }
}
