package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000632 Number of esters with n carbon atoms up to structural isomerism.
 * @author Sean A. Irvine
 */
public class A000632 extends A000598 {

  /** Construct the sequence. */
  public A000632() {
    super(2);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return RING.multiply(mG, RING.subtract(mG, RING.one()), mN).coeff(mN).toZ();
  }
}

