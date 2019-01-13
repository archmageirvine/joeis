package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127896.
 * @author Sean A. Irvine
 */
public class A127896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127896() {
    super(new long[] {-1, -3, -2}, new long[] {1, -2, 1});
  }
}
