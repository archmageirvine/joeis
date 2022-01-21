package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054008 n read modulo (number of divisors of n).
 * @author Sean A. Irvine
 */
public class A054008 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN % Cheetah.factor(mN).sigma0AsLong());
  }
}
