package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240828.
 * @author Sean A. Irvine
 */
public class A240828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240828() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 0, 2, 2, 4, 2});
  }
}
