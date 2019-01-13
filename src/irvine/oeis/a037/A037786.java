package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037786.
 * @author Sean A. Irvine
 */
public class A037786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037786() {
    super(new long[] {-4, 5, -5, 5}, new long[] {3, 14, 56, 225});
  }
}
