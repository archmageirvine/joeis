package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192395.
 * @author Sean A. Irvine
 */
public class A192395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192395() {
    super(new long[] {2, 1, -2, 2}, new long[] {0, 0, 0, 1});
  }
}
