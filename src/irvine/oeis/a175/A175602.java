package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175602 <code>8*(10^n-3)</code>.
 * @author Sean A. Irvine
 */
public class A175602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175602() {
    super(new long[] {-10, 11}, new long[] {56, 776});
  }
}
