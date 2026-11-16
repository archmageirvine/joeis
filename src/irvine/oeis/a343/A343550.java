package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A343550 Numbers k &gt; 9 such that the number m formed by inserting a digit 0 between each pair of digits in k is divisible by k.
 * @author Sean A. Irvine
 */
public class A343550 extends FilterNumberSequence {

  /**
   * Test for the property of A343550.
   * @param k number to test
   * @return true if a term
   */
  public static boolean is(final long k) {
    if (k < 10) {
      return false;
    }
    Z t = Z.ZERO;
    Z m = Z.ONE;
    long j = k;
    while (j != 0) {
      t = t.add(m.multiply(j % 10));
      m = m.multiply(100);
      j /= 10;
    }
    return t.mod(k) == 0;
  }

  /** Construct the sequence. */
  public A343550() {
    super(1, 10, A343550::is);
  }
}
