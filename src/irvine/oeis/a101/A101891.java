package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101891.
 * @author Sean A. Irvine
 */
public class A101891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101891() {
    super(new long[] {1, 2, -5, 4}, new long[] {1, 1, 2, 4});
  }
}
