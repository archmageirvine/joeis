package irvine.oeis.a014;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014673.
 * @author Sean A. Irvine
 */
public class A014673 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long m = mN / Cheetah.factor(mN).toZArray()[0].longValue();
    if (m == 1) {
      return Z.ONE;
    }
    return Cheetah.factor(m).toZArray()[0];
  }
}

