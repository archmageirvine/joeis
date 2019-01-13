package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063197.
 * @author Sean A. Irvine
 */
public class A063197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063197() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 1, 3, 3});
  }
}
