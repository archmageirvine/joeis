package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243579 Integers of the form <code>8k+7</code> that can be written as a sum of four distinct squares of the form m, <code>m+2, m+4, m+5</code>, where m <code>== 1 (mod 4)</code>.
 * @author Sean A. Irvine
 */
public class A243579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243579() {
    super(new long[] {1, -3, 3}, new long[] {71, 255, 567});
  }
}
