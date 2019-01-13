package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134158.
 * @author Sean A. Irvine
 */
public class A134158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134158() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2191, 24583, 109513, 324013});
  }
}
