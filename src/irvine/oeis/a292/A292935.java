package irvine.oeis.a292;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A292935 E.g.f.: exp(exp(-x) - 1).
 * Offset 0.
 * Formula: <code>a(n) = (-1)^n * A000110(n)</code>.
 * @author Georg Fischer
 */
public class A292935 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 0 ? BellNumbers.bell(mN) : BellNumbers.bell(mN).negate();
  }
}
