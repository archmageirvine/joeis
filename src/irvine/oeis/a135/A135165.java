package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135165.
 * @author Sean A. Irvine
 */
public class A135165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135165() {
    super(new long[] {-210, 247, -101, 17}, new long[] {0, 7, 61, 433});
  }
}
