package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005091 Number of distinct primes = 3 mod 4 dividing n.
 * @author Sean A. Irvine
 */
public class A005091 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (p.mod(4) == 3) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

