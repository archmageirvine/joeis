package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a173.A173426;

/**
 * A077189 Smallest concatenation 123...(k-1) k (k-1)...321 (a concatenation of natural numbers from 1 to k and back to 1) that is a multiple of 2n-1, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077189 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 5 == 3) {
      return Z.ZERO;
    }
    final Sequence seq = new A173426();
    while (true) {
      final Z s = seq.next();
      if (s.mod(2 * mN - 1) == 0) {
        return s;
      }
    }
  }
}

