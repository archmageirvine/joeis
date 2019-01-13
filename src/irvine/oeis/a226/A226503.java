package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226503.
 * @author Sean A. Irvine
 */
public class A226503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226503() {
    super(new long[] {1, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
