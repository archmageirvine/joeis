package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052489 Largest number that is n times sum of its decimal digits.
 * @author Sean A. Irvine
 */
public class A052489 extends Sequence0 {

  // After Michel Marcus

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z nbd = Z.ONE;
    while (nbd.multiply(9 * mN).compareTo(Z.TWO.pow(nbd)) > 0) {
      nbd = nbd.add(1);
    }
    for (Z k = nbd.multiply(9 * mN); k.signum() > 0; k = k.subtract(1)) {
      if (Z.valueOf(Functions.DIGIT_SUM.l(k)).multiply(mN).equals(k)) {
        return k;
      }
    }
    return Z.ZERO;
  }
}

