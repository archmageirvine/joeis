package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198960 3*9^n-1.
 * @author Sean A. Irvine
 */
public class A198960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198960() {
    super(new long[] {-9, 10}, new long[] {2, 26});
  }
}
