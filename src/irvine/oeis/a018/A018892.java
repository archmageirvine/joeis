package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018892.
 * @author Sean A. Irvine
 */
public class A018892 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final long s = mN * mN;
    return Z.valueOf((Cheetah.factor((mN & 1) == 0 ? s / 4 : s).sigma0() - 1) / 2 + 1);
  }
}

