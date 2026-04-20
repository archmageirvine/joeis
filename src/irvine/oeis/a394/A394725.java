package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394725 Numbers k such that the sum of its proper divisors, each to some power greater than zero, is equal to 2*k.
 * @author Sean A. Irvine
 */
public class A394725 extends Sequence1 {

  private long mN = 5;

  private boolean is(final Z[] d, final Z n, final int pos) {
    if (pos == 0) {
      return n.isZero();
    }
    final Z f = d[pos - 1];
    Z g = f;
    while (g.compareTo(n) <= 0) {
      if (is(d, n.subtract(g), pos - 1)) {
        return true;
      }
      if (g.isOne()) {
        break; // avoid powering 1
      }
      g = g.multiply(f);
    }
    return false;
  }

  private boolean is(final long n) {
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    return is(d, Z.valueOf(2 * n), d.length - 1); // exclude n is a divisor
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
