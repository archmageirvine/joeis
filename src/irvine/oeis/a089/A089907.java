package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089907.
 * @author Sean A. Irvine
 */
public class A089907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089907() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 21, 483, 7785});
  }
}
