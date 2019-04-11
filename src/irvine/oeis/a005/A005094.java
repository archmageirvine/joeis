package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005094 Number of distinct primes of the form <code>4k+1</code> dividing n minus number of distinct primes of the form <code>4k+3</code> dividing n.
 * @author Sean A. Irvine
 */
public class A005094 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
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

