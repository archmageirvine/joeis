package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071337.
 * @author Sean A. Irvine
 */
public class A071916 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(Functions.FACTORIAL.z(p).bitCount())) {
        return p;
      }
    }
  }
}
