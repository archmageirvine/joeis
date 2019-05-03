package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178134 <code>Sum_{m=0..(n-1)/2} A176263(n-m-1, m)</code>.
 * @author Sean A. Irvine
 */
public class A178134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178134() {
    super(new long[] {25, 5, -25, -4, -6, -2, 7, 1}, new long[] {0, 1, 1, 2, -3, -2, -32, -81});
  }
}
