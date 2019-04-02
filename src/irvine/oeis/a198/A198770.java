package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198770 11*5^n-1.
 * @author Sean A. Irvine
 */
public class A198770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198770() {
    super(new long[] {-5, 6}, new long[] {10, 54});
  }
}
