package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049332.
 * @author Sean A. Irvine
 */
public class A049332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049332() {
    super(new long[] {-2, 1, 2}, new long[] {2, 4, 5});
  }
}
