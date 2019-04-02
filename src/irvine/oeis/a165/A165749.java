package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165749 a(n) = (9/5)*(1+4*(-9)^(n-1)).
 * @author Sean A. Irvine
 */
public class A165749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165749() {
    super(new long[] {9, -8}, new long[] {1, 9});
  }
}
