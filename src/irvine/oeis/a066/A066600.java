package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066600 Sum of the digits in the n-th row of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A066600 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Z.valueOf(Functions.DIGIT_SUM.l(Binomial.binomial(mN, k))));
  }
}
