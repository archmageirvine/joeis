package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026449 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)+2</code> for <code>i&lt;=1&lt;=j&lt;=n, n &gt;= 2/</code>.
 * @author Sean A. Irvine
 */
public class A026449 extends MemorySequence {

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
