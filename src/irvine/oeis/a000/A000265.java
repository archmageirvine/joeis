package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000265 Remove all factors of 2 from n; or largest odd divisor of n; or odd part of n.
 * @author Sean A. Irvine
 */
public class A000265 extends AbstractSequence {

  /** Construct the sequence. */
  public A000265() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.makeOdd();
  }
}
