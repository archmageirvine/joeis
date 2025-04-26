package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077009 Jacobi symbol(phi(2n+1),2n+1).
 * @author Sean A. Irvine
 */
public class A077009 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.JACOBI.z(Functions.PHI.l(mN), mN);
  }
}

