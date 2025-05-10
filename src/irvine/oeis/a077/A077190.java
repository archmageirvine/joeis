package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a173.A173426;

/**
 * A077190 a(n) = A077189(n)/(2n-1).
 * @author Sean A. Irvine
 */
public class A077190 extends Sequence1 {

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
        return s.divide(2 * mN - 1);
      }
    }
  }
}

