package irvine.oeis.a067;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067057 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN + 1, mN - 1).shiftLeft(mN - 2);
  }
}

