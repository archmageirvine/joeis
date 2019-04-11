package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001784 Second order reciprocal Stirling number (Fekete) <code>[[2n+3, n]].</code> The number of n-orbit permutations of a (2n+3)-set with at least 2 elements in each orbit. Also known as associated Stirling numbers of the first kind (e.g., Comtet).
 * @author Sean A. Irvine
 */
public class A001784 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Stirling.associatedFirstKind(2 * mN + 3, mN);
  }
}
