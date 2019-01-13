package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287426.
 * @author Sean A. Irvine
 */
public class A287426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287426() {
    super(new long[] {2, -1, -5, 5}, new long[] {3, 14, 47, 164});
  }
}
