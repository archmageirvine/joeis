package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077539 a(n) = floor(T(n+1)!*T(n-1)!/(T(n)!)^2), where T(n) = n(n+1)/2 = the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A077539 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z d = Functions.FACTORIAL.z(Functions.TRIANGULAR.z(++mN));
    return Functions.FACTORIAL.z(Functions.TRIANGULAR.z(mN + 1)).divide(d).multiply(Functions.FACTORIAL.z(Functions.TRIANGULAR.z(mN - 1))).divide(d);
  }
}
