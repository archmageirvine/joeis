package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186575.
 * @author Sean A. Irvine
 */
public class A186575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186575() {
    super(new long[] {2, 1, 1}, new long[] {1, 3, 10});
  }
}
