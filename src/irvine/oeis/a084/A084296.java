package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084296 Triangle: number of distinct prime factors in n-th primorial numbers when n prime factors first appears and in n-1 subsequent integers after.
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
