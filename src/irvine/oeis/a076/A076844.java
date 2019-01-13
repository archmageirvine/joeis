package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076844.
 * @author Sean A. Irvine
 */
public class A076844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076844() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 3, 5, 9, 5, 3});
  }
}
