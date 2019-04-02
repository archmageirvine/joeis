package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017563 (12n+3)^7.
 * @author Sean A. Irvine
 */
public class A017563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017563() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2187, 170859375, 10460353203L, 137231006679L, 897410677851L, 3938980639167L, 13348388671875L, 37725479487783L});
  }
}
