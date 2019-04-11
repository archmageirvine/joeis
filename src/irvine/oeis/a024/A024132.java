package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024132 <code>a(n) = 11^n - n^5</code>.
 * @author Sean A. Irvine
 */
public class A024132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024132() {
    super(new long[] {11, -67, 171, -235, 185, -81, 17}, new long[] {1, 10, 89, 1088, 13617, 157926, 1763785});
  }
}
