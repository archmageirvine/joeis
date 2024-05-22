package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A053815 Floor(n / (sum of proper divisors of n)).
 * @author Sean A. Irvine
 */
public class A053815 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide(Functions.SIGMA1.z(mN).subtract(mN));
  }
}

