package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024527 a(n) = sum of cubes of p(j) - p(i), for 0 &lt;= i &lt; j &lt;= n, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024527 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z pn = Functions.PRIME.z(mN);
    for (int k = 0; k < mN; ++k) {
      mSum = mSum.add(pn.subtract(Functions.PRIME.l(k)).pow(3));
    }
    return mSum;
  }
}
