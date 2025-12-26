package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391700 a(n) = (8*n)!/(n!*(2*n)!*(5*n)!).
 * @author Sean A. Irvine
 */
public class A391700 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(8 * ++mN).divide(Functions.FACTORIAL.z(5 * mN)).divide(Functions.FACTORIAL.z(2 * mN)).divide(Functions.FACTORIAL.z(mN));
  }
}

