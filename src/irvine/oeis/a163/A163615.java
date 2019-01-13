package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163615.
 * @author Sean A. Irvine
 */
public class A163615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163615() {
    super(new long[] {-14, 8}, new long[] {1, 10});
  }
}
