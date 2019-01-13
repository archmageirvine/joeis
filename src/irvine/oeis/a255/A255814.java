package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255814.
 * @author Sean A. Irvine
 */
public class A255814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255814() {
    super(new long[] {4, -4, 5}, new long[] {1, 4, 17});
  }
}
