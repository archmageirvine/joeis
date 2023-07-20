package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A026425 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j) for 1&lt;=i&lt;=j&lt;=n, n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A026425 extends MemorySequence {

  {
    setOffset(1);
  }

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || Z.THREE.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN));
    }
    mForbidden.add(mN.square());
    return mN;
  }
}
