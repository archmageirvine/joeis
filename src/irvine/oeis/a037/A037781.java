package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037781.
 * @author Sean A. Irvine
 */
public class A037781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037781() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {3, 19, 116, 696, 4179});
  }
}
