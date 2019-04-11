package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007624 Product of proper divisors of <code>n =</code> n^k, k&gt;1.
 * @author Sean A. Irvine
 */
public class A007624 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      for (final Z d : Cheetah.factor(++mN).divisors()) {
        if (d.longValue() != mN) {
          prod = prod.multiply(d);
        }
      }
      if (!Z.ONE.equals(prod) && !prod.equals(Z.valueOf(mN))) {
        while (prod.mod(mN) == 0) {
          prod = prod.divide(mN);
        }
        if (Z.ONE.equals(prod)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

