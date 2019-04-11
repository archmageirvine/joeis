package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198765 <code>7*5^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198765() {
    super(new long[] {-5, 6}, new long[] {6, 34});
  }
}
