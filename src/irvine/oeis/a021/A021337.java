package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021337 Decimal expansion of <code>1/333</code>.
 * @author Sean A. Irvine
 */
public class A021337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021337() {
    super(new long[] {1, 0, 0}, new long[] {0, 0, 3});
  }
}
