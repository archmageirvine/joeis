package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276123.
 * @author Sean A. Irvine
 */
public class A276123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276123() {
    super(new long[] {1, 0, -17, 0, 17, 0}, new long[] {1, 1, 1, 4, 10, 55});
  }
}
