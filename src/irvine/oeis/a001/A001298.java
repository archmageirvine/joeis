package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001298 Stirling numbers of the second kind S(n+4, n).
 * @author Sean A. Irvine
 */
public class A001298 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(mN + 4, mN);
  }
}
