package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026514 a(n) = least positive integer &gt; a(n-1) and not (a(i)+a(j))^2 + a(k)^2 for 1&lt;=i&lt;=j&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A026514 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
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
