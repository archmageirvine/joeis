package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100455.
 * @author Sean A. Irvine
 */
public class A100455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100455() {
    super(new long[] {2, -1, 2}, new long[] {1, 3, 4});
  }
}
