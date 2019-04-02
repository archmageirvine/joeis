package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017167 a(n) = (9*n)^7.
 * @author Sean A. Irvine
 */
public class A017167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017167() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 4782969, 612220032, 10460353203L, 78364164096L, 373669453125L, 1338925209984L, 3938980639167L});
  }
}
