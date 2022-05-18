package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001876 Number of divisors of n of form 5k+1; a(0)=0.
 * @author Sean A. Irvine
 */
public class A001876 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long c = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.mod(5) == 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
