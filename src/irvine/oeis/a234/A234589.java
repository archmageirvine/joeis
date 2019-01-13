package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234589.
 * @author Sean A. Irvine
 */
public class A234589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234589() {
    super(new long[] {1, 1, -1, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 128});
  }
}
