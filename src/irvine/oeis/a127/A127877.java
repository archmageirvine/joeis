package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127877 Integers of the form (x^4)/24 + (x^3)/6 + (x^2)/2 + x + 1 with x &gt; 0.
 * @author Sean A. Irvine
 */
public class A127877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127877() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {7, 115, 297, 1237, 2171, 5527, 8221, 16441, 22335});
  }
}
