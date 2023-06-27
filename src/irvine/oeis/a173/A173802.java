package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173802 a(n)=(5*10^n-23)/9.
 * @author Sean A. Irvine
 */
public class A173802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173802() {
    super(1, new long[] {-10, 11}, new long[] {3, 53});
  }
}
