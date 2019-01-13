package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036799.
 * @author Sean A. Irvine
 */
public class A036799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036799() {
    super(new long[] {4, -8, 5}, new long[] {0, 2, 10});
  }
}
