package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195314.
 * @author Sean A. Irvine
 */
public class A195314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195314() {
    super(new long[] {1, -3, 3}, new long[] {1, 29, 85});
  }
}
