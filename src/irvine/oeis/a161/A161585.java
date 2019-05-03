package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161585 The list of the k values in the common solutions to the 2 equations <code>7*k+1=A^2, 11*k+1=B^2</code>.
 * @author Sean A. Irvine
 */
public class A161585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161585() {
    super(new long[] {1, -80, 80}, new long[] {0, 9, 720});
  }
}
