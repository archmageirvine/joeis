package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003165.
 * @author Sean A. Irvine
 */
public class A003165 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2 + 1 - Cheetah.factor(mN).sigma0());
  }
}
