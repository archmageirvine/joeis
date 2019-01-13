package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065101.
 * @author Sean A. Irvine
 */
public class A065101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065101() {
    super(new long[] {-1, 12}, new long[] {2, 24});
  }
}
