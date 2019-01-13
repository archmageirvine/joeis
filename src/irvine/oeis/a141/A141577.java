package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141577.
 * @author Sean A. Irvine
 */
public class A141577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141577() {
    super(new long[] {-1, 3, -3, 1}, new long[] {-1, 0, 1, -1});
  }
}
