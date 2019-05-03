package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075411 Squares of <code>A002276</code>.
 * @author Sean A. Irvine
 */
public class A075411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075411() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 4, 484});
  }
}
