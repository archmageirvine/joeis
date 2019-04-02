package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177702 Period 3: repeat [1, 1, 2].
 * @author Sean A. Irvine
 */
public class A177702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177702() {
    super(new long[] {1, 0, 0}, new long[] {1, 1, 2});
  }
}
