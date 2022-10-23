package irvine.oeis.a048;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048594 Triangle a(n,k) = k! * Stirling1(n,k), 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A048594 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mF = Z.ONE;
    }
    mF = mF.multiply(mM);
    return Stirling.firstKind(mN, mM).multiply(mF);
  }
}

