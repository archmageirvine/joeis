package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081844 Number of irreducible factors of x^(2n+1) - 1 over GF(2).
 * @author Sean A. Irvine
 */
public class A081844 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(Functions.PHI.z(d).divide(new IntegersMod(d).ord(Z.TWO.mod(d))));
    }
    return sum;
  }
}
