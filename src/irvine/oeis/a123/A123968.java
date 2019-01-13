package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123968.
 * @author Sean A. Irvine
 */
public class A123968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123968() {
    super(new long[] {1, -3, 3}, new long[] {-2, 1, 6});
  }
}
