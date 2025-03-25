package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076161 Numbers n such that n + sum of squares of digits of n (A258881) is a prime.
 * @author Sean A. Irvine
 */
public class A076161 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM_SQUARES.z(++mN).add(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
