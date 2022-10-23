package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005094 Number of distinct primes of the form 4k+1 dividing n minus number of distinct primes of the form 4k+3 dividing n.
 * @author Sean A. Irvine
 */
public class A005094 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      final long r = p.mod(4);
      if (r == 3) {
        --c;
      } else if (r == 1 && !Z.ONE.equals(p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

