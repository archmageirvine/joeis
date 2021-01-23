package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135098 First differences of A135094.
 * @author Sean A. Irvine
 */
public class A135098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135098() {
    super(new long[] {-4, 2, 2}, new long[] {1, 2, 5});
  }
}
