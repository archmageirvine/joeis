package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049060 a(n) = (-1)^omega(n)*Sum_{d|n} d*(-1)^omega(d), where omega(n) = A001221(n) is number of distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A049060 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(-1);
  }
}
