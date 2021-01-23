package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017631 a(n) = (12*n+9)^3.
 * @author Sean A. Irvine
 */
public class A017631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017631() {
    super(new long[] {-1, 4, -6, 4}, new long[] {729, 9261, 35937, 91125});
  }
}
