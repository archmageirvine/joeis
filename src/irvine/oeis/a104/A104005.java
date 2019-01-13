package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104005.
 * @author Sean A. Irvine
 */
public class A104005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104005() {
    super(new long[] {-2, 3, 1}, new long[] {1, -1, 3});
  }
}
