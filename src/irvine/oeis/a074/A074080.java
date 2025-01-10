package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a073.A073346;

/**
 * A074080 Triangle T(n,k) (listed in order T(1,0), T(2,0), T(2,1), T(3,0), T(3,1), T(3,2), T(4,0), etc.) giving the number of 2^k-cycles that occur in the n-th sub-permutation of A069767/A069768 (i.e., in the range [A014137(n-1)..A014138(n-1)] inclusive).
 * @author Sean A. Irvine
 */
public class A074080 extends A073346 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM).divide(Z.ONE.shiftLeft(mM));
  }
}
