package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393581 allocated for Prathamesh Koshe.
 * @author Sean A. Irvine
 */
public class A393581 extends Sequence1 {

  private long mN = 0;

  private boolean is(Z n) {
    Z r = Z.TEN;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(r) >= 0) {
        return false;
      }
      r = qr[1];
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      Z sum = Z.ZERO;
      for (int k = 0; k < s.length(); ++k) {
        sum = sum.add(Z.valueOf(s.charAt(k) - '0').pow(k + 1));
      }
      if (is(sum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
