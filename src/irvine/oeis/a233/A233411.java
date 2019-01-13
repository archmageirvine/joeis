package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233411.
 * @author Sean A. Irvine
 */
public class A233411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233411() {
    super(new long[] {-4, 2, 2}, new long[] {0, 0, 2});
  }
}
