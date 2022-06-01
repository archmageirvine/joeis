package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161588 The list of the k values in the common solutions to the 2 equations 11*k+1=A^2, 15*k+1=B^2.
 * @author Sean A. Irvine
 */
public class A161588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161588() {
    super(new long[] {1, -168, 168}, new long[] {0, 13, 2184});
  }
}
