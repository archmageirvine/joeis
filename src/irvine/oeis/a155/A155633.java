package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155633 6^n+5^n-1.
 * @author Sean A. Irvine
 */
public class A155633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155633() {
    super(new long[] {30, -41, 12}, new long[] {1, 10, 60});
  }
}
