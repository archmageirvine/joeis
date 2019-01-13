package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167487.
 * @author Sean A. Irvine
 */
public class A167487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167487() {
    super(new long[] {1, -3, 3}, new long[] {8, 10, 13});
  }
}
