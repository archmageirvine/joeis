package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001103 Numbers k such that (k / product of digits of k) is 1 or a prime.
 * @author Sean A. Irvine
 */
public class A001103 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z ds = ZUtils.digitProduct(mN);
      if (!ds.isZero() && mN.mod(ds).isZero()) {
        final Z t = mN.divide(ds);
        if (Z.ONE.equals(t) || t.isPrime()) {
          return mN;
        }
      }
    }
  }
}

