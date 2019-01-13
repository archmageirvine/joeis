package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001615.
 * @author Sean A. Irvine
 */
public class A001615 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.valueOf(++mN);
    for (final Z p : Cheetah.factor(mN).toZArray()) {
      prod = prod.divide(p).multiply(p.add(1));
    }
    return prod;
  }
}
