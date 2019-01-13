package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017379.
 * @author Sean A. Irvine
 */
public class A017379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017379() {
    super(new long[] {-1, 4, -6, 4}, new long[] {729, 6859, 24389, 59319});
  }
}
