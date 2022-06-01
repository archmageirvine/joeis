package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139742 a(n) = 11^n - 4^n.
 * @author Sean A. Irvine
 */
public class A139742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139742() {
    super(new long[] {-44, 15}, new long[] {0, 7});
  }
}
