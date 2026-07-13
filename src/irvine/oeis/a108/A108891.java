package irvine.oeis.a108;
// manually deldel at 2026-07-12 21:04

import irvine.math.z.Z;
import irvine.oeis.a104.A104219;

/**
 * A108891 Triangle read by rows: T(n,k) = number of Schroeder (or royal) n-paths (A006318) containing k returns to the diagonal y=x. (A northeast step lying on y=x contributes a return.).
 * @author Georg Fischer
 */
public class A108891 extends A104219 {

  private long mN = 1;
  private long mK = 0;

  @Override
  public Z next() {
    ++mK;
    final Z result = super.next().multiply(Z.ONE.shiftLeft(mK));
    if (mK == mN) {
      mK = 0;
      ++mN;
    }
    return result;
  }
}
