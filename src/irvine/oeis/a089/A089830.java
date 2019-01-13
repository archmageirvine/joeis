package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089830.
 * @author Sean A. Irvine
 */
public class A089830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089830() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 3, 9, 24, 57, 122});
  }
}
