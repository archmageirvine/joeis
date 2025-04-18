package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075054 Smallest k such that (n+1)(n+2)...(n+k) is divisible by n!.
 * @author Sean A. Irvine
 */
public class A075054 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    Z prod = Z.ONE;
    long k = 0;
    while (true) {
      prod = prod.modMultiply(Z.valueOf(mN + ++k), f);
      if (prod.isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
