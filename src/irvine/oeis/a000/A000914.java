package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000914 Stirling numbers of the first kind: s(n+2, <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A000914 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.firstKind(mN + 2, mN);
  }
}

