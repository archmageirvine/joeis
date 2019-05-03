package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112627 Decimal equivalent of number defined by last k bits of the infinite binary string <code>...0011001100110011</code> (numbers with leading zeros omitted).
 * @author Sean A. Irvine
 */
public class A112627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112627() {
    super(new long[] {-16, 16, 1}, new long[] {1, 3, 19});
  }
}
