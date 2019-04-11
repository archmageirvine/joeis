package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289783 p-INVERT of the <code>(3^n),</code> where p(S) <code>= 1 -</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A289783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289783() {
    super(new long[] {-11, 7}, new long[] {1, 5});
  }
}
