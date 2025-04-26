package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077010 Jacobi symbol(sigma(2n+1),2n+1).
 * @author Sean A. Irvine
 */
public class A077010 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.JACOBI.z(Functions.SIGMA1.z(mN), mN);
  }
}

