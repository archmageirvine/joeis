package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001784 Second-order reciprocal Stirling number (Fekete) a(n) = [[2n+3, n]]. The number of n-orbit permutations of a (2n+3)-set with at least 2 elements in each orbit. Also known as associated Stirling numbers of the first kind (e.g., Comtet).
 * @author Sean A. Irvine
 */
public class A001784 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Functions.ASSOCIATED_STIRLING1.z(2 * mN + 3, mN);
  }
}
