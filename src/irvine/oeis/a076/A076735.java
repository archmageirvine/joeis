package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076735 Least k &gt;= 2 such that k^n divides Sum_{i=1..k} i! * (k-i)!.
 * @author Sean A. Irvine
 */
public class A076735 extends Sequence0 {

  private long mN = -1;
  private Z mK = Z.TWO;
  private Z mSum = Z.THREE;

  @Override
  public Z next() {
    ++mN;
    while (!mSum.mod(mK.pow(mN)).isZero()) {
      mK = mK.add(1);
      mSum = Z.ZERO;
      final long k = mK.longValueExact();
      for (long j = 1; j <= k; ++j) {
        mSum = mSum.add(Functions.FACTORIAL.z(j).multiply(Functions.FACTORIAL.z(k - j)));
      }
    }
    return mK;
  }
}
