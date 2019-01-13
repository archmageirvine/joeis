package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074509.
 * @author Sean A. Irvine
 */
public class A074509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074509() {
    super(new long[] {21, -31, 11}, new long[] {3, 11, 59});
  }
}
