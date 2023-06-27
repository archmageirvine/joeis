package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195314 Centered 28-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195314() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 29, 85});
  }
}
