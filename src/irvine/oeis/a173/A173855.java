package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173855 <code>a(n) =</code> A173039(n+4) - A173039(n+1).
 * @author Sean A. Irvine
 */
public class A173855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173855() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {8, 4, 24, 40, 12, 56});
  }
}
