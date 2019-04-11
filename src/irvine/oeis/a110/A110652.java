package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110652 <code>n^2</code> followed by <code>n^3</code> followed by <code>n^4</code> followed by n.
 * @author Sean A. Irvine
 */
public class A110652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110652() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 4, 8, 16, 2, 9, 27, 81, 3, 16, 64, 256, 4, 25, 125, 625, 5});
  }
}
