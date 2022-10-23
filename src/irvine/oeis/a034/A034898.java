package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034898 n-th term of A034897 is an a(n)-hyperperfect number.
 * @author Sean A. Irvine
 */
public class A034898 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z s = Jaguar.factor(++mN).sigma().subtract(mN + 1);
      if (s.signum() != 0 && Z.valueOf(mN - 1).mod(s).isZero()) {
        return Z.valueOf(mN - 1).divide(s);
      }
    }
  }
}
