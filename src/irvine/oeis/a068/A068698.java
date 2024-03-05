package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068698 Smallest primes in the reverse concatenation of n consecutive odd numbers.
 * @author Sean A. Irvine
 */
public class A068698 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    long k = -1;
    final StringBuilder sb = new StringBuilder();
    while (true) {
      k += 2;
      sb.setLength(0);
      for (long j = 0, i = k + 2 * mN - 2; j < mN; ++j, i -= 2) {
        sb.append(i);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
