package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A026494 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j)+a(k) for 1&lt;=i&lt;=j&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026494 extends MemorySequence {

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
      for (final Z u : this) {
        mForbidden.add(t.multiply(u).add(mN));
        if (u.equals(t)) {
          break;
        }
      }
      mForbidden.add(t.multiply(mN).add(mN));
    }
    mForbidden.add(mN.square().add(mN));
    mForbidden.remove(Z.FOUR);
    mForbidden.remove(Z.EIGHT);
    return mN;
  }
}
