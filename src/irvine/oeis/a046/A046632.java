package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046632.
 * @author Sean A. Irvine
 */
public class A046632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046632() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 3, 10, 37});
  }
}
