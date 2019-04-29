package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018892 Number of ways to write <code>1/n</code> as a sum of exactly 2 unit fractions.
 * @author Sean A. Irvine
 */
public class A018892 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final long s = mN * mN;
    return Cheetah.factor((mN & 1) == 0 ? s / 4 : s).sigma0().subtract(1).divide2().add(1);
  }
}

