package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078774 a(n) = n*phi(n*phi(n)).
 * @author Sean A. Irvine
 */
public class A078774 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PHI.z(Functions.PHI.z(++mN).multiply(mN)).multiply(mN);
  }
}

