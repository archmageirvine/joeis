package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177046.
 * @author Sean A. Irvine
 */
public class A177046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177046() {
    super(new long[] {-1, 1, 1}, new long[] {16, 111, 143});
  }
}
