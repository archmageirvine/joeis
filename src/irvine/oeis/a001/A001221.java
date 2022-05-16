package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001221 Number of distinct primes dividing n (also called omega(n)).
 * @author Sean A. Irvine
 */
public class A001221 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(Jaguar.factor(mN).omega());
  }
}
