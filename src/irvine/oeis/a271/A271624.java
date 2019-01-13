package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271624.
 * @author Sean A. Irvine
 */
public class A271624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271624() {
    super(new long[] {1, -3, 3}, new long[] {2, 4, 10});
  }
}
