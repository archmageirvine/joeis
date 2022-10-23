package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054008 n read modulo (number of divisors of n).
 * @author Sean A. Irvine
 */
public class A054008 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN % Jaguar.factor(mN).sigma0AsLong());
  }
}
