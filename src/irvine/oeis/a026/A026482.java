package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A026482 a(n) = least positive integer &gt; a(n-1) and not equal to a(i)*a(j)*a(k) for 1&lt;=i&lt;=j&lt;=k&lt;n.
 * @author Sean A. Irvine
 */
public class A026482 extends MemorySequence {

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
    for (final Z t : this) {
      final Z a = t.multiply(mN);
      for (final Z u : this) {
        mForbidden.add(a.multiply(u));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(mN.square().multiply(t));
    }
    mForbidden.add(mN.pow(3));
    return mN;
  }
}
