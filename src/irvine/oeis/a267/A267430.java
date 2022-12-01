package irvine.oeis.a267;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A267430 Squares whose digit sum is not a prime.
 * @author Georg Fischer
 */
public class A267430 extends A000290 {


  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (!Z.valueOf(ZUtils.digitSum(result)).isPrime()) {
        return result;
      }
    }
  }
}
