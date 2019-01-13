package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110426.
 * @author Sean A. Irvine
 */
public class A110426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110426() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 3, -5, -30});
  }
}
