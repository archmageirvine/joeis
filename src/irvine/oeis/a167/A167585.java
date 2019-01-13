package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167585.
 * @author Sean A. Irvine
 */
public class A167585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167585() {
    super(new long[] {1, -3, 3}, new long[] {13, 41, 93});
  }
}
