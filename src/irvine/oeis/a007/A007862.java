package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007862 Number of triangular numbers that divide n.
 * @author Sean A. Irvine
 */
public class A007862 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long count = 0;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      if (mN % (dd.intValueExact() + 1) == 0) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
