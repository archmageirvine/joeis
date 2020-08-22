package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034943 Binomial transform of Padovan sequence A000931.
 * @author Sean A. Irvine
 */
public class A034943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034943() {
    super(new long[] {1, -2, 3}, new long[] {1, 1, 1});
  }
}
