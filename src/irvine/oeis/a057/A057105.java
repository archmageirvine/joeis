package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057105 Triangle of numbers (when unsigned) related to congruum problem: T(n,k)=k^2+2nk-n^2 with n&gt;k&gt;0 and starting at T(2,1)=1.
 * @author Sean A. Irvine
 */
public class A057105 extends Sequence1 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM * mM + 2 * mN * mM - mN * mN);
  }
}
