package irvine.oeis.a076;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076657 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z b = Binomial.binomial(2 * ++mN, mN);
    return Z.ONE.shiftLeft(4 * mN).subtract(b.square()).multiply(b).divide(24);
  }
}
