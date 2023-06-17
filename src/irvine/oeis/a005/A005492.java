package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005492 From expansion of falling factorials.
 * @author Sean A. Irvine
 */
public class A005492 extends AbstractSequence {

  /* Construct the sequence. */
  public A005492() {
    super(4);
  }

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(16).multiply(mN).add(102).multiply(mN).subtract(300).multiply(mN).add(340);
  }
}

