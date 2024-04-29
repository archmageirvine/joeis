package irvine.oeis.a000;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000110 Bell or exponential numbers: number of ways to partition a set of n labeled elements.
 * @author Sean A. Irvine
 */
public class A000110 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return BellNumbers.bell(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return BellNumbers.bell(n);
  }

}

