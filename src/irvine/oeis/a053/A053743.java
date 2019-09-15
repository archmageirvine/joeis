package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053743 Sum of numbers in range <code>10n</code> to <code>10n+9</code>.
 * @author Sean A. Irvine
 */
public class A053743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053743() {
    super(new long[] {-1, 2}, new long[] {45, 145});
  }
}
