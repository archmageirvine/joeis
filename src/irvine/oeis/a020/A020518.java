package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020518 <code>10th</code> cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020518() {
    super(new long[] {1024, -1984, 1240, -310, 31}, new long[] {1, 11, 205, 3641, 61681});
  }
}
