package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;
import irvine.oeis.a400.A400878;

/**
 * A079365 Binary expansion of a Chaitin Omega number Omega_U.
 * @author Gregory Morse
 */
public class A079365 extends NoncomputableSequence {

  private static long[] prefix() {
    final Z num = A400878.haltingSumNumerator();
    final long[] bits = new long[64];
    for (int k = 0; k < bits.length; ++k) {
      bits[k] = num.testBit(A400878.SUM_BITS - 1 - k) ? 1 : 0;
    }
    return bits;
  }

  /** Construct the sequence. */
  public A079365() {
    super(prefix());
  }
}
