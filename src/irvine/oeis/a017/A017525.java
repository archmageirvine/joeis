package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017525 a(n) = (12*n)^5.
 * @author Sean A. Irvine
 */
public class A017525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017525() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 248832, 7962624, 60466176, 254803968, 777600000});
  }
}
