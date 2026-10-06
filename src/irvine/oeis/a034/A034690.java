package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034690 Sum of digits of all the divisors of n.
 * @author Sean A. Irvine
 */
public class A034690 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, Functions.DIGIT_SUM::z);
  }
}
