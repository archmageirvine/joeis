package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084338.
 * @author Sean A. Irvine
 */
public class A084338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084338() {
    super(new long[] {1, 1, 0}, new long[] {1, 2, 3});
  }
}
