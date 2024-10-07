package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072504.
 * @author Sean A. Irvine
 */
public class A072505 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z lcm = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.square().compareTo(mN) <= 0) {
        lcm = lcm.lcm(d);
      }
    }
    return Z.valueOf(mN).divide(lcm);
  }
}

