package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273189 <code>a(n)</code> is the third number in a triple consisting of 3 numbers, which when squared are part of a right diagonal of a magic square of squares.
 * @author Sean A. Irvine
 */
public class A273189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273189() {
    super(new long[] {1, -7, 7}, new long[] {51, 401, 2451});
  }
}
