package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026449 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j)+2 for i&lt;=1&lt;=j&lt;=n, n &gt;= 2/.
 * @author Sean A. Irvine
 */
public class A026449 extends MemorySequence {

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
      mForbidden.add(t.multiply(mN).add(2));
    }
    if (!Z.ONE.equals(mN)) {
      mForbidden.add(mN.square().add(2));
    }
    return mN;
  }
}
