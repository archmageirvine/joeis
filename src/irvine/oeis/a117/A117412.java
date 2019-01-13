package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117412.
 * @author Sean A. Irvine
 */
public class A117412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117412() {
    super(new long[] {-1, 2}, new long[] {200, 400});
  }
}
