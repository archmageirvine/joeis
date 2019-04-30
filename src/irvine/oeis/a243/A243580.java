package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243580 Integers of the form <code>8k + 7</code> that can be written as a sum of four distinct squares of the form m, m <code>+ 1</code>, m <code>+ 3</code>, m <code>+ 5</code>, where m <code>== 2 (mod 4)</code>.
 * @author Sean A. Irvine
 */
public class A243580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243580() {
    super(new long[] {1, -3, 3}, new long[] {87, 287, 615});
  }
}
