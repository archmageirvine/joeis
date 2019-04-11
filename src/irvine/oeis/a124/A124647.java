package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124647 <code>a(n) = (2n + 1)*3^n</code>.
 * @author Sean A. Irvine
 */
public class A124647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124647() {
    super(new long[] {-9, 6}, new long[] {1, 9});
  }
}
