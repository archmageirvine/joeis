package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078144.
 * @author Sean A. Irvine
 */
public class A385122 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Functions.PHI.l(++mN)).subtract(Functions.PHI.z(Functions.SIGMA0.l(mN)));
  }
}
