package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254228.
 * @author Sean A. Irvine
 */
public class A254228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254228() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {1, 41, 185, 13105, 59473});
  }
}
