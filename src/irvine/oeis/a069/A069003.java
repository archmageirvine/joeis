package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069003 Smallest integer d such that n^2 + d^2 is a prime number.
 * @author Sean A. Irvine
 */
public class A069003 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    for (long m = 1; m <= mN; ++m) {
      if (n2.add(Z.valueOf(m).square()).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
    throw new RuntimeException();
  }
}

