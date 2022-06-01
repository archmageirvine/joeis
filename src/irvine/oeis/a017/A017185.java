package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017185 9*n+2.
 * @author Sean A. Irvine
 */
public class A017185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017185() {
    super(new long[] {-1, 2}, new long[] {2, 11});
  }
}
