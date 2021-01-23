package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000915 Stirling numbers of first kind s(n+4, n).
 * @author Sean A. Irvine
 */
public class A000915 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.firstKind(mN + 4, mN);
  }
}

