package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001878 Number of divisors of n of form 5k+3; a(0) = 0.
 * @author Sean A. Irvine
 */
public class A001878 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long c = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.mod(5) == 3) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
