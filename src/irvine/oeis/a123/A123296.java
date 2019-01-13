package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123296.
 * @author Sean A. Irvine
 */
public class A123296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123296() {
    super(new long[] {1, -3, 3}, new long[] {0, 25, 75});
  }
}
