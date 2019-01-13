package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001103.
 * @author Sean A. Irvine
 */
public class A001103 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z ds = ZUtils.digitProduct(mN);
      if (!Z.ZERO.equals(ds) && Z.ZERO.equals(mN.mod(ds))) {
        final Z t = mN.divide(ds);
        if (Z.ONE.equals(t) || t.isPrime()) {
          return mN;
        }
      }
    }
  }
}

