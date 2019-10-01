package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026462 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)-2</code> for <code>1&lt;=i&lt;=j&lt;=n, n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A026462 extends MemorySequence {

  protected final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || Z.THREE.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN).subtract(2));
    }
    mForbidden.add(mN.square().subtract(2));
    return mN;
  }
}
