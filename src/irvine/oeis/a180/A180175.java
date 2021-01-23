package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180175 Diagonal sums of A164844.
 * @author Sean A. Irvine
 */
public class A180175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180175() {
    super(new long[] {-10, -9, 11}, new long[] {1, 10, 101});
  }
}
