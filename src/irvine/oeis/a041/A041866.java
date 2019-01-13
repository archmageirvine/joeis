package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041866.
 * @author Sean A. Irvine
 */
public class A041866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041866() {
    super(new long[] {-1, 0, 128, 0}, new long[] {21, 64, 2709, 8191});
  }
}
