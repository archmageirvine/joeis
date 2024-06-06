package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070239 a(1) = 1; a(2) = 2; a(n) = sigma_a[n-2] (a[n-1]), n &gt; 2, where sigma_k (n) denotes the sum of the k-th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A070239 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
    } else {
      final Z t = Functions.SIGMA.z(mA.longValueExact(), mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

