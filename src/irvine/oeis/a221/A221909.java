package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221909.
 * @author Sean A. Irvine
 */
public class A221909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221909() {
    super(new long[] {7, -15, 9}, new long[] {1, 14, 63});
  }
}
