package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161599 The list of the B values in the common solutions to the 2 equations 15*k + 1 = A^2, 19*k + 1 = B^2.
 * @author Sean A. Irvine
 */
public class A161599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161599() {
    super(new long[] {-1, 17}, new long[] {1, 18});
  }
}
