package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037589.
 * @author Sean A. Irvine
 */
public class A037589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037589() {
    super(new long[] {-10, 1, 10}, new long[] {3, 31, 313});
  }
}
