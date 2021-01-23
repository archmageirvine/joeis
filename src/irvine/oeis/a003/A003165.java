package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003165 a(n) = floor(n/2) + 1 - d(n), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A003165 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2 + 1).subtract(Cheetah.factor(mN).sigma0());
  }
}
