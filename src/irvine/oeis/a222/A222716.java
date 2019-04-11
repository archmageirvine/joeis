package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222716 Numbers which are both the sum of <code>n+1</code> consecutive triangular numbers and the sum of the <code>n-1</code> immediately following triangular numbers.
 * @author Sean A. Irvine
 */
public class A222716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222716() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 100, 460, 1460, 3710});
  }
}
