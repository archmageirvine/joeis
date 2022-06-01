package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100314 Number of 2 X n 0-1 matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1), (01;0), (10;0) and (01;1).
 * @author Sean A. Irvine
 */
public class A100314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100314() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 8});
  }
}
