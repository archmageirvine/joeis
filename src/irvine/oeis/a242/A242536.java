package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242536.
 * @author Sean A. Irvine
 */
public class A242536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242536() {
    super(new long[] {-2, 2, 3, 1}, new long[] {1, 2, 4, 12});
  }
}
