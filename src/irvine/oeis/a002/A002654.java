package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.factor.Cheetah;

/**
 * A002654 Number of ways of writing n as a sum of at most two nonzero squares, where order matters; also (number of divisors of n of form <code>4m+1) -</code> (number of divisors of form <code>4m+3)</code>.
 * @author Sean A. Irvine
 */
public class A002654 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final long r = d.mod(4);
      if (r == 1) {
        ++c;
      } else if (r == 3) {
        --c;
      }
    }
    return Z.valueOf(c);
  }
}
