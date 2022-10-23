package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A053814 a(n) = n modulo (sum of proper divisors of n).
 * @author Sean A. Irvine
 */
public class A053814 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.mod(Jaguar.factor(mN).sigma().subtract(mN));
  }
}

