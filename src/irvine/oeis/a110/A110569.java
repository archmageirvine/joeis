package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110569 Period 6: repeat <code>[2, 1, 3, 3, 1, 2]</code>.
 * @author Sean A. Irvine
 */
public class A110569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110569() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {2, 1, 3, 3, 1});
  }
}
