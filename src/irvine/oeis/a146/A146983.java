package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146983.
 * @author Sean A. Irvine
 */
public class A146983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146983() {
    super(new long[] {-1, 3, 3}, new long[] {1, 2, 10});
  }
}
