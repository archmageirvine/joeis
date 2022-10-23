package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001785 Second order reciprocal Stirling number (Fekete) [[2n+4, n]]. The number of n-orbit permutations of a (2n+4)-set with at least 2 elements in each orbit. Also known as associated Stirling numbers of the first kind (e.g., Comtet).
 * @author Sean A. Irvine
 */
public class A001785 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Stirling.associatedFirstKind(2 * mN + 4, mN);
  }
}
