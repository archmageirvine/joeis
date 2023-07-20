package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008578;

/**
 * A024527 a(n) = sum of cubes of p(j) - p(i), for 0 &lt;= i &lt; j &lt;= n, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024527 extends Sequence1 {

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
