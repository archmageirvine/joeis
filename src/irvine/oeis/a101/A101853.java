package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101853.
 * @author Sean A. Irvine
 */
public class A101853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101853() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 18, 37, 64});
  }
}
