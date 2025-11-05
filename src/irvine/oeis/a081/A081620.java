package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005179;

/**
 * A081620 Least m with n*(n+1)/2 divisors.
 * @author Sean A. Irvine
 */
public class A081620 extends Sequence1 {

  private final DirectSequence mA = new A005179();
  private int mN = 0;

  @Override
  public Z next() {
    return mA.a(Functions.TRIANGULAR.i(++mN));
  }
}
