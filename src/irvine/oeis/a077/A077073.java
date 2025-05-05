package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077046.
 * @author Sean A. Irvine
 */
public class A077073 extends Sequence1 {

  private Z mProd = null;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.TWO;
      return Z.TWO;
    }
    final Z res = Functions.LPF.z(mProd.multiply2().add(1));
    mProd = mProd.multiply(res);
    return res;
  }
}

