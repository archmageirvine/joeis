package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017653 a(n) = 12*n + 11.
 * @author Sean A. Irvine
 */
public class A017653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017653() {
    super(new long[] {-1, 2}, new long[] {11, 23});
  }
}
