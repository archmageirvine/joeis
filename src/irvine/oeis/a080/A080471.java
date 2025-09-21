package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A080454.
 * @author Sean A. Irvine
 */
public class A080471 extends Sequence1 {

  private long mN = 0;

  static boolean is(Z f, long n) {
    while (n != 0 && !f.isZero()) {
      final Z[] qr = f.divideAndRemainder(10);
      if (qr[1].equals(n % 10)) {
        n /= 10;
      }
      f = qr[0];
    }
    return n == 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Sequence f = new A000045();
    while (true) {
      final Z t = f.next();
      if (is(t, mN)) {
        return t;
      }
    }
  }
}

