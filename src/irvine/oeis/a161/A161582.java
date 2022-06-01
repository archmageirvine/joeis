package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161582 The list of the k values in the common solutions to the 2 equations 5*k+1=A^2, 9*k+1=B^2.
 * @author Sean A. Irvine
 */
public class A161582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161582() {
    super(new long[] {1, -48, 48}, new long[] {0, 7, 336});
  }
}
