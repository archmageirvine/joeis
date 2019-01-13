package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192960.
 * @author Sean A. Irvine
 */
public class A192960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192960() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 7, 15});
  }
}
