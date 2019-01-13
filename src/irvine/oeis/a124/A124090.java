package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124090.
 * @author Sean A. Irvine
 */
public class A124090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124090() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 7, 35, 119, 329, 791, 1715, 3431});
  }
}
