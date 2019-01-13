package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276289.
 * @author Sean A. Irvine
 */
public class A276289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276289() {
    super(new long[] {8, -12, 6}, new long[] {0, 1, 7});
  }
}
