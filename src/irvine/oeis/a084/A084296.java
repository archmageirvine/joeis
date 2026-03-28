package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084296 Triangle read by rows: T(n,k) = omega(prime(n)#+k) where prime(n)# is the n-th primorial (A002110) and omega is the number of distinct prime factors (A001221), 0 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A084296 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.OMEGA.z(Functions.PRIMORIAL_COUNT.z(mN).add(mM));
  }
}
