package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054009 n read modulo (number of proper divisors of n).
 * @author Sean A. Irvine
 */
public class A054009 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN % (Jaguar.factor(mN).sigma0AsLong() - 1));
  }
}
