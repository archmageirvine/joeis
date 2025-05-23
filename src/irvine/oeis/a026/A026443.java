package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A026443 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j)+2 for 1&lt;=i&lt;j&lt;=n, with initial terms 1,2.
 * @author Sean A. Irvine
 */
public class A026443 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN).add(2));
    }
    return mN;
  }
}
