package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198693 3*4^n-1.
 * @author Sean A. Irvine
 */
public class A198693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198693() {
    super(new long[] {-4, 5}, new long[] {2, 11});
  }
}
