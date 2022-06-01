package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198771 (11*5^n-1)/2.
 * @author Sean A. Irvine
 */
public class A198771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198771() {
    super(new long[] {-5, 6}, new long[] {5, 27});
  }
}
