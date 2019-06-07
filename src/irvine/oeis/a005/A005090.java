package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005090 Number of primes <code>= 2 mod 3</code> dividing <code>n</code>.
 * @author Sean A. Irvine
 */
public class A005090 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(3) == 2) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

