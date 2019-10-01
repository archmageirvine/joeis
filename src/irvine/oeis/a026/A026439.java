package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026439 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)-1</code> for <code>1 &lt;= i &lt;= j &lt</code>; n, <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A026439 extends MemorySequence {

  protected final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN).subtract(1));
    }
    if (!Z.TWO.equals(mN)) {
      mForbidden.add(mN.square().subtract(1));
    }
    return mN;
  }
}
