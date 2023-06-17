package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006519 Highest power of 2 dividing n.
 * @author Sean A. Irvine
 */
public class A006519 extends AbstractSequence {

  /* Construct the sequence. */
  public A006519() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mN.makeOdd();
    return Z.ONE.shiftLeft(mN.auxiliary());
  }
}
