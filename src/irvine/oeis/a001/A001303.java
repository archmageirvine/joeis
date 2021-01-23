package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001303 Stirling numbers of first kind, s(n+3, n), negated.
 * @author Sean A. Irvine
 */
public class A001303 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.firstKind(mN + 3, mN).negate();
  }
}
