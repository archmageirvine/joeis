package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152881 Positions of those 1's that are followed by <code>a 0,</code> summed over all Fibonacci binary words of length <code>n.</code> A Fibonacci binary word is a binary word having no 00 subword.
 * @author Sean A. Irvine
 */
public class A152881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152881() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 1, 5, 15, 40, 95});
  }
}
