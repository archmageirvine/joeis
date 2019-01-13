package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088132.
 * @author Sean A. Irvine
 */
public class A088132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088132() {
    super(new long[] {-1, 0, 4}, new long[] {1, 3, 12});
  }
}
