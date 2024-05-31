package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005464 Number of simplices in barycentric subdivision of n-simplex.
 * @author Sean A. Irvine
 */
public class A005464 extends AbstractSequence {

  /** Construct the sequence. */
  public A005464() {
    super(5);
  }

  private long mN = 6;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 8) {
      mF = mF.multiply(mN - 7);
    }
    return Functions.STIRLING2.z(mN, mN - 6).multiply(mF);
  }
}
