package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063464 omega(n) = omega(n+2), where omega(n) is the number of distinct prime divisors of n.
 * @author Sean A. Irvine
 */
public class A063464 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == Jaguar.factor(mN + 2).omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
