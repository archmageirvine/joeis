package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173766 <code>(10^n+11)/3</code>.
 * @author Sean A. Irvine
 */
public class A173766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173766() {
    super(new long[] {-10, 11}, new long[] {7, 37});
  }
}
