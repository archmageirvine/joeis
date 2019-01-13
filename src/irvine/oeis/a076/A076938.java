package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076938.
 * @author Sean A. Irvine
 */
public class A076938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076938() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 1});
  }
}
