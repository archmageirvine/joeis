package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155630 <code>9^n-4^n+1^n</code>.
 * @author Sean A. Irvine
 */
public class A155630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155630() {
    super(new long[] {36, -49, 14}, new long[] {1, 6, 66});
  }
}
