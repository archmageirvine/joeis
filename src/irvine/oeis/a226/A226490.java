package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226490.
 * @author Sean A. Irvine
 */
public class A226490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226490() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 23});
  }
}
