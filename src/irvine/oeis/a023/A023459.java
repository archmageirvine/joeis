package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023459 <code>n-17</code>.
 * @author Sean A. Irvine
 */
public class A023459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023459() {
    super(new long[] {-1, 2}, new long[] {-17, -16});
  }
}
