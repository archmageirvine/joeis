package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099944 Number of 3 X n binary matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1) and (11;0).
 * @author Sean A. Irvine
 */
public class A099944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099944() {
    super(3, new long[] {-2, 3}, new long[] {76, 164});
  }
}
