package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084637.
 * @author Sean A. Irvine
 */
public class A084637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084637() {
    super(new long[] {2, -13, 36, -55, 50, -27, 8}, new long[] {1, 1, 2, 4, 8, 16, 32});
  }
}
