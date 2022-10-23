package irvine.oeis.a059;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059606 Expansion of (1/2)*(exp(2*x)-1)*exp(exp(x)-1).
 * @author Sean A. Irvine
 */
public class A059606 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return BellNumbers.bell(++mN + 2).subtract(BellNumbers.bell(mN + 1)).subtract(BellNumbers.bell(mN)).divide2();
  }
}
