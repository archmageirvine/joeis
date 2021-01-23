package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026426 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j) for 1&lt;=i&lt;=j&lt;=n, n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A026426 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.THREE.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN));
    }
    if (!Z.TWO.equals(mN)) {
      mForbidden.add(mN.square());
    }
    return mN;
  }
}
