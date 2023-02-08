package irvine.oeis.a061;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061306 Bell Bell numbers: a(n+1) = B(a(n)), where B() are the Bell numbers, A000110.
 * @author Sean A. Irvine
 */
public class A061306 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return BellNumbers.bell(BellNumbers.bell(++mN).intValueExact());
  }
}
