package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007422.
 * @author Sean A. Irvine
 */
public class A007422 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      for (final Z d : Cheetah.factor(++mN).divisors()) {
        prod = prod.multiply(d);
      }
      if (prod.equals(Z.valueOf(mN).square())) {
        return Z.valueOf(mN);
      }
    }
  }
}
