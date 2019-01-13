package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138189.
 * @author Sean A. Irvine
 */
public class A138189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138189() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, -2, -2, 1, -4, -4});
  }
}
