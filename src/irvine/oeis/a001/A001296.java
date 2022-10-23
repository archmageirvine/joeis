package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001296 4-dimensional pyramidal numbers: a(n) = (3*n+1)*binomial(n+2, 3)/4. Also Stirling2(n+2, n).
 * @author Sean A. Irvine
 */
public class A001296 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(mN + 2, mN);
  }
}
