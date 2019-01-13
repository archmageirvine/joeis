package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000504.
 * @author Sean A. Irvine
 */
public class A000504 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.associatedSecondKind(2, 2 * mN + 3, mN);
  }
}
