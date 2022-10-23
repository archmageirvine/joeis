package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033885 a(n) = 3*n - sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A033885 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3 * ++mN).subtract(Jaguar.factor(mN).sigma());
  }
}
