package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
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
      if (Jaguar.factor(++k).sigma().mod(Euler.phi(mN + k)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
