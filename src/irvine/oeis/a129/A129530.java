package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129530 <code>(1/2)n(n-1)3^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A129530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129530() {
    super(new long[] {27, -27, 9}, new long[] {0, 0, 3});
  }
}
