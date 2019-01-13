package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110064.
 * @author Sean A. Irvine
 */
public class A110064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110064() {
    super(new long[] {-1, 1, 0, 0}, new long[] {1, -4, 0, 1});
  }
}
