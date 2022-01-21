package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
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
    return Z.valueOf(++mN % (Cheetah.factor(mN).sigma0AsLong() - 1));
  }
}
