package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049605 Smallest k&gt;1 such that k divides sigma(k*n).
 * @author Sean A. Irvine
 */
public class A049605 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 1;
    while (true) {
      if (Jaguar.factor(mN.multiply(++k)).sigma().mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

