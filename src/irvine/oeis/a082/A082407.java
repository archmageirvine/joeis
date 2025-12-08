package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082407 define u(k) as u(1)=1 u(k)=binomial(2*u(k-1),u(k-1)) (mod k), sequence gives values of k such that u(k)=0.
 * @author Sean A. Irvine
 */
public class A082407 extends Sequence1 {

  private long mN = 1;
  private Z mU = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mU = Binomial.binomial(mU.multiply2(), mU, Z.valueOf(++mN));
      if (mU.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
