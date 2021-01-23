package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173193 (2*10^n+43)/9.
 * @author Sean A. Irvine
 */
public class A173193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173193() {
    super(new long[] {-10, 11}, new long[] {7, 27});
  }
}
