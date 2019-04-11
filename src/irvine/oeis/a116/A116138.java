package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116138 <code>(n^2+n)*3^n</code>.
 * @author Sean A. Irvine
 */
public class A116138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116138() {
    super(new long[] {27, -27, 9}, new long[] {0, 6, 54});
  }
}
