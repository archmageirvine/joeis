package irvine.oeis.a007;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007820 Stirling numbers of second kind S(2n,n).
 * @author Sean A. Irvine
 */
public class A007820 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(2 * mN, mN);
  }
}
