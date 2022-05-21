package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057103 Triangle of congrua: T(n,k) = 4*n*k(n^2-k^2) with n&gt;k&gt;0 and starting at T(2,1) = 24. A055096(n)^2 + a(n) is a square, as is A055096(n)^2 - a(n).
 * @author Sean A. Irvine
 */
public class A057103 implements Sequence {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).multiply(mM).multiply(mN * mN - mM * mM).multiply(4);
  }
}
