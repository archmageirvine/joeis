package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076340.
 * @author Sean A. Irvine
 */
public class A076360 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Functions.SIGMA1.z(++mN)).subtract(Functions.SIGMA1.z(Functions.SIGMA0.z(mN)));
  }
}
