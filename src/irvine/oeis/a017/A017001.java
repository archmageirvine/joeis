package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017001 <code>a(n) = (7*n + 1)^9</code>.
 * @author Sean A. Irvine
 */
public class A017001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017001() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 134217728, 38443359375L, 1207269217792L, 14507145975869L, 101559956668416L, 502592611936843L, 1953125000000000L, 6351461955384057L, 18014398509481984L});
  }
}
