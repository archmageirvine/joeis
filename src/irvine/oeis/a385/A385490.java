package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385490 Least integer k such that the sum of its anti-divisors is equal to k - n.
 * @author Sean A. Irvine
 */
public class A385490 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.ANTISIGMA1.z(++k).equals(k - mN)) {
        return Z.valueOf(k);
      }
    }
  }
}
