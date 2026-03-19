package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394222 allocated for Remco Havenaar.
 * @author Sean A. Irvine
 */
public class A394222 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(Functions.GCD.l(mN, 5));
  }
}
