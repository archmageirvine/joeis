package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008865 a(n) = n^2 - 2.
 * @author Sean A. Irvine
 */
public class A008865 extends AbstractSequence {

  /* Construct the sequence. */
  public A008865() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().subtract(2);
  }
}

