package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000972 Fermat coefficients.
 * @author Sean A. Irvine
 */
public class A000972 extends AbstractSequence {

  /* Construct the sequence. */
  public A000972() {
    super(7);
  }

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN).multiply(Z.valueOf(mN + 1)).multiply(Z.valueOf(mN + 2)).multiply(Z.valueOf(mN + 3)).multiply(Z.valueOf(mN + 4)).multiply(Z.valueOf(mN + 5)).divide(5040);
  }
}
