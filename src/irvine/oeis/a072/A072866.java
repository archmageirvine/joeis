package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072866 Smallest k &gt; 1 dividing tau(k*2^n) (cf. A000005).
 * @author Sean A. Irvine
 */
public class A072866 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    long k = 1;
    while (true) {
      if (Functions.SIGMA0.z(t.multiply(++k)).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

