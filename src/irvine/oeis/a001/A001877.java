package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001877 Number of divisors of n of the form 5k+2; a(0) = 0.
 * @author Sean A. Irvine
 */
public class A001877 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long c = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.mod(5) == 2) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
