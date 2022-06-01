package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017037 a(n) = (7*n + 4)^9.
 * @author Sean A. Irvine
 */
public class A017037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017037() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 2357947691L, 198359290368L, 3814697265625L, 35184372088832L, 208728361158759L, 922190162669056L, 3299763591802133L, 10077696000000000L, 27206534396294947L});
  }
}
