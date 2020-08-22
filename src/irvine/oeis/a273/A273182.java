package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273182 a(n) is the second number in a triple consisting of 3 numbers, which when squared are part of a right diagonal of a magic square of squares.
 * @author Sean A. Irvine
 */
public class A273182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273182() {
    super(new long[] {-1, 6}, new long[] {14, 84});
  }
}
