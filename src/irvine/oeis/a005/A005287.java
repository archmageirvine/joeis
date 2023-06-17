package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005287 Number of permutations of [n] with four inversions.
 * @author Sean A. Irvine
 */
public class A005287 extends AbstractSequence {

  /* Construct the sequence. */
  public A005287() {
    super(4);
  }

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(mN).subtract(14).multiply(mN).multiply(mN.add(1)).divide(24);
  }
}

