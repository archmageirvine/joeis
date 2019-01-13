package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001877.
 * @author Sean A. Irvine
 */
public class A001877 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long c = 0;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      if (d.mod(5) == 2) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
