package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110009 n followed by <code>n^4</code> followed by <code>n^2</code> followed by <code>n^3</code>.
 * @author Sean A. Irvine
 */
public class A110009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110009() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 16, 4, 8, 3, 81, 9, 27, 4, 256, 16, 64, 5, 625, 25, 125});
  }
}
