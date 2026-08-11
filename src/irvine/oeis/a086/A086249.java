package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086249 Number of base-2 Fermat pseudoprimes x that have ord(2,x) = n.
 * @author Sean A. Irvine
 */
public class A086249 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    for (final Z d : Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(1)).divisors()) {
      if (!d.isOne() && d.subtract(1).mod(mN) == 0 && !d.isProbablePrime() && Functions.ORDER.z(d, Z.TWO).equals(mN)) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}
