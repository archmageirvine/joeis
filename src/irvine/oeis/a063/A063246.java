package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063246.
 * @author Sean A. Irvine
 */
public class A063246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063246() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {4, 12, 22, 28, 38});
  }
}
