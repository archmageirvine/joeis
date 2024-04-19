package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A049411 Triangle read by rows, the Bell transform of n!*binomial(5,n) (without column 0).
 * @author Sean A. Irvine
 */
public class A049411 extends A049327 {


  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).divide(Z.SIX.pow(mN - mM));
  }
}
