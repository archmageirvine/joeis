package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026516.
 * @author Sean A. Irvine
 */
public class A026516 extends MemorySequence {

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
        mForbidden.add(t.add(u).square().add(n2));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(t.add(mN).square().add(n2));
    }
    mForbidden.add(n2.multiply(5));
    return mN;
  }
}
