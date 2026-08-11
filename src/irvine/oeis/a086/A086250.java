package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086250 Smallest base-2 Fermat pseudoprime x that has ord(2,x) = n, or 0 if one does not exist.
 * @author Sean A. Irvine
 */
public class A086250 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (final Z d : Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(1)).divisorsSorted()) {
      if (!d.isOne() && d.subtract(1).mod(mN) == 0 && !d.isProbablePrime() && Functions.ORDER.z(d, Z.TWO).equals(mN)) {
        return d;
      }
    }
    return Z.ZERO;
  }
}

