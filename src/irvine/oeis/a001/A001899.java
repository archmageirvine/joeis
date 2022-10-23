package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001899 Number of divisors of n of form 5k+4; a(0) = 0.
 * @author Sean A. Irvine
 */
public class A001899 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long c = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.mod(5) == 4) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
