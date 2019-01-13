package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212972.
 * @author Sean A. Irvine
 */
public class A212972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212972() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 8, 24, 53, 100, 168});
  }
}
