package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015971 k is the first integer such that phi(k + n) | sigma(k).
 * @author Sean A. Irvine
 */
public class A015971 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA1.z(++k).mod(Functions.PHI.z(mN + k)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
