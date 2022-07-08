package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001227;

/**
 * A066272 Number of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066272 extends A001227 {

  @Override
  public Z next() {
    return super.next().subtract(5).add(Jaguar.factor(2 * mN - 1).sigma0()).add(Jaguar.factor(2 * mN + 1).sigma0()).max(Z.ZERO);
  }
}
