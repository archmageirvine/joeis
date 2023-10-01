package irvine.oeis.a066;

import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066061 a(n) = (n^2 + n + 1)!.
 * @author Sean A. Irvine
 */
public class A066061 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return new BinarySplitFactorial().factorial(++mN * mN + mN + 1);
  }
}
