package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172178.
 * @author Sean A. Irvine
 */
public class A172178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172178() {
    super(new long[] {-1, 2}, new long[] {1, 100});
  }
}
