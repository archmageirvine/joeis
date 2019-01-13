package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185039.
 * @author Sean A. Irvine
 */
public class A185039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185039() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 13, 28, 44});
  }
}
