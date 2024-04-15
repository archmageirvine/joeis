package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049605 Smallest k&gt;1 such that k divides sigma(k*n).
 * @author Sean A. Irvine
 */
public class A049605 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 1;
    while (true) {
      if (Functions.SIGMA.z(mN.multiply(++k)).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

