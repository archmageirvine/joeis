package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214997.
 * @author Sean A. Irvine
 */
public class A214997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214997() {
    super(new long[] {-2, 2, 3}, new long[] {4, 13, 45});
  }
}
