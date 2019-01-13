package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061600.
 * @author Sean A. Irvine
 */
public class A061600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061600() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1, 7, 25});
  }
}
