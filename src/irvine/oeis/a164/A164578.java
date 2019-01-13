package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164578.
 * @author Sean A. Irvine
 */
public class A164578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164578() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {10, 23, 65, 94, 168});
  }
}
