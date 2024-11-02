package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072865 Smallest k &gt; 1 dividing tau(k*n) (cf. A000005).
 * @author Sean A. Irvine
 */
public class A072865 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 1;
    while (true) {
      if (Functions.SIGMA0.z(mN.multiply(++k)).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

