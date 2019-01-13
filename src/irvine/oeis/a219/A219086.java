package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219086.
 * @author Sean A. Irvine
 */
public class A219086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219086() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 39, 150, 410});
  }
}
