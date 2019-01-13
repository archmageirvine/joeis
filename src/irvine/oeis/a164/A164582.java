package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164582.
 * @author Sean A. Irvine
 */
public class A164582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164582() {
    super(new long[] {-1, 5}, new long[] {2, 3});
  }
}
