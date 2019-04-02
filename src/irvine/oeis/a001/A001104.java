package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001104 Numbers n such that n / product of digits of n is a square.
 * @author Sean A. Irvine
 */
public class A001104 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z ds = ZUtils.digitProduct(mN);
      if (!Z.ZERO.equals(ds) && Z.ZERO.equals(mN.mod(ds)) && Z.ZERO.equals(mN.divide(ds).sqrtAndRemainder()[1])) {
        return mN;
      }
    }
  }
}

