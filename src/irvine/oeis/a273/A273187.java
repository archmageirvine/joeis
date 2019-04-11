package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273187 <code>a(n)</code> is the third number in a triple consisting of 3 numbers, which when squared are part of a right diagonal of magic square of squares.
 * @author Sean A. Irvine
 */
public class A273187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273187() {
    super(new long[] {1, -7, 7}, new long[] {99, 449, 2499});
  }
}
