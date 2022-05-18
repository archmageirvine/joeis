package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005088 Number of primes = 1 mod 3 dividing n.
 * @author Sean A. Irvine
 */
public class A005088 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (p.mod(3) == 1 && !Z.ONE.equals(p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

