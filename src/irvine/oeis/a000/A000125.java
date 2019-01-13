package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000125.
 * @author Sean A. Irvine
 */
public class A000125 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN == 2) {
      return Z.TWO;
    }
    return Binomial.binomial(mN, 3).add(mN);
  }
}
