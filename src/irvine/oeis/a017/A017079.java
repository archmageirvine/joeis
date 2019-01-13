package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017079.
 * @author Sean A. Irvine
 */
public class A017079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017079() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 729, 4913, 15625});
  }
}
