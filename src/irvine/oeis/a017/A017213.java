package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017213 a(n) = (9*n + 4)^5.
 * @author Sean A. Irvine
 */
public class A017213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017213() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 371293, 5153632, 28629151, 102400000, 282475249});
  }
}
