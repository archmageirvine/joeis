package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192962.
 * @author Sean A. Irvine
 */
public class A192962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192962() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 7, 15});
  }
}
