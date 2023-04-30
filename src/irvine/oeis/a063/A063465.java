package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063465 Number k such that omega(k) = omega(k+3), where omega(k) is the number of distinct prime divisors of k.
 * @author Sean A. Irvine
 */
public class A063465 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == Jaguar.factor(mN + 3).omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
