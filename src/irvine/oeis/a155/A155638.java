package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155638 <code>11^n+5^n-1^n</code>.
 * @author Sean A. Irvine
 */
public class A155638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155638() {
    super(new long[] {55, -71, 17}, new long[] {1, 15, 145});
  }
}
