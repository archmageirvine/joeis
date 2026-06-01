package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082744 Smallest k such that n*k + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A082744 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Sequence palin = new A002113().skip(2);
    while (true) {
      final Z p = palin.next();
      if (p.mod(mN) == 1) {
        return p.subtract(1).divide(mN);
      }
    }
  }
}

