package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075151 a(n)=L(n)^2*C(n), L(n)=Lucas numbers (A000032), C(n)=reflected Lucas numbers (comment to A061084).
 * @author Sean A. Irvine
 */
public class A075151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075151() {
    super(new long[] {-1, 3, 6, -3}, new long[] {8, -1, 27, -64});
  }
}
