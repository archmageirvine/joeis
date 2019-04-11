package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017359 <code>a(n) = (10*n + 7)^7</code>.
 * @author Sean A. Irvine
 */
public class A017359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017359() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {823543, 410338673, 10460353203L, 94931877133L, 506623120463L, 1954897493193L, 6060711605323L, 16048523266853L});
  }
}
