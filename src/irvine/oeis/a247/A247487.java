package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247487.
 * @author Sean A. Irvine
 */
public class A247487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247487() {
    super(new long[] {-16, 0, 0, 0, 1, 0, 0, 0}, new long[] {2, 1, 1, 1, 1, -1, -3, -7});
  }
}
