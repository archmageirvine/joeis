package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167434.
 * @author Sean A. Irvine
 */
public class A167434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167434() {
    super(new long[] {-2, 1, 0}, new long[] {1, -4, 5});
  }
}
