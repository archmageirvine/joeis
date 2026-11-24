package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;
import irvine.oeis.a400.A400878;

/**
 * A100264 Decimal expansion of Calude et al.'s non-random Chaitin's constant.
 * @author Gregory Morse
 */
public class A100264 extends NoncomputableSequence {

  private static long[] prefix() {
    // Do not infer the twentieth digit from the finite sum.
    final long[] prefix = new long[19];
    final String digits = A400878.haltingSumNumerator().multiply(Z.TEN.pow(prefix.length)).shiftRight(A400878.SUM_BITS).toString();
    for (int k = 0; k < digits.length(); ++k) {
      prefix[prefix.length - digits.length() + k] = digits.charAt(k) - '0';
    }
    return prefix;
  }

  /** Construct the sequence. */
  public A100264() {
    super(prefix());
  }
}
