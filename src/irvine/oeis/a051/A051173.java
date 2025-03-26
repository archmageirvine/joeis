package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051173 Triangle read by rows: T(n, k) = lcm(n, k).
 * @author Sean A. Irvine
 */
public class A051173 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.LCM.z(mN, mM);
  }
}
