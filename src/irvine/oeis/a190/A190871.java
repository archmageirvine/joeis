package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190871.
 * @author Sean A. Irvine
 */
public class A190871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190871() {
    super(new long[] {-11, 11}, new long[] {0, 1});
  }
}
