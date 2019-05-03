package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259163 Positive heptagonal numbers <code>(A000566)</code> that are triangular numbers <code>(A000217)</code> divided by 2.
 * @author Sean A. Irvine
 */
public class A259163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259163() {
    super(new long[] {1, -1, -2079362, 2079362, 1}, new long[] {18, 189, 37727235, 393298308, 78448579122960L});
  }
}
