package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072260 a(n) = ((6*n+19)*4^n - 1)/3.
 * @author Sean A. Irvine
 */
public class A072260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072260() {
    super(new long[] {16, -24, 9}, new long[] {6, 33, 165});
  }
}
