package irvine.oeis.a008;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008299.
 * @author Sean A. Irvine
 */
public class A008299 implements Sequence {

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 1;
    }
    return Stirling.associatedSecondKind(2, mN, mM);
  }
}
