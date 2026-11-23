package irvine.oeis.a349;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a353.A353314;

/**
 * A349876 If n is divisible by 3, a(n) = n; otherwise n = 3k + r with r in {1, 2} and a(n) = a(5k + r + 3). a(n) = -1 if no multiple of three will be ever reached by iterating A353314.
 * @author Gregory Morse
 */
public class A349876 extends Sequence0 {
  private static final int LIMIT = 10000;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return firstMultiple(mN, false);
  }

  static Z firstMultiple(final Z n, final boolean count) {
    Z t = n;
    for (int k = 0; k < LIMIT; ++k) {
      if (t.mod(3) == 0) {
        return count ? Z.valueOf(k) : t;
      }
      t = A353314.step(t);
    }
    // Failing to reach a multiple of three is not evidence of nontermination.
    throw new UnsupportedOperationException("Orbit unresolved within the iteration limit");
  }
}
