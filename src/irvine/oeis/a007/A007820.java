package irvine.oeis.a007;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007820 Stirling numbers of second kind <code>S(2n,n)</code>.
 * @author Sean A. Irvine
 */
public class A007820 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(2 * mN, mN);
  }
}
