package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073937.
 * @author Sean A. Irvine
 */
public class A073937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073937() {
    super(new long[] {1, 1, -1, 1}, new long[] {4, 1, -1, 1});
  }
}
