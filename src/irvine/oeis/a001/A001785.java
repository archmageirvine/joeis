package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001785.
 * @author Sean A. Irvine
 */
public class A001785 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Stirling.associatedFirstKind(2 * mN + 4, mN);
  }
}
