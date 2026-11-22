package irvine.oeis.a349;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

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
    Z t = mN;
    for (int k = 0; k < LIMIT; ++k) {
      final long r = t.mod(3);
      if (r == 0) {
        return t;
      }
      t = t.divide(3).multiply(5).add(3 + r);
    }
    // Failing to reach a multiple of three is not evidence of nontermination.
    throw new UnsupportedOperationException("Orbit unresolved within the iteration limit");
  }
}
