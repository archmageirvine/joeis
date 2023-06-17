package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005463 Number of simplices in barycentric subdivision of n-simplex.
 * @author Sean A. Irvine
 */
public class A005463 extends AbstractSequence {

  /** Construct the sequence. */
  public A005463() {
    super(4);
  }

  private long mN = 5;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 7) {
      mF = mF.multiply(mN - 6);
    }
    return Stirling.secondKind(mN, mN - 5).multiply(mF);
  }
}
