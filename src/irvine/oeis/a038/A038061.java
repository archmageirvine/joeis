package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038061 a(n) = 3^n*n^(n-1).
 * @author Sean A. Irvine
 */
public class A038061 extends AbstractSequence {

  /** Construct the sequence. */
  public A038061() {
    super(1);
  }

  protected int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return Z.valueOf(++mN).pow(mN - 1).multiply(mT);
  }
}
