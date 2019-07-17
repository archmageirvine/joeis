package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008578;

/**
 * A024527 <code>a(n) =</code> sum of cubes of <code>p(j) - p(i)</code>, for <code>0 &lt;= i &lt; j &lt;=</code> n, where <code>p(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024527 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A008578());
  private Z mSum = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z pn = mA.a(mN);
    for (int k = 0; k < mN; ++k) {
      mSum = mSum.add(pn.subtract(mA.a(k)).pow(3));
    }
    return mSum;
  }
}
