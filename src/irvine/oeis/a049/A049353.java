package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a030.A030526;

/**
 * A049353 A triangle of numbers related to triangle A030526.
 * @author Sean A. Irvine
 */
public class A049353 extends A030526 {


  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).shiftRight(2L * (mN - mM));
  }
}
