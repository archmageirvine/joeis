package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110005 n followed by <code>n^2</code> followed by <code>n^4</code> followed by <code>n^3</code>.
 * @author Sean A. Irvine
 */
public class A110005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110005() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 4, 16, 8, 3, 9, 81, 27, 4, 16, 256, 64, 5, 25, 625, 125});
  }
}
