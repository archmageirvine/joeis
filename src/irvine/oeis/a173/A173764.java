package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173764 (3*10^n+51)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173764() {
    super(new long[] {-10, 11}, new long[] {9, 39});
  }
}
