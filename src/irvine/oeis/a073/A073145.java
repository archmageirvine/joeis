package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073145.
 * @author Sean A. Irvine
 */
public class A073145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073145() {
    super(new long[] {1, -1, -1}, new long[] {3, -1, -1});
  }
}
