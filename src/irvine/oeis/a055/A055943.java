package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055943 Smallest k &gt;1 such that k | Sigma(k) - n.
 * @author Sean A. Irvine
 */
public class A055943 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Functions.SIGMA.z(++k).subtract(mN).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
