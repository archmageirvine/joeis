package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017283 <code>a(n) = (10*n + 1)^3</code>.
 * @author Sean A. Irvine
 */
public class A017283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017283() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1331, 9261, 29791});
  }
}
