package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001226 Lerch's function q_2(n) = (2^{phi(t)} - 1)/t where t = 2*n - 1.
 * @author Sean A. Irvine
 */
public class A001226 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(Functions.PHI.l(mN)).subtract(1).divide(mN);
  }
}
