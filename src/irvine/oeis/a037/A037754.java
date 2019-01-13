package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037754.
 * @author Sean A. Irvine
 */
public class A037754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037754() {
    super(new long[] {-7, 8, -8, 8}, new long[] {2, 17, 120, 840});
  }
}
