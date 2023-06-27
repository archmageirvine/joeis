package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254782 Indices of centered hexagonal numbers (A003215) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A254782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254782() {
    super(1, new long[] {1, -23, 23}, new long[] {1, 11, 231});
  }
}
