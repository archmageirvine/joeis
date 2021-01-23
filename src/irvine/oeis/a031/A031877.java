package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a004.A004086;

/**
 * A031877 Nontrivial reversal numbers (numbers which are integer multiples of their reversals), excluding palindromic numbers and multiples of 10.
 * @author Sean A. Irvine
 */
public class A031877 extends A004086 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN % 10 != 0) {
        final Z n = Z.valueOf(mN);
        if (n.compareTo(t) > 0 && n.mod(t).isZero()) {
          return n;
        }
      }
    }
  }
}
