package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164785.
 * @author Sean A. Irvine
 */
public class A164785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164785() {
    super(new long[] {-5, 6}, new long[] {1, 21});
  }
}
