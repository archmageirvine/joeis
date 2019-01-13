package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276917.
 * @author Sean A. Irvine
 */
public class A276917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276917() {
    super(new long[] {-6, 12, -1, -10, 4, 2}, new long[] {1, 6, 16, 31, 71, 106});
  }
}
