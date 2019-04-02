package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173734 (10^n+62)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173734() {
    super(new long[] {-10, 11}, new long[] {8, 18});
  }
}
