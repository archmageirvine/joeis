package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121628.
 * @author Sean A. Irvine
 */
public class A121628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121628() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 21, 114, 333});
  }
}
