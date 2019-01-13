package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192387.
 * @author Sean A. Irvine
 */
public class A192387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192387() {
    super(new long[] {-16, -8, 12, 2}, new long[] {0, 2, 4, 32});
  }
}
