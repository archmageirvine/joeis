package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071100.
 * @author Sean A. Irvine
 */
public class A071100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071100() {
    super(new long[] {-1, 2, 2, 2}, new long[] {5, 13, 37, 109});
  }
}
