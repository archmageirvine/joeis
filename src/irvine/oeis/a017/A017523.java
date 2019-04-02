package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017523 a(n) = (12*n)^3.
 * @author Sean A. Irvine
 */
public class A017523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017523() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1728, 13824, 46656});
  }
}
