package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067555 Smallest number m&gt;1 such that the product of the parts in some partition of m is equal to m^n.
 * @author Sean A. Irvine
 */
public class A067555 extends Sequence1 {

  private int mN = 0;
  private Z mK = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (Jaguar.factor(mK).sopfr().multiply(mN).compareTo(mK) <= 0) {
        return mK;
      }
      mK = mK.add(1);
    }
  }
}
