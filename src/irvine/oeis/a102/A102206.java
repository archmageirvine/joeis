package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102206.
 * @author Sean A. Irvine
 */
public class A102206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102206() {
    super(new long[] {1, -5, 5}, new long[] {3, 8, 27});
  }
}
