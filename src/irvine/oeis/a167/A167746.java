package irvine.oeis.a167;
// manually 2022-04-27

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A167746 Number of prime divisors of A001222 (counted with multiplicity), with a(1) = 1 by convention.
 * @author Georg Fischer
 */
public class A167746 extends A001222 {

  private int mN = -2;

  @Override
  public Z next() {
    if (++mN <= 0) {
      super.next();
      return Z.valueOf(-mN);
    }
    return Z.valueOf(Cheetah.factor(super.next()).bigOmega());
  }
}