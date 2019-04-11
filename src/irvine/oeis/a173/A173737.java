package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173737 <code>(10^n+44)/9</code> for <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A173737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173737() {
    super(new long[] {-10, 11}, new long[] {6, 16});
  }
}
