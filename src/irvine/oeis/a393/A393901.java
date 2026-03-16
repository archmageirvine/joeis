package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393901 Triangle read by rows: T(n,k) = (2*n + k - 1) * 2^(k-2).
 * @author Sean A. Irvine
 */
public class A393901 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;


  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(2 * mN + mM - 1).shiftLeft(mM - 2);
  }
}
