package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017201 a(n) = (9*n + 3)^5.
 * @author Sean A. Irvine
 */
public class A017201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017201() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 248832, 4084101, 24300000, 90224199, 254803968});
  }
}
