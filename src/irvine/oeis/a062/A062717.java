package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062717.
 * @author Sean A. Irvine
 */
public class A062717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062717() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 8, 20, 28});
  }
}
