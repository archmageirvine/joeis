package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001092.
 * @author Sean A. Irvine
 */
public class A001092 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean isPrimePower(final Z z) {
    if (z.isPrime()) {
      return true;
    }
    final Z p = z.isPower();
    return p != null && p.isPrime() || Z.ONE.equals(z);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isPrimePower(mN) && (isPrimePower(mN.add(2)) || isPrimePower(mN.subtract(2)))) {
        return mN;
      }
    }
  }
}

