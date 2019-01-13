package irvine.oeis.a000;

import irvine.oeis.LinearRecurrence;

/**
 * A000570.
 * @author Sean A. Irvine
 */
public class A000570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000570() {
    super(new long[] {1, 1, 1, 0, 1}, new long[] {1, 1, 2, 4, 7});
  }
}
