package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101265.
 * @author Sean A. Irvine
 */
public class A101265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101265() {
    super(new long[] {1, -5, 5}, new long[] {1, 2, 6});
  }
}
