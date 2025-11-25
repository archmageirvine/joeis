package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082093 a(n) is the least number m such that (m+n)!/m! = (m+1)*(m+2)*...*(m+n) divides lcm(1,...,m).
 * @author Sean A. Irvine
 */
public class A082093 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z f = Functions.FACTORIAL.z(++mN);
    long m = 0;
    Z lcm = Z.ONE;
    while (true) {
      lcm = lcm.lcm(++m);
      f = f.divide(m).multiply(mN + m);
      if (lcm.mod(f).isZero()) {
        return Z.valueOf(m);
      }
    }
  }
}
