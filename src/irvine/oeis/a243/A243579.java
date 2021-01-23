package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243579 Integers of the form 8k+7 that can be written as a sum of four distinct squares of the form m, m+2, m+4, m+5, where m == 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A243579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243579() {
    super(new long[] {1, -3, 3}, new long[] {71, 255, 567});
  }
}
