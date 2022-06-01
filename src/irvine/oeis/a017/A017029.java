package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017029 a(n) = 7*n + 4.
 * @author Sean A. Irvine
 */
public class A017029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017029() {
    super(new long[] {-1, 2}, new long[] {4, 11});
  }
}
