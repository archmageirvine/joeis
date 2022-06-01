package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017145 a(n) = (8*n+6)^9.
 * @author Sean A. Irvine
 */
public class A017145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017145() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {10077696, 20661046784L, 1207269217792L, 19683000000000L, 165216101262848L, 922190162669056L, 3904305912313344L, 13537086546263552L, 40353607000000000L, 106868920913284608L});
  }
}
