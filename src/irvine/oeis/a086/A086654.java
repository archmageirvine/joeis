package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086654 Smallest number a(n) &gt; n such that a(n)! contains n! as a substring.
 * @author Sean A. Irvine
 */
public class A086654 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;

  private boolean is(Z g, final Z f, final Z m) {
    while (g.compareTo(f) >= 0) {
      if (g.mod(m).equals(f)) {
        return true;
      }
      g = g.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Z mod = Z.TEN.pow(Functions.DIGIT_LENGTH.l(mF));
    Z g = mF;
    long m = mN;
    while (true) {
      g = g.multiply(++m);
      if (is(g, mF, mod)) {
        return Z.valueOf(m);
      }
    }
  }
}
