package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164828.
 * @author Sean A. Irvine
 */
public class A164828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164828() {
    super(new long[] {-1, 0, 11, 0, 11, 0}, new long[] {1, 1, 11, 120, 122, 1331});
  }
}
