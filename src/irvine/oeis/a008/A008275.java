package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008275.
 * @author Sean A. Irvine
 */
public class A008275 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Stirling.firstKind(mN, mM);
  }
}

