package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127876 Integers of the form (x^3)/6 + (x^2)/2 + x + 1.
 * @author Sean A. Irvine
 */
public class A127876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127876() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 13, 61, 172});
  }
}
