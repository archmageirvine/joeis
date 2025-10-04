package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080897 Nonnegative integers written in "base American money" - the places, from the right, are pennies, nickels, dimes, quarters, 50-cent pieces, dollars, 2 dollars, 5 dollars, 10 dollars, 20 dollars, 50 dollars, 100 dollars, ...
 * @author Sean A. Irvine
 */
public class A080897 extends Sequence0 {

  private static final long[] DENOMINATIONS = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z t = Z.ZERO;
    for (final long d : DENOMINATIONS) {
      t = t.multiply(10).add(m / d);
      m %= d;
    }
    return t;
  }
}

