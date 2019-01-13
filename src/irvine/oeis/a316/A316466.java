package irvine.oeis.a316;

import irvine.oeis.LinearRecurrence;

/**
 * A316466.
 * @author Sean A. Irvine
 */
public class A316466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316466() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 44});
  }
}
