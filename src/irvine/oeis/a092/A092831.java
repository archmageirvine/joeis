package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092831 Indices of prime Motzkin numbers.
 * @author Sean A. Irvine
 */
public class A092831 implements Sequence {

  private long mN = 1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z r = mA.multiply(mN - 1).multiply(3)
        .add(mB.multiply(2 * mN + 1))
        .divide(mN + 2);
      mA = mB;
      mB = r;
      if (r.isProbablePrime(10)) {
        return Z.valueOf(mN);
      }
    }
  }
}

