package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192907.
 * @author Sean A. Irvine
 */
public class A192907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192907() {
    super(new long[] {1, 1, 0, 3}, new long[] {0, 1, 4, 12});
  }
}
