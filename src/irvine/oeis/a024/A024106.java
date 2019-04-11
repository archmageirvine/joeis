package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024106 <code>a(n) = 9^n-n^5</code>.
 * @author Sean A. Irvine
 */
public class A024106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024106() {
    super(new long[] {9, -55, 141, -195, 155, -69, 15}, new long[] {1, 8, 49, 486, 5537, 55924, 523665});
  }
}
