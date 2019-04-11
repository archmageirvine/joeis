package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110651 <code>n^2</code> followed by <code>n^4</code> followed by <code>n^3</code> followed by n.
 * @author Sean A. Irvine
 */
public class A110651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110651() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 4, 16, 8, 2, 9, 81, 27, 3, 16, 256, 64, 4, 25, 625, 125, 5});
  }
}
