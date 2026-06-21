package irvine.oeis.a295;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A295640 Smallest k not divisible by 5 such that k*5^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A295640 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(5);
    long k = 0;
    while (++k % 5 == 0 || !mA.multiply(k).add(1).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
