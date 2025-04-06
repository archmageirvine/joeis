package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017641 a(n) = 12*n + 10.
 * @author Sean A. Irvine
 */
public class A017641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017641() {
    super(new long[] {-1, 2}, new long[] {10, 22});
  }
}
