package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078638 a(n) = rad(n*(n+1)*(n+2)*(n+3)).
 * @author Sean A. Irvine
 */
public class A078638 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.RAD.z(Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3));
  }
}
