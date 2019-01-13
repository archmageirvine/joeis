package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081017.
 * @author Sean A. Irvine
 */
public class A081017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081017() {
    super(new long[] {1, -8, 8}, new long[] {0, 10, 75});
  }
}
