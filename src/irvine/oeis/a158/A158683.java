package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158683 <code>1024*n^2 - 32</code>.
 * @author Sean A. Irvine
 */
public class A158683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158683() {
    super(new long[] {1, -3, 3}, new long[] {992, 4064, 9184});
  }
}
