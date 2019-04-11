package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036293 <code>a(n) = n * 7^n</code>.
 * @author Sean A. Irvine
 */
public class A036293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036293() {
    super(new long[] {-49, 14}, new long[] {0, 7});
  }
}
