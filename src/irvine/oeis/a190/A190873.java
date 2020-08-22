package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190873 a(n) = 12*a(n-1) - 12*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190873() {
    super(new long[] {-12, 12}, new long[] {0, 1});
  }
}
