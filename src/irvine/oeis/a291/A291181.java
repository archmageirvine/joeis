package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291181 p-INVERT of the positive integers, where p(S) <code>= 1 -</code> 8*S.
 * @author Sean A. Irvine
 */
public class A291181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291181() {
    super(new long[] {-1, 10}, new long[] {8, 80});
  }
}
