package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001297 Stirling numbers of the second kind <code>S(n+3, n)</code>.
 * @author Sean A. Irvine
 */
public class A001297 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.secondKind(mN + 3, mN);
  }
}
