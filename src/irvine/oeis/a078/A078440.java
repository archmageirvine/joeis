package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078440 Numbers n with property that n is not a power of 2 and the finite sequence n, f(n), f(f(n)), ...., 1 in the Collatz (or 3x + 1) problem contains exactly one prime. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078440 extends Sequence1 {

  private long mN = 20;

  private boolean is(final long n) {
    Z t = Z.valueOf(n);
    while (!t.isOne()) {
      if (Z.TWO.equals(t)) {
        return true;
      }
      if (t.isProbablePrime()) {
        return false;
      }
      t = Functions.COLLATZ.z(t);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if ((++mN & (mN - 1)) != 0 && is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

