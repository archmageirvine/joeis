package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000907 Second-order reciprocal Stirling number (Fekete) a(n) = [[2n+2, n]]. The number of n-orbit permutations of a (2n+2)-set with at least 2 elements in each orbit. Also known as associated Stirling numbers of the first kind (e.g., Comtet).
 * @author Sean A. Irvine
 */
public class A000907 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.associatedFirstKind(2 * mN + 2, mN);
  }
}

