package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063217.
 * @author Sean A. Irvine
 */
public class A063217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063217() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {2, 5, 7, 12, 14});
  }
}
