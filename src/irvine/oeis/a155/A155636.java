package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155636 9^n+5^n-1.
 * @author Sean A. Irvine
 */
public class A155636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155636() {
    super(new long[] {45, -59, 15}, new long[] {1, 13, 105});
  }
}
