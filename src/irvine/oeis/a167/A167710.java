package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167710.
 * @author Sean A. Irvine
 */
public class A167710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167710() {
    super(new long[] {-6, 3, 2}, new long[] {1, 5, 13});
  }
}
