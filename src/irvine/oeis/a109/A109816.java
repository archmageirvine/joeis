package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109816 <code>n^2</code> followed by n followed by <code>n^3</code>.
 * @author Sean A. Irvine
 */
public class A109816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109816() {
    super(new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {1, 1, 1, 4, 2, 8, 9, 3, 27, 16, 4, 64});
  }
}
