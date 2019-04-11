package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198848 <code>11*6^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198848() {
    super(new long[] {-6, 7}, new long[] {10, 65});
  }
}
