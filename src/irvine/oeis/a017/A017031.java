package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017031.
 * @author Sean A. Irvine
 */
public class A017031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017031() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 1331, 5832, 15625});
  }
}
