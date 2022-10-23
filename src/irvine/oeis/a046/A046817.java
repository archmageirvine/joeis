package irvine.oeis.a046;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046817 Triangle of generalized Stirling numbers of 2nd kind.
 * @author Sean A. Irvine
 */
public class A046817 extends Sequence0 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
    }
    if (mM == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = mM; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(Stirling.secondKind(k, mM)));
    }
    return sum;
  }
}
