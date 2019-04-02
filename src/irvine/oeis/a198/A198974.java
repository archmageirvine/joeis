package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198974 2*11^n-1.
 * @author Sean A. Irvine
 */
public class A198974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198974() {
    super(new long[] {-11, 12}, new long[] {1, 21});
  }
}
