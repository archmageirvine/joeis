package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198965 7*9^n-1.
 * @author Sean A. Irvine
 */
public class A198965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198965() {
    super(new long[] {-9, 10}, new long[] {6, 62});
  }
}
