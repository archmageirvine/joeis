package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052181 Partial sums of A050483.
 * @author Sean A. Irvine
 */
public class A052181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052181() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 12, 72, 300, 990, 2772, 6864, 15444, 32175});
  }
}
