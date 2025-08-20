package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079554 a(n) = floor( d(n) * log(n) /  2 ), where d() = A000005.
 * @author Sean A. Irvine
 */
public class A079554 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(Functions.SIGMA0.z(mN)).divide(CR.TWO).floor();
  }
}
