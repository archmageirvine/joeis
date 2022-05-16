package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055682 a(n) = floor(n*sqrt(n)) - sigma(n), where sigma(n) is the sum of the divisors of n (A000203).
 * @author Sean A. Irvine
 */
public class A055682 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).sqrt().subtract(Jaguar.factor(mN).sigma());
  }
}
