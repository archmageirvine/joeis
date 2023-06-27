package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161595 The list of the A values in the common solutions to the 2 equations 15*k+1=A^2, 19*k+1=B^2.
 * @author Sean A. Irvine
 */
public class A161595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161595() {
    super(1, new long[] {-1, 17}, new long[] {1, 16});
  }
}
