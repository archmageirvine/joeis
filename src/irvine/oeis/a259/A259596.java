package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259596.
 * @author Sean A. Irvine
 */
public class A259596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259596() {
    super(new long[] {-1, 0, 0, 0, 16, 0, 0, 0}, new long[] {1, 2, 3, 5, 17, 31, 48, 79});
  }
}
