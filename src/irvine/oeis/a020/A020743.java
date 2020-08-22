package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020743 Pisot sequence L(7,10).
 * @author Sean A. Irvine
 */
public class A020743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020743() {
    super(new long[] {-1, 0, 2}, new long[] {7, 10, 15});
  }
}
