package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213763.
 * @author Sean A. Irvine
 */
public class A213763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213763() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 11, 43, 127});
  }
}
