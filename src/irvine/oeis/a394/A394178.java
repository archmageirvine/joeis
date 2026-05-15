package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394178 Triangle read by rows: T(n, k) is the Frobenius number for n and k if n and k coprime, and 0 otherwise, for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A394178 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.GCD.l(mN, mM) != 1 ? Z.ZERO : Z.valueOf(mN * mM - mN - mM);
  }
}
