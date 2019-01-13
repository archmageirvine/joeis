package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261343.
 * @author Sean A. Irvine
 */
public class A261343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261343() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 50});
  }
}
