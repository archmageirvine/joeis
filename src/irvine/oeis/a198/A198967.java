package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198967 <code>10*9^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198967() {
    super(new long[] {-9, 10}, new long[] {9, 89});
  }
}
