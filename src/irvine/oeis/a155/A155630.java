package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155630 a(n) = 9^n-4^n+1^n.
 * @author Sean A. Irvine
 */
public class A155630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155630() {
    super(new long[] {36, -49, 14}, new long[] {1, 6, 66});
  }
}
