package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000292 Tetrahedral (or triangular pyramidal) numbers: a(n) = C(n+2, 3) = n*(n+1)*(n+2)/6.
 * @author Sean A. Irvine
 */
public class A000292 extends AbstractSequence {

  /* Construct the sequence. */
  public A000292() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).divide(6);
  }
}
