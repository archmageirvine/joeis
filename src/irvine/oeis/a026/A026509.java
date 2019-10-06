package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026509.
 * @author Sean A. Irvine
 */
public class A026509 extends MemorySequence {

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
