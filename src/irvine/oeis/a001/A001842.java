package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001842 Number of divisors of n of the form 4*k+3.
 * @author Sean A. Irvine
 */
public class A001842 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if ((d.longValue() & 3) == 3) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
