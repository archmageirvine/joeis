package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037492.
 * @author Sean A. Irvine
 */
public class A037492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037492() {
    super(new long[] {-7, 1, 7}, new long[] {2, 15, 107});
  }
}
