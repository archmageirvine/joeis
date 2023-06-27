package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173805 a(n) = (6*10^n-51)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173805() {
    super(1, new long[] {-10, 11}, new long[] {1, 61});
  }
}
